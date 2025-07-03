package org.lld;

public class RemoteControl {
    Command lightOnCommand;
    Command lightOffCommand;
    Command fanOnCommand;
    Command fanOffCommand;

    public RemoteControl(Command lightOnCommand, Command lightOffCommand, Command fanOnCommand, Command fanOffCommand) {
        this.lightOnCommand = lightOnCommand;
        this.lightOffCommand = lightOffCommand;
        this.fanOnCommand = fanOnCommand;
        this.fanOffCommand = fanOffCommand;
    }

    public void pressLightOnButton() {
        lightOnCommand.execute();
    }
    public void pressLightOffButton() {
        lightOffCommand.execute();
    }
    public void pressFanOnButton() {
        fanOnCommand.execute();
    }
    public void pressFanOffButton() {
        fanOffCommand.execute();
    }
}
