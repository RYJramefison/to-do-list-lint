package org.folder.todolistlinter.execption;

// 1. Définir l'exception personnalisée
public class SoldeInsuffisantException extends Exception {
    public SoldeInsuffisantException(String message) {
        super(message); // Appelle le constructeur de la classe parente Exception
    }
}


