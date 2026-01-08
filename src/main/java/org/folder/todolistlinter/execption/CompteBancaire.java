package org.folder.todolistlinter.execption;

// 2. Utiliser l'exception personnalisée
public class CompteBancaire {
    private double solde;

    public void retirer(double montant) throws SoldeInsuffisantException {
        if (montant > solde) {
            throw new SoldeInsuffisantException("Solde insuffisant pour retirer : " + montant);
        }
        solde -= montant;
    }
}

