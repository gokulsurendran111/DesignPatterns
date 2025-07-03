package org.lld;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Fan fan = new Fan();

        RemoteControl rc = new RemoteControl(new LightOnCommand(light),
                new LightOffCommand(light),
                new FanOnCommand(fan),
                new FanOffCommand(fan));

        rc.pressLightOnButton();
        rc.pressLightOffButton();
        rc.pressFanOnButton();
    }
}