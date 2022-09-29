package com.pokedex.pokedex.firebase;

import com.google.firebase.database.*;
import com.google.gson.Gson;
import com.pokedex.pokedex.data.PokemonData;
import com.pokedex.pokedex.data.UsersData;
import com.pokedex.pokedex.model.pkm.*;
import com.pokedex.pokedex.model.trainer.PokemonTrainer;

import java.util.ArrayList;
import java.util.Optional;

public class DatabaseInstance {
    public static void Set(String path, Object value) {
        FirebaseInstance.db.child(path).setValueAsync(value);
    }
    public static void Set(String path, int value) {
        FirebaseInstance.db.child(path).setValueAsync(value);
    }

    public static String GetPokemon(String parent, int child, String key) {
        final String[] value = {""};
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference(parent).child(String.valueOf(child));

        ref.child(key).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String str = dataSnapshot.getValue().toString();

                if(PokemonData.getInstance().getPokemonInListById(child) == null) {
                    Pokemon pk = new Pokemon(child, "", "", new ArrayList<PokemonTypeApi>(), new ArrayList<PokemonMovementApi>(), new ArrayList<PokemonStatusApi>() ,null);
                    PokemonData.getInstance().addPokemonInList(pk);
                }

                try {
                    switch (key) {
                        case "name":
                            PokemonData.getInstance().getPokemonInListById(child).setName(str);
                            break;
                        case "sprite":
                            PokemonData.getInstance().getPokemonInListById(child).setSprite(str);
                            break;
                        case "type":
                            String[] types = str.split("},");
                            for (int i = 0; i < types.length; i++) {
                                PokemonTypeApi typeApi = new PokemonTypeApi(i, new PokemonType("", ""));
                                typeApi.getType().setName(types[i].split("=")[3].split(",")[0]);
                                typeApi.getType().setUrl("https://pokeapi.co/api/v2/type/" + types[i].split("/")[6]);
                                PokemonData.getInstance().getPokemonInListById(child).addType(typeApi);
                            }
                        case "stats":
                            String[] statusses = str.split("},");
                            for (int i = 0; i < statusses.length; i++) {
                                PokemonStatusApi statusApi = new PokemonStatusApi(0,0, null);
                                statusApi.setBase_stat(Integer.parseInt(statusses[i].split("=")[1].split(",")[0]));
                                PokemonData.getInstance().getPokemonInListById(child).addStats(statusApi);
                                System.out.println(str);
                            }
                            break;

                    }
                } catch (Exception error) {
                    System.out.println("error: " + error);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                System.out.println("The read failed: " + databaseError.getCode());
            }
        });

        return value[0];
    }

    public static String GetUser(String parent, int child, String key) {
        final String[] value = {""};
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference(parent).child(String.valueOf(child));

        ref.child(key).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String str = dataSnapshot.getValue().toString();

                if(key.equals("idTrainerCard") && UsersData.getInstance().getUsersInListById(str) == null) {
                    ArrayList<Boolean> badges = new ArrayList<Boolean>();
                    badges.add(false); badges.add(false);
                    badges.add(false); badges.add(false);
                    badges.add(false); badges.add(false);
                    badges.add(false); badges.add(false);
                    PokemonTrainer user = new PokemonTrainer(0, 0, 0, 0, 0, "", "test", "", null, badges);
                    UsersData.getInstance().addUserInList(user);
                }

                try {
                    switch (key) {
                        case "nPokCapt":
                            UsersData.getInstance().getUsersInList(child).setnPokCapt(Integer.parseInt(str));
                            break;
                        case "nBatFeitas":
                            UsersData.getInstance().getUsersInList(child).setnBatFeitas(Integer.parseInt(str));
                            break;
                        case "nVit":
                            UsersData.getInstance().getUsersInList(child).setnVit(Integer.parseInt(str));
                            break;
                        case "nDer":
                            UsersData.getInstance().getUsersInList(child).setnDer(Integer.parseInt(str));
                            break;
                        case "nFugas":
                            UsersData.getInstance().getUsersInList(child).setnFugas(Integer.parseInt(str));
                            break;
                        case "idTrainerCard":
                            UsersData.getInstance().getUsersInList(child).setIdTrainerCard(str);
                            DatabaseInstance.GetUser("users", child, "nBatFeitas");
                            DatabaseInstance.GetUser("users", child, "nDer");
                            DatabaseInstance.GetUser("users", child, "nFugas");
                            DatabaseInstance.GetUser("users", child, "nPokCapt");
                            DatabaseInstance.GetUser("users", child, "nVit");
                            DatabaseInstance.GetUser("users", child, "nickname");
                            DatabaseInstance.GetUser("users", child, "urlImage");
                            break;
                        case "nickname":
                            UsersData.getInstance().getUsersInList(child).setNickname(str);
                            break;
                        case "urlImage":
                            UsersData.getInstance().getUsersInList(child).setUrlImage(str);
                            break;

                    }
                } catch (Exception error) {
                    System.out.println("error: " + error);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                System.out.println("The read failed: " + databaseError.getCode());
            }
        });

        return value[0];
    }
}