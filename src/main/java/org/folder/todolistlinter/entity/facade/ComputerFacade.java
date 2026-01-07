package org.folder.todolistlinter.entity.facade;

import org.folder.todolistlinter.entity.facade.component.CPU;
import org.folder.todolistlinter.entity.facade.component.HardDrive;
import org.folder.todolistlinter.entity.facade.component.Memory;

public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    // Méthode simple qui orchestre les composants
    public void startComputer() {
        System.out.println("--- Démarrage de l'ordinateur ---");
        cpu.freeze();
        memory.load(0x0000ffff, hardDrive.read(0x0007c00, 512)); // Exemple d'appel
        cpu.jump(0x0000ffff);
        cpu.execute();
        System.out.println("--- Démarrage terminé ---");
    }
}

