package com.greptilian.javaone2014bof5619.starwars;

public class Suspect {

    private String name;
    private Type type;
    private String id;

    public Suspect(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        if (type.equals(Type.JEDI)) {
            throw new RuntimeException("Jedi mind trick!");
        } else {
            return id;
        }
    }

    public enum Type {

        JEDI, OTHER
    }

}
