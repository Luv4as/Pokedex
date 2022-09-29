package com.pokedex.pokedex.model.pkm;

public class PokemonStatusApi {
    private int base_stat;

    private int effort;

    private PokemonStatus status;

    public PokemonStatusApi (int base_stat, int effort, PokemonStatus status) {
        this.base_stat = base_stat;
        this.effort = effort;
        this.status = status;
    }

    public PokemonStatus getStatus() {
        return status;
    }

    public void setStatus(PokemonStatus status) {
        this.status = status;
    }

    public int getBase_stat() {
        return base_stat;
    }

    public void setBase_stat(int base_stat) {
        this.base_stat = base_stat;
    }

    public int getEffort() {
        return effort;
    }

    public void setEffort(int effort) {
        this.effort = effort;
    }
}
