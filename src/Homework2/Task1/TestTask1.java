package Homework2.Task1;

public class TestTask1 {
    public static void main(String[] args) {
        Man h1 = new Man("Петр");
        Woman h2 = new Woman("Ольга");
        Man h3 = new Man("Иван");
        Woman h4 = new Woman("Ксюша");
        Man h5 = new Man("Дима", h1, h2);
        Woman h6 = new Woman("Катя");
        h6.addParents(h3, h4);
        Man h7 = new Man("Саша");
        Man h8 = new Man("Олег", h5, h6);
        Woman h9 = new Woman("Юля", h5, h6);
        Woman h10 = new Woman("Геля", h5, h6);
        h7.addParents(h6, h5);
        h7.showGrandParents(2);
        h10.showGrandParents(3);
        h7.showParents();
        h4.showChildren();
        h1.marry(h2);
        h2.divorce();
        h3.marry(h4);
        h8.showSisters();
        h9.showBrother();

        Man h11 = new Man("Иван");
        h11.marry(h10);
        h11.showFatherInLaw();
        h11.showMotherInLaw();
        h10.showFatherInLaw();
        h10.showMotherInLaw();
    }
}
