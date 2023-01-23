package Homework1.Task2;

public class TestTask2 {
    public static void main(String[] args) {
        Human h1 = new Human("Петя");
        Human h2 = new Human("Саша");
        Bed bed = new Bed(2);
        Bed bed1 = new Bed(1);

        bed.viewWhoOnBed();

        h1.getOnTheBed(bed);
        bed.viewWhoOnBed();

        h2.getOnTheBed(bed);
        bed.viewWhoOnBed();

        h1.getOnTheBed(bed);
        bed.viewWhoOnBed();

        h1.getOutOfBed();
        bed.viewWhoOnBed();

        h1.getOnTheBed(bed, 2);
        bed.viewWhoOnBed();

        h2.switchPlaceOnBed(1);
        bed.viewWhoOnBed();

        h2.switchPlaceOnBed(3);
        bed.viewWhoOnBed();

        h1.getOnTheBed(bed1);
        bed.viewWhoOnBed();
        bed1.viewWhoOnBed();

        h1.requestSwapPlaceWithHuman(h2);
        bed.viewWhoOnBed();
        bed1.viewWhoOnBed();

        h1.switchPlaceOnBed(2);
        bed.viewWhoOnBed();
        bed1.viewWhoOnBed();
    }
}