package Homework2.Task1;

public class Woman extends Human implements Spouse {

    private Man spouse;

    Woman(String name, Man father, Woman mother) {
        super(name, father, mother);
    }

    Woman(String name) {
        super(name);
    }

    @Override
    public void marry(Man spouse) {
        if (this.getSpouse() == null &&
                this.getFather() != spouse &&
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
            System.out.println("У вас нет мужа");
        } else if (this.getSpouse().getMother() == null) {
            System.out.println("У вашего мужа нет матери");
        } else {
            System.out.println("Ваша свекровь: " + this.getSpouse().getMother());
        }
    }

    @Override
    public void showFatherInLaw() {
        if (this.getSpouse() == null) {
            System.out.println("У вас нет мужа");
        } else if (this.getSpouse().getFather() == null) {
            System.out.println("У вашего мужа нет отца");
        } else {
            System.out.println("Ваш свёкр: " + this.getSpouse().getFather());
        }
    }

    @Override
    public void setSpouse(Man spouse) {
        this.spouse = spouse;
    }

    @Override
    public Human getSpouse() {
        return this.spouse;
    }
}