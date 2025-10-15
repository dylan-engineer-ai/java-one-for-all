package academy.devdojo.javaoneforall.javacore.Gassociation.test;

import academy.devdojo.javaoneforall.javacore.Gassociation.domain.Player;

public class PlayerTest01 {
    public static void main(String[] args) {
        Player p1 = new Player("Pele");
        Player p2 = new Player("Mario");
        Player p3 = new Player("Cafu");

        Player[] players = new Player[]{p1,p2,p3};

    }
}
