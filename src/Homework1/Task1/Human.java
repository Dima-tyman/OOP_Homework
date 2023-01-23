package Homework1.Task1;

import java.util.*;

public class Human {
    private final String name;
    private Man father;
    private Woman mother;
    private Human spouse;
    private final List<Human> children = new ArrayList<>();

    Human(String name, Man father, Woman mother) {
        this(name);
        this.addParents(father, mother);
    }

    Human(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    void divorce () {
        if (this.spouse != null) {
            this.spouse.spouse = this.spouse = null;
        } else {
            System.out.println("У вас нет супруга");
        }
    }

    void addParents(Man father, Woman mother) {
        this.father = father;
        this.getFather().addChildren(this);
        this.mother = mother;
        this.getMother().addChildren(this);
    }

    void addParents(Woman mother, Man father) {
        this.addParents(father, mother);
    }

    void addChildren(Human ...children) {
        this.children.addAll(Arrays.asList(children));
    }

    void showParents() {
        System.out.printf("Отец: %s. Мать: %s\n", this.getFather(), this.getMother());
    }

    void showGrandParents(int gen) {
        List<Human> grandParents = new ArrayList<>();
        this.getGrandParents(gen, grandParents);
        System.out.println(grandParents);
    }

    void showChildren() {
        System.out.printf("%s имеет следующих детей: %s\n", this, this.getChildren());
    }

    void showBrother() {
        List<Human> brother = new ArrayList<>();
        for (Human human: this.father.getChildren()) {
            if (human.getClass() == Man.class && human != this) brother.add(human);
        }
        if (brother.isEmpty()) {
            System.out.printf("У %s нет братьев.\n", this);
        } else {
            System.out.printf("У %s следующие братья: %s\n", this, brother);
        }
    }

    void showSisters() {
        List<Human> sisters = new ArrayList<>();
        for (Human human: this.father.getChildren()) {
            if (human.getClass() == Woman.class && human != this) sisters.add(human);
        }
        if (sisters.isEmpty()) {
            System.out.printf("У %s нет сестёр.\n", this);
        } else {
            System.out.printf("У %s следующие сестры: %s\n", this, sisters);
        }
    }

    void getGrandParents(int gen, List<Human> grandParents) {
        if (gen == 1) {
            grandParents.add(this.father);
            grandParents.add(this.mother);
        } else {
            this.father.getGrandParents(gen - 1, grandParents);
            this.mother.getGrandParents(gen - 1, grandParents);
        }
    }

    protected Human getFather() {
        return father;
    }

    protected Human getMother() {
        return mother;
    }

    protected Human getSpouse() {
        return spouse;
    }

    protected List<Human> getChildren() {
        return children;
    }

    protected void setSpouse(Human spouse) {
        this.spouse = spouse;
    }
}