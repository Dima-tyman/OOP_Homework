package Homework2.Task2;

public class Bed implements Furniture {
    private final String title;
    private int price;
    private Human owner;
    private Human user;

    Bed(String title, Human owner, int price) {
        this.title = title;
        this.owner = owner;
        this.price = price;
    }

    @Override
    public void setUser(Human user) {
        if (this.user == null) {
            this.user = user;
        } else {
            System.out.println("Уже занято");
        }
    }

    @Override
    public void showUsers() {
        System.out.println("Этой кроватью пользуется " + this.user);
    }

    @Override
    public void removeUser(Human user) {
        if (this.user != null) {
            this.user = null;
        } else {
            System.out.println("Не было занято");
        }
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void setOwner(Human owner) {
        this.owner = owner;
    }

    @Override
    public Human getOwner() {
        return this.owner;
    }
}
