package org.folder.todolistlinter.entity.chainOfResponsibility.dispenser;

import org.folder.todolistlinter.entity.chainOfResponsibility.Currency;
import org.folder.todolistlinter.entity.chainOfResponsibility.DispenseChain;

public class Dollar20Dispenser implements DispenseChain {
    private DispenseChain nextChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if (cur.getAmount() >= 20) {
            int num = cur.getAmount() / 20;
            int remainder = cur.getAmount() % 20;
            System.out.println("Dispensing " + num + " 20$ note(s)");
            if (remainder > 0 && this.nextChain != null) {
                this.nextChain.dispense(new Currency(remainder));
            }
        } else {
            this.nextChain.dispense(cur); // Passer au suivant si pas assez
        }
    }
}


