package com.coen6731_assignment3;

import com.rabbitmq.client.Connection;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.ConnectionFactory;

public class SetupExchangeQueues {

    // Connection details
    private final String host = "ec2-3-128-78-69.us-east-2.compute.amazonaws.com";
    private final String exchangeName = "myTopicExchange";

    public void setupExchange() throws IOException, TimeoutException {

        // Create connection factory
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost(host);
        factory.setPort(5672);

        // Create connection and channel
        try (Connection connection = factory.newConnection();
            Channel channel = connection.createChannel()) {

            // Declare the exchange as topic
            channel.exchangeDeclare(exchangeName, "topic");
        }
    }

    public void setupQueues() throws IOException, TimeoutException {
        
        Map<String, String> queueBinding = new HashMap<>();
        
        queueBinding.put("myQueue1", "Cost.*.*.*.*");
        queueBinding.put("myQueue2", "Top5-Expensive.*.*.*");
        queueBinding.put("myQueue3", "Top5-Economical.*.*.*");
        queueBinding.put("myQueue4", "Top5-HighestGrow.*.*.*");
        queueBinding.put("myQueue5", "AverageExpense.*.*.*");

        // Create connection factory
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost(host);
        factory.setPort(5672);

        // Create connection and channel
        try (Connection connection = factory.newConnection();
            Channel channel = connection.createChannel()) {
            
            // Iterate through keys using entrySet()
            for (Entry<String, String> entry : queueBinding.entrySet()) {
            
                // Declare the queue (optional, only if it doesn't exist already)
                channel.queueDeclare(entry.getKey(), false, false, false, null);

                // Bind the queue to the exchange with a routing key pattern
                channel.queueBind(entry.getKey(), exchangeName, entry.getValue());
            }
        
        }
    }
}
