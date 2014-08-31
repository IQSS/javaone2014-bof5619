package com.greptilian.javaone2014bof5619.starwars;

public class Client {

    public static void main(String[] args) {
        System.out.println("# Mos Eisley checkpoint");
        Suspect obiwan = new Suspect("Obiwan", Suspect.Type.JEDI);
        Command checkIdCommand = new CheckIdCommand(obiwan);
        StormTrooper stormTrooper = new StormTrooper(checkIdCommand);
        stormTrooper.execute(); // Move along, move along.

        System.out.println("# Death Star hangar");
        Ship falcon = new Ship("Millenium Falcon", Ship.Type.SMUGGLING);
        Command checkShipCommand = new CheckShipCommand(falcon);
        stormTrooper.setCommand(checkShipCommand);
        stormTrooper.execute(); // No one on board.
    }

}
