package com.greptilian.javaone2014bof5619.starwars;

import java.util.ArrayList;
import java.util.List;

public class Ship {

    private String name;
    private Type type;
    private List<Suspect> suspects = new ArrayList<Suspect>();

    public Ship(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public List<Suspect> getSuspects() {
        return suspects;
    }

    public enum Type {

        SMUGGLING, OTHER
    }

}
