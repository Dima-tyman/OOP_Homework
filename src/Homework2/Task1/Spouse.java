package Homework2.Task1;

public interface Spouse {

    default void divorce() {
        if (getSpouse() == null) {
            System.out.println("У вас нет супруга");
        }
    }

    default void marry(Man spouse) {
    }

    default void marry(Woman spouse) {
    }

    default void setSpouse(Man spouse) {
    }

    default void setSpouse(Woman spouse) {
    }

    Human getSpouse();

    default void showMotherInLaw() {
        if (this.getSpouse() == null) {
            System.out.println("У вас нет супруга");
        }
    }

    default void showFatherInLaw() {
        if (this.getSpouse() == null) {
            System.out.println("У вас нет супруга");
        }
    }
}
