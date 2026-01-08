package org.folder.todolistlinter.entity.observer;

public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        NewsChannel bfmtv = new NewsChannel("BFMTV");
        NewsChannel cnews = new NewsChannel("CNews");

        agency.addObserver(bfmtv);
        agency.addObserver(cnews);


        agency.notifyObservers("Le pattern Observer est facile !");
    }
}
