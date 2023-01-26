package Homework2.Task2;

public class TestTask2 {
    public static void main(String[] args) throws InterruptedException {
        Man h1 = new Man("Петя");
        Man h2 = new Man("Вася");
        Bed bed = new Bed("Bed", h1, 10000);
        h2.viewCash();
        h1.viewCash();
        bed.sell(h2, bed.getPrice());
        h2.addCash(15000);
        h2.viewCash();
        h1.viewCash();
        System.out.println(bed.getOwner());
        bed.sell(h2, bed.getPrice());
        h2.viewCash();
        h1.viewCash();
        System.out.println(bed.getOwner());
    }
}