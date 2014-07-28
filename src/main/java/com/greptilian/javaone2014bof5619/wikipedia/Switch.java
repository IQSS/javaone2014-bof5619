package com.greptilian.javaone2014bof5619.wikipedia;

import java.util.ArrayList;
import java.util.List;


/* The Invoker class */
public class Switch {

    private List<Command> history = new ArrayList<Command>();

    public void execute(Command cmd) {
        this.history.add(cmd); // optional 
        cmd.execute();
    }
}