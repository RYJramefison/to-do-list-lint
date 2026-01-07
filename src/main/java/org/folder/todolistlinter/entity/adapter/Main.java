package org.folder.todolistlinter.entity.adapter;

import org.folder.todolistlinter.entity.adapter.Square.SquarePeg;
import org.folder.todolistlinter.entity.adapter.Square.SquarePegAdapter;
import org.folder.todolistlinter.entity.adapter.round.RoundHole;
import org.folder.todolistlinter.entity.adapter.round.RoundPeg;

public class Main {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        SquarePeg squarePeg = new SquarePeg(10);

        System.out.println("La pièce ronde rentre : " + hole.fits(roundPeg));

        // Utilisation de l'adaptateur
        SquarePegAdapter adapter = new SquarePegAdapter(squarePeg);
        System.out.println("La pièce carrée (adaptée) rentre : " + hole.fits(adapter)); // false (car 10*sqrt(2)/2 > 5)
    }
}
