package com.example.curiosity_app.model;

import java.util.List;

public class Tag {

    private Long id;

    private String nameTag;

    private boolean key;

    private List<Curiosity> arrayCuriosity;

    public Tag(Long id, String nameTag, boolean key, List<Curiosity> arrayCuriosity) {
        this.id = id;
        this.nameTag = nameTag;
        this.key = key;
        this.arrayCuriosity = arrayCuriosity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameTag() {
        return nameTag;
    }

    public void setNameTag(String nameTag) {
        this.nameTag = nameTag;
    }

    public boolean isKey() {
        return key;
    }

    public void setKey(boolean key) {
        this.key = key;
    }

    public List<Curiosity> getArrayCuriosity() {
        return arrayCuriosity;
    }

    public void setArrayCuriosity(List<Curiosity> arrayCuriosity) {
        this.arrayCuriosity = arrayCuriosity;
    }
}
