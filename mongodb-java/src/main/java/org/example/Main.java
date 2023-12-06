package org.example;

import com.mongodb.*;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.example.db.Connection;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    String user = "krodriguezcondori34";
    String password = "S7ifvwfG5YD5bVRP";
    String connectionString = "mongodb+srv://krodriguezcondori34:S7ifvwfG5YD5bVRP@java.rlcxzop.mongodb.net";
    //String connectionString = System.getProperty("mongodb.uri");
    try (MongoClient mongoClient = MongoClients.create(connectionString)) {
      List<Document> databases = mongoClient.listDatabases().into(new ArrayList<>());
      databases.forEach(db -> System.out.println(db.toJson()));
    }
  }
}
