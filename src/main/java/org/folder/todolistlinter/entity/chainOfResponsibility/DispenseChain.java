package org.folder.todolistlinter.entity.chainOfResponsibility;

public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);
    void dispense(Currency cur);
}

