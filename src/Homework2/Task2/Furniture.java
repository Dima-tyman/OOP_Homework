package Homework2.Task2;

public interface Furniture {
    void setUser(Human user);

    void showUsers();

    void removeUser(Human user);

    default void swapUser(Human oldUser, Human newUser) {
        this.removeUser(oldUser);
        this.setUser(newUser);
    }

    int getPrice();

    void setPrice(int price);

    void setOwner(Human owner);

    Human getOwner();

    default void sell(Human buyer, int price) {
        if (buyer.getCash() >= price) {
            this.setPrice(price);
            this.getOwner().addCash(price);
            buyer.takeCash(price);
            this.setOwner(buyer);
        } else {
            buyer.noMoney();
        }
    }
}