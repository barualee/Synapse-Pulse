package com.coen6731_assignment3;
import org.bson.Document;

import com.mongodb.client.MongoCursor;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class Producer {

    public void produce(String collectionName, MongoCursor<Document> cursor) throws Exception {
        // Connection details
        String host = "ec2-3-128-78-69.us-east-2.compute.amazonaws.com";
        String exchangeName = "myTopicExchange";

        // Create connection factory
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost(host);
        factory.setPort(5672);

        // Create connection and channel
        try (Connection connection = factory.newConnection();
                Channel channel = connection.createChannel()) {
            
            // Loop through documents and send them as messages
            while (cursor.hasNext()) {
                Document document = cursor.next();
                String message = document.toJson();  // Convert document to JSON string
                
                //build routing key
                RoutingConfigurations routingConfigurations = new RoutingConfigurations();
                String Key = routingConfigurations.routing(document, collectionName);
                if (Key == null) {
                    continue;
                } else {
                    // Send the message with routing key
                    channel.basicPublish(exchangeName, Key, null, message.getBytes("UTF-8"));
                    System.out.println("Message sent: " + message);
                    System.out.println("Message sent with Key: " + Key);
                }

            }
        }
    }

}
