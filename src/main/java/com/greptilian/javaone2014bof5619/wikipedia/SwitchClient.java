package com.greptilian.javaone2014bof5619.wikipedia;

/* The test class or client from http://en.wikipedia.org/wiki/Command_pattern */
public class SwitchClient {

    public static void main(String[] args) {
        Light lamp = new Light();
        Command switchUp = new FlipUpCommand(lamp);
        Command switchDown = new FlipDownCommand(lamp);
        Switch mySwitch = new Switch();
        mySwitch.execute(switchUp);
        mySwitch.execute(switchDown);
    }
}