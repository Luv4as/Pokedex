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
        DatabaseInstance.GetUser("users", "example", "idTrainerCard");
        DatabaseInstance.GetUser("users", "example", "nBatFeitas");
        DatabaseInstance.GetUser("users", "example", "nDer");
        DatabaseInstance.GetUser("users", "example", "nFugas");
        DatabaseInstance.GetUser("users", "example", "nPokCapt");
        DatabaseInstance.GetUser("users", "example", "nVit");
        DatabaseInstance.GetUser("users", "example", "nickname");
        DatabaseInstance.GetUser("users", "example", "urlImage");
    }

    public PokemonTrainer getUsersInList(int index) {
        return trainersList.get(index);
    }

    public PokemonTrainer getUsersInListById(String id) {
        System.out.println("tam: " + trainersList.size());
        for (int i = 0; i < trainersList.size(); i++) {
            System.out.println(getUsersInList(i).getIdTrainerCard());
            if(getUsersInList(i).getIdTrainerCard() == id) {
                return getUsersInList(i);
            }
        }
        return null;
    }

    public void addUserInList(PokemonTrainer trainer) {
        this.trainersList.add(trainer);
    }
}
