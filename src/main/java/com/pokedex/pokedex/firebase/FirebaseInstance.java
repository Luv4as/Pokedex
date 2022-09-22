package com.pokedex.pokedex.firebase;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;

public class FirebaseInstance {
    public static DatabaseReference db;

    public static void init() throws IOException {
        FileInputStream serviceAccount =
                new FileInputStream("adilson_fabiano/filho_de_adilson_fabiano.json");

        FirebaseOptions options = FirebaseOptions.builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl("https://pokedex-ip2-default-rtdb.firebaseio.com")
                .build();

        FirebaseApp.initializeApp(Objects.requireNonNull(options));
        FirebaseInstance.db = FirebaseDatabase.getInstance().getReference();
    }
}
