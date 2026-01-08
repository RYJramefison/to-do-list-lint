package org.folder.todolistlinter.entity.command;

public class CommandPatternDemo {
    public static void main(String[] args) {
        // 1. Créer le récepteur
        Light livingRoomLight = new Light();

        // 2. Créer les commandes et leur associer le récepteur
        Command on = new LightOnCommand(livingRoomLight);
        Command off = new LightOffCommand(livingRoomLight);

        // 3. Créer l'appelant
        RemoteControl remote = new RemoteControl();

        // 4. Configurer et exécuter la commande "allumer"
        remote.setCommand(on);
        remote.pressButton(); // Sortie: La lumière est allumée

        // 5. Configurer et exécuter la commande "éteindre"
        remote.setCommand(off);
        remote.pressButton(); // Sortie: La lumière est éteinte
    }
}

