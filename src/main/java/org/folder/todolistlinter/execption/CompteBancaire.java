package org.folder.todolistlinter.execption;


public class CompteBancaire {
    private double solde;

    public void retirer(double montant) throws SoldeInsuffisantException {
        if (montant > solde) {
            throw new SoldeInsuffisantException("Solde insuffisant pour retirer : " + montant);
        }
        solde -= montant;
    }
}

