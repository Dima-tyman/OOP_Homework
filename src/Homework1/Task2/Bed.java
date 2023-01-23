package Homework1.Task2;

import java.util.Arrays;

public class Bed {
    private final Human[] bedPlaces;
    private int countHuman;

    Bed(int places) {
        bedPlaces = new Human[places];
        this.countHuman = 0;
    }

    int getHumanPlace(Human human) {
        for (int i = 0; i < this.bedPlaces.length; i++) {
            if (this.bedPlaces[i] == human) return i + 1;
        }
        return -1;
    }

    boolean isPlaceEmpty(int place) {
        if (place > this.bedPlaces.length) {
            System.out.println("На кровати нет такого места!");
            return false;
        } else if (this.bedPlaces[place - 1] != null) {
            System.out.println("Это место занято!");
            return false;
        } else return true;
    }

    protected void addHumanToBed(Human human, int place) {
        if (this.isPlaceEmpty(place)) {
            this.bedPlaces[place - 1] = human;
            human.setCurrentBed(this);
            this.countHuman++;
        }
    }

    protected void addHumanToBed(Human human) {
        if (countHuman < this.bedPlaces.length) {
            for (int i = 0; i < this.bedPlaces.length; i++) {
                if (this.bedPlaces[i] == null) {
                    this.bedPlaces[i] = human;
                    human.setCurrentBed(this);
                    this.countHuman++;
                    break;
                }
            }
        } else {
            System.out.println("На кровати нет мест!");
        }
    }

    protected void removeHumanOnBed(Human human) {
        for (int i = 0; i < this.bedPlaces.length; i++) {
            if (this.bedPlaces[i] == human) {
                this.bedPlaces[i] = null;
                this.countHuman--;
                break;
            }
        }
    }

    void viewWhoOnBed() {
        System.out.println(Arrays.toString(this.bedPlaces));
    }
}
