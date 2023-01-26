package Homework2.Task2;

public abstract class Human {
    private final String name;
    private int cash;

    Human(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    void addCash(int cash) {
        this.cash += cash;
    }

    void takeCash(int cash) {
        if (this.cash < cash) {
            this.noMoney();
        } else {
            this.cash -= cash;
        }
    }

    void noMoney() {
        System.out.println("У него нет столько денег!");
    }

    void viewCash() {
        System.out.println(this + " имеет " + this.cash);
    }

    int getCash() {
        return this.cash;
    }
}

;