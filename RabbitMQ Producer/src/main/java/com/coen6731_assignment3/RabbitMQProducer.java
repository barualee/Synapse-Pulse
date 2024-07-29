package com.coen6731_assignment3;

import java.util.List;

import org.bson.Document;

import com.mongodb.client.MongoCursor;

public class RabbitMQProducer {
    
    public static void main(String[] args) throws Exception {
      
      // configuration function to be run only the first time.
      // SetupExchangeQueues setupExchangeQueues = new SetupExchangeQueues();
      // setupExchangeQueues.setupExchange();
      // setupExchangeQueues.setupQueues();

      List <String> collectionsList = List.of("EduCostStatQueryOne", "EduCostStatQueryTwo", "EduCostStatQueryThree", "EduCostStatQueryFour", "EduCostStatQueryFive");

      for (String collection: collectionsList) {
        
        //fetch each of the collection messages
        MongoDBQuery mongoDBQuery = new MongoDBQuery();
        MongoCursor<Document> cursor = mongoDBQuery.getQueryResults(collection);
        
        //send for publish.
        Producer producer = new Producer();
        producer.produce(collection, cursor);
        System.out.println("");
      }
    }
    
}
