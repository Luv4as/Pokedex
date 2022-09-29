package com.pokedex.pokedex.firebase;

import com.google.firebase.database.*;
import com.google.firebase.database.core.Context;
import com.google.gson.Gson;
import com.pokedex.pokedex.data.PokemonData;
import com.pokedex.pokedex.data.UsersData;
import com.pokedex.pokedex.model.pkm.Pokemon;
import com.pokedex.pokedex.model.pkm.PokemonMovementApi;
import com.pokedex.pokedex.model.pkm.PokemonType;
import com.pokedex.pokedex.model.pkm.PokemonTypeApi;
import com.pokedex.pokedex.model.trainer.PokemonTrainer;
import com.squareup.picasso.Picasso;
import javafx.scene.image.ImageView;

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
                    Pokemon pk = new Pokemon(child, "", "", new ArrayList<PokemonTypeApi>(), new ArrayList<PokemonMovementApi>(), null);
                    PokemonData.getInstance().addPokemonInList(pk);
                }

                try {
                    switch (key) {
                        case "name":
                            PokemonData.getInstance().getPokemonInListById(child).setName(str);
                            System.out.println(PokemonData.getInstance().getPokemonInListById(child).getName());
                            break;
                        case "sprite":
                            PokemonData.getInstance().getPokemonInListById(child).setSprite(str);
                            System.out.println(PokemonData.getInstance().getPokemonInListById(child).getSprite());
                            break;
                        case "type":
                            String[] types = str.split("},");
                            for (int i = 0; i < types.length; i++) {
                                PokemonTypeApi typeApi = new PokemonTypeApi(i, new PokemonType("", ""));
                                typeApi.getType().setName(types[i].split("=")[3].split(",")[0]);
                                typeApi.getType().setUrl("https://pokeapi.co/api/v2/type/" + types[i].split("/")[6]);
                                PokemonData.getInstance().getPokemonInListById(child).addType(typeApi);
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

    public static String GetUser(String parent, String child, String key) {
        final String[] value = {""};
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference(parent).child(String.valueOf(child));

        ref.child(key).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String str = dataSnapshot.getValue().toString();

//                if(UsersData.getInstance().getUsersInListById(child) == null) {
//                    ArrayList<Boolean> badges = new ArrayList<Boolean>();
//                    badges.add(false); badges.add(false);
//                    badges.add(false); badges.add(false);
//                    badges.add(false); badges.add(false);
//                    badges.add(false); badges.add(false);
//                    PokemonTrainer user = new PokemonTrainer(0, 0, 0, 0, 0, "", "", "", null, badges);
//                    UsersData.getInstance().addUserInList(user);
//                }

                try {
                    switch (key) {
                        case "nPokCapt":
                            System.out.println(str);
                            UsersData.getInstance().getUsersInListById(child).setnPokCapt(Integer.parseInt(str));
                            System.out.println( UsersData.getInstance().getUsersInListById(child).getnPokCapt());
                            break;
                        case "nBatFeitas":
                            System.out.println(str);
                            UsersData.getInstance().getUsersInListById(child).setnBatFeitas(Integer.parseInt(str));
                            System.out.println( UsersData.getInstance().getUsersInListById(child).getnBatFeitas());
                            break;
                        case "nVit":
                            System.out.println(str);
                            UsersData.getInstance().getUsersInListById(child).setnVit(Integer.parseInt(str));
                            System.out.println( UsersData.getInstance().getUsersInListById(child).getnVit());
                            break;
                        case "nDer":
                            System.out.println(str);
                            UsersData.getInstance().getUsersInListById(child).setnDer(Integer.parseInt(str));
                            System.out.println( UsersData.getInstance().getUsersInListById(child).getnDer());
                            break;
                        case "idTrainerCard":
                            System.out.println(str);
                            UsersData.getInstance().getUsersInListById(child).setIdTrainerCard(str);
                            System.out.println( UsersData.getInstance().getUsersInListById(child).getIdTrainerCard());
                            break;
                        case "nickname":
                            System.out.println(str);
                            UsersData.getInstance().getUsersInListById(child).setNickname(str);
                            System.out.println( UsersData.getInstance().getUsersInListById(child).getNickname());
                            break;
                        case "urlImage":
                            System.out.println(str);
                            UsersData.getInstance().getUsersInListById(child).setUrlImage(str);
                            System.out.println( UsersData.getInstance().getUsersInListById(child).getUrlImage());
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