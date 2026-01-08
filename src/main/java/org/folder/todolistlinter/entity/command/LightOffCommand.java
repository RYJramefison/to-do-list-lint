package org.folder.todolistlinter.entity.command;

// Commande pour éteindre la lumière
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
