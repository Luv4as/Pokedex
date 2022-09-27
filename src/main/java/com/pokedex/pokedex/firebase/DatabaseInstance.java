package com.pokedex.pokedex.firebase;

import com.google.firebase.database.*;
import com.pokedex.pokedex.model.pkm.Pokemon;

public class DatabaseInstance {
    public static void Set(String path, Object value) {
        FirebaseInstance.db.child(path).setValueAsync(value);
    }
    public static void Set(String path, int value) {
        FirebaseInstance.db.child(path).setValueAsync(value);
    }

    public static String Get(String parent, String child, String key) {
        final String[] value = {""};
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference(parent).child(child);

        ref.child(key).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String str = dataSnapshot.getValue().toString();
                System.out.println(str);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                System.out.println("The read failed: " + databaseError.getCode());
            }
        });

        return value[0];
    }
}
