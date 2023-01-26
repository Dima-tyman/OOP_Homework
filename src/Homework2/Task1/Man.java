package Homework2.Task1;

public class Man extends Human implements Spouse {

    private Woman spouse;

    Man(String name, Man father, Woman mother) {
        super(name, father, mother);
    }

    Man(String name) {
        super(name);
    }

    @Override
    public void marry(Woman spouse) {
        if (this.getSpouse() == null &&
                this.getMother() != spouse &&
                !this.getChildren().contains(spouse)) {
            this.setSpouse(spouse);
            spouse.setSpouse(this);
        } else {
            System.out.println("У вас уже есть супруг!");
        }
    }

    @Override
    public void showMotherInLaw() {
        if (this.getSpouse() == null) {
            System.out.println("У вас нет жены");
        } else if (this.getSpouse().getMother() == null) {
            System.out.println("У вашей жены нет матери");
        } else {
            System.out.println("Ваша тёща: " + this.getSpouse().getMother());
        }
    }

    @Override
    public void showFatherInLaw() {
        if (this.getSpouse() == null) {
            System.out.println("У вас нет жены");
        } else if (this.getSpouse().getFather() == null) {
            System.out.println("У вашей жены нет отца");
        } else {
            System.out.println("Ваш тесть: " + this.getSpouse().getFather());
        }
    }

    @Override
    public void setSpouse(Woman spouse) {
        this.spouse = spouse;
    }

    @Override
    public Human getSpouse() {
        return this.spouse;
    }
}