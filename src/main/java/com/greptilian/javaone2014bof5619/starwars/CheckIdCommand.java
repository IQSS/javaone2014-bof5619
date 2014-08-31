package com.greptilian.javaone2014bof5619.starwars;

public class CheckIdCommand implements Command {

    private Suspect suspect;

    public CheckIdCommand(Suspect suspect) {
        this.suspect = suspect;
    }

    public void execute() {
        try {
            System.out.println("Id for " + suspect + " is " + suspect.getId());
        } catch (Exception ex) {
            System.out.println("Move along, move along.");
        }
    }

}
