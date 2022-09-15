package model.trainer;

public class GymBadge {
    private String name;
    private String description;
    private String spriteUrl;

    public GymBadge(String name, String description, String spriteUrl) {
        this.name = name;
        this.description = description;
        this.spriteUrl = spriteUrl;
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

    public String getSpriteUrl() {
        return spriteUrl;
    }

    public void setSpriteUrl(String spriteUrl) {
        this.spriteUrl = spriteUrl;
    }
}
