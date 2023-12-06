package org.example.db;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.bson.BsonDocument;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;
public class Connection {
    private String connectionString;

    public Connection(String connectionString) {
        this.connectionString = connectionString;
    }

    public void connect() {
        try (MongoClient mongoClient = MongoClients.create(this.connectionString)){
          List<Document> databases = mongoClient.listDatabases().into(new ArrayList<>());
          databases.forEach(db -> System.out.println(db.toJson()));
        }
    }

}
