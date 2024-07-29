package com.coen6731_assignment3;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;

public class Consumer {
        
    public void consume(String queueName, String bindingKey) throws Exception{
        // Connection details
        String host = "ec2-3-128-78-69.us-east-2.compute.amazonaws.com";

        // Create connection factory
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost(host);
        factory.setPort(5672);

        //Create connection and channel
        try (Connection connection = factory.newConnection();
            Channel channel = connection.createChannel()) {

            // Define a callback for received messages
            DeliverCallback deliverCallback = (consumerTag, message) -> {
                String receivedMessage = new String(message.getBody(), "UTF-8");
                System.out.println("Received message: " + receivedMessage);
            };

            // Consume messages from the queue
            channel.basicConsume(queueName, true, deliverCallback, consumerTag -> {});
            System.out.println("Waiting for messages: " + bindingKey);
        }
    }
}
