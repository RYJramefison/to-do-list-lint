package org.folder.todolistlinter.entity.chainOfResponsibility.dispenser;


import org.folder.todolistlinter.entity.chainOfResponsibility.Currency;
import org.folder.todolistlinter.entity.chainOfResponsibility.DispenseChain;

public class Dollar50Dispenser implements DispenseChain {
    private DispenseChain nextChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if (cur.getAmount() >= 50) {
            int num = cur.getAmount() / 50;
            int remainder = cur.getAmount() % 50;
            System.out.println("Dispensing " + num + " 50$ note(s)");
            if (remainder > 0 && this.nextChain != null) {
                this.nextChain.dispense(new Currency(remainder));
            }
        } else {
            this.nextChain.dispense(cur);
        }
    }
}



