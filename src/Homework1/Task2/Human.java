package Homework1.Task2;

import java.util.Scanner;

public class Human {
    private final String name;
    private Bed currentBed;

    Human(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    protected boolean isOnBed() {
        return this.currentBed != null;
    }

    void getOnTheBed(Bed bed, int place) {
        if (this.currentBed == null) {
            if (place == 0) {
                bed.addHumanToBed(this);
            } else {
                bed.addHumanToBed(this, place);
            }
        } else {
            System.out.println("Вы уже лежите!");
        }
    }

    void getOnTheBed(Bed bed) {
        this.getOnTheBed(bed, 0);
    }

    void getOutOfBed() {
        if (this.currentBed != null) {
            this.currentBed.removeHumanOnBed(this);
            this.currentBed = null;
            System.out.println("Вы встали с кровати!");
        }
    }

    void switchPlaceOnBed(int newPlace) {
        if (this.currentBed != null && currentBed.isPlaceEmpty(newPlace)) {
            currentBed.removeHumanOnBed(this);
            currentBed.addHumanToBed(this, newPlace);
            System.out.println("Вы легли на другое место!");
        }
    }

    void requestSwapPlaceWithHuman(Human human) {
        if (human.isOnBed()) {
            System.out.printf("%s, %s просит Вас поменяться местами. Наберите 1 чтобы принять: \n", human, this);
            if (new Scanner(System.in).nextLine().equals("1")) {
                if (this.currentBed == null) {
                    Bed bed = human.currentBed;
                    int place = human.currentBed.getHumanPlace(human);
                    human.getOutOfBed();
                    this.getOnTheBed(bed, place);
                } else {
                    Bed oldBed = this.currentBed;
                    Bed newBed = human.currentBed;
                    int oldPlace = this.currentBed.getHumanPlace(this);
                    int newPlace = human.currentBed.getHumanPlace(human);
                    this.getOutOfBed();
                    human.getOutOfBed();
                    this.getOnTheBed(newBed, newPlace);
                    human.getOnTheBed(oldBed, oldPlace);
                }
                System.out.println("Вы поменялись!");
            } else {
                System.out.printf("%s отклонил Ваш запрос!\n", human);
            }
        } else {
            System.out.println("Этот человек не лежит!");
        }
    }

    protected void setCurrentBed(Bed currentBed) {
        this.currentBed = currentBed;
    }
}