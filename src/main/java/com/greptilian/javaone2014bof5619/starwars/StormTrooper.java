package com.greptilian.javaone2014bof5619.starwars;

public class StormTrooper {

    private Command command;

    public StormTrooper(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
    }

}
