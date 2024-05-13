package controladores;

import org.bson.Document;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class UsuarioDB {
    private final MongoCollection<Document> collection;

    public UsuarioDB(){
        String connectionString = "mongodb+srv://yatziri200309:HNeqlZEllY96fRB5@iswtw.y7m1jgf.mongodb.net/?retryWrites=true&w=majority&appName=ISWTW";
        ConnectionString connString = new ConnectionString(connectionString);
        MongoClientSettings settings = MongoClientSettings.builder()
            .applyConnectionString(connString)
            .build();

        MongoClient mongoClient = MongoClients.create(settings);

        MongoDatabase database = mongoClient.getDatabase("sessionlogin");
        collection = database.getCollection("coleccionusuario");
    }

    public Document obtenerUsuarioPorCredenciales(String usuario, String contrasena) {
        Document query = new Document("usuario", usuario).append("contrasena", contrasena);
        return collection.find(query).first();
    }

    public MongoCollection<Document> getCollection() {
        return collection;
    }
}
