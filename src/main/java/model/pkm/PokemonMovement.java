package model.pkm;

import enums.MovementCategory;
import enums.PokemonType;

public class PokemonMovement {
    private String name;
    private String description;
    private PokemonType type;
    private int pp;
    private MovementCategory category;
    private int power;
    private int accuracy;
    private boolean makesContact;
    private boolean isHm;

    public PokemonMovement(String name, String description, PokemonType type, int pp, MovementCategory category, int power, int accuracy, boolean makesContact, boolean isHm) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.pp = pp;
        this.category = category;
        this.power = power;
        this.accuracy = accuracy;
        this.makesContact = makesContact;
        this.isHm = isHm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PokemonType getType() {
        return type;
    }

    public void setType(PokemonType type) {
        this.type = type;
    }

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public MovementCategory getCategory() {
        return category;
    }

    public void setCategory(MovementCategory category) {
        this.category = category;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public boolean isMakesContact() {
        return makesContact;
    }

    public void setMakesContact(boolean makesContact) {
        this.makesContact = makesContact;
    }

    public boolean isHm() {
        return isHm;
    }

    public void setHm(boolean hm) {
        isHm = hm;
    }
}
