package com.pokedex.pokedex.data;

import com.pokedex.pokedex.api.ApiClient;
import com.pokedex.pokedex.api.ApiInterface;
import com.pokedex.pokedex.firebase.DatabaseInstance;
import com.pokedex.pokedex.model.pkm.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class RegBattleData {

    private List<Boolean> buttonsVisible = new ArrayList<Boolean>();
    private List<Integer> pokemonsInBattle = new ArrayList<Integer>();
    private static RegBattleData instance;

    public static RegBattleData getInstance() {
        if(instance == null) {
            instance = new RegBattleData();
            RegBattleData.getInstance().buttonsVisible.add(false);
            RegBattleData.getInstance().buttonsVisible.add(false);
            RegBattleData.getInstance().pokemonsInBattle.add(1);
            RegBattleData.getInstance().pokemonsInBattle.add(1);
        }
        return instance;
    }

    RegBattleData() {

    }

    public List<Boolean> getButtonsVisible() {
        return buttonsVisible;
    }

    public void setButtonsVisible(Boolean button, int index) {
        this.buttonsVisible.set(index, button);
    }

    public List<Integer> getPokemonsInBattle() {
        return pokemonsInBattle;
    }

    public void setPokemonsInBattle(Integer pokemonsInBattle, Integer index) {
        this.pokemonsInBattle.set(index, pokemonsInBattle);
    }
}
