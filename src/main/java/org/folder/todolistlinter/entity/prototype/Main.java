package org.folder.todolistlinter.entity.prototype;

public class Main {
    public static void main(String[] args) {
        Document resumeTemplate = new Document("Resume", "Espace réservé pour le contenu...");

        // Clone le modèle pour créer un nouveau document
        Document myResume = (Document) resumeTemplate.cloneDocument();
        myResume.setContent("Contenu du CV de Jean Dupont.");


        Document anotherResume = (Document) resumeTemplate.cloneDocument();
        anotherResume.setContent("Contenu du CV de Marie Curie.");

        // Affiche les résultats
        System.out.println("Modèle original: " + resumeTemplate);
        System.out.println("Mon CV: " + myResume);
        System.out.println("Un autre CV: " + anotherResume);

        // Vérifie que les objets sont différents
        System.out.println("myResume et anotherResume sont-ils les mêmes objets ? " + (myResume == anotherResume));
    }
}

