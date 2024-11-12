package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");

        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());

        redRemote.turnOn();
        blackRemote.turnOn();

        redRemote.channelUp();
        blackRemote.channelDown();

        redRemote.channel = 0;
        blackRemote.channel = 0;

        redRemote.channelDown();
        blackRemote.channelDown();

        redRemote.volumeUp();
        blackRemote.volumeDown();

        redRemote.volume = 0;
        blackRemote.volume = 0;

        redRemote.volumeDown();
        blackRemote.volumeDown();

        redRemote.turnOff();
        blackRemote.turnOff();
    }
}
