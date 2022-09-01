public class PokemonItem {
    private String name;
    private String description;
    private ItemCategory type;

    PokemonItem(String name, String description, ItemCategory type) {
        this.name = name;
        this.description = description;
        this.type = type;
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

    public ItemCategory getType() {
        return type;
    }

    public void setType(ItemCategory type) {
        this.type = type;
    }
}
