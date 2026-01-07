package org.folder.todolistlinter.entity.facade.component;

public class HardDrive {
    public byte[] read(long lba, int size) { System.out.println("Disque dur : lecture des données."); return new byte[]{0, 1, 2}; }
}
