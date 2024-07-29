package com.coen6731_assignment3;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class MongoDBQuery {
    public MongoCursor<Document> getQueryResults(String collectionName) {
        // MongoDB connection string
        String connectionString = "mongodb+srv://baruanishant97:GiJefwxCf1Kad4wP@cluster01.btotzpc.mongodb.net/?retryWrites=true&w=majority&appName=Cluster01";

        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            
            // Get reference to the database
            MongoDatabase database = mongoClient.getDatabase("COEN_6731_DB");

            MongoCollection<Document> collection = database.getCollection(collectionName);

            // Find all documents in the collection
            MongoCursor<Document> cursor = collection.find().iterator();
            return cursor;
        } catch (Exception e){
            System.out.println("Error occured!");
        }
        return null;
    }
}
