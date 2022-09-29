package com.pokedex.pokedex.data;

import com.google.firebase.remoteconfig.User;
import com.pokedex.pokedex.api.ApiClient;
import com.pokedex.pokedex.api.ApiInterface;
import com.pokedex.pokedex.firebase.DatabaseInstance;
import com.pokedex.pokedex.model.pkm.Pokemon;
import com.pokedex.pokedex.model.trainer.PokemonTrainer;

import java.util.ArrayList;

public class UsersData {
    private ArrayList<PokemonTrainer> trainersList = new ArrayList<PokemonTrainer>();
    private String currentUserId = "example";

    private static UsersData instance;

    public static UsersData getInstance() {
        if(instance == null) {
            instance = new UsersData();
        }
        return instance;
    }

    public UsersData() {
        this.getAllUsers();
    }

    public void getAllUsers() {
        if(trainersList.isEmpty()) {
            try {
                GetUsersOnDatabase();
            } catch (Exception err) {
                System.out.println("Deu errorrr");
            }
        }
    }

    public void GetUsersOnDatabase() {
        for (int i = 0; i < 30; i++) {
            DatabaseInstance.GetUser("users", i, "idTrainerCard");
        }
    }

    public PokemonTrainer getUsersInList(int index) {
        return UsersData.getInstance().getTrainersList().get(index);
    }

    public PokemonTrainer getUsersInListById(String id) {
        for (int i = 0; i < UsersData.getInstance().getTrainersList().size(); i++) {
            if(UsersData.getInstance().getUsersInList(i).getIdTrainerCard().equals(id)) {
                return UsersData.getInstance().getUsersInList(i);
            }
        }
        return null;
    }

    public void addUserInList(PokemonTrainer trainer) {
        this.trainersList.add(trainer);
    }

    public ArrayList<PokemonTrainer> getTrainersList() {
        return trainersList;
    }

    public String getCurrentUserId() {
        return currentUserId;
    }

    public void setCurrentUserId(String currentUserId) {
        this.currentUserId = currentUserId;
    }
}
