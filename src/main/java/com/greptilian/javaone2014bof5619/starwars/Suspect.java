package com.greptilian.javaone2014bof5619.starwars;

public class Suspect {

    private String name;
    private Type type;
    private String id;

    public Suspect(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        if (type.equals(Type.JEDI)) {
            throw new RuntimeException("Jedi mind trick!");
        } else {
            return id;
        }
    }

    public void setId(String id) {
        this.id = id;
    }

    public enum Type {

        JEDI, OTHER
    }

}
