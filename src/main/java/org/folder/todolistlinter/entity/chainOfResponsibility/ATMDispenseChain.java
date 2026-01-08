package org.folder.todolistlinter.entity.chainOfResponsibility;

import org.folder.todolistlinter.entity.chainOfResponsibility.dispenser.Dollar10Dispenser;
import org.folder.todolistlinter.entity.chainOfResponsibility.dispenser.Dollar20Dispenser;
import org.folder.todolistlinter.entity.chainOfResponsibility.dispenser.Dollar50Dispenser;

public class ATMDispenseChain {
    private DispenseChain c1;

    public ATMDispenseChain() {

        this.c1 = new Dollar50Dispenser();
        DispenseChain c2 = new Dollar20Dispenser();
        DispenseChain c3 = new Dollar10Dispenser();

        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public static void main(String[] args) {
        ATMDispenseChain atmDispenser = new ATMDispenseChain();
        System.out.println("Enter amount to dispense:");

        int amount = 230;
        if (amount % 10 != 0) {
            System.out.println("Amount should be in multiple of 10s.");
        } else {
            atmDispenser.c1.dispense(new Currency(amount));
        }
    }
}


