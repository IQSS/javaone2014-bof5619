package com.greptilian.javaone2014bof5619.starwars;

public class CheckShipCommand implements Command {

    Ship ship;

    public CheckShipCommand(Ship ship) {
        this.ship = ship;
    }

    public void execute() {
        if (!ship.getSuspects().isEmpty()) {
            System.out.println("Found " + ship.getSuspects().size() + " suspects in " + ship.getName());
        } else {
            System.out.println("No one on board.");
        }
    }

}
