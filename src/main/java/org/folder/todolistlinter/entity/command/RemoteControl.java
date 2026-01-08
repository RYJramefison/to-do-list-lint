package org.folder.todolistlinter.entity.command;

public class RemoteControl {
    private Command command;

    // Définit la commande à exécuter
    public void setCommand(Command command) {
        this.command = command;
    }

    // Appuie sur le bouton pour exécuter la commande
    public void pressButton() {
        command.execute();
    }
}

