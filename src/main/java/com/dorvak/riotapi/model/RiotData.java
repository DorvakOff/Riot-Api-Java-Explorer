package com.dorvak.riotapi.model;

public class RiotData {

    private String id;
    private String name;
    private Image image;


    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Image getImage() {
        return image;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", image=" + image +
                '}';
    }
}
