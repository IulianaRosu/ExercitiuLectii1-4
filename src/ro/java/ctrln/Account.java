package ro.java.ctrln;

import java.util.ArrayList;
import java.util.Objects;

public class Account extends Profile{

    private ArrayList<Order> orders;
    private Wishlist wishlist;

    public Account(){}
    public Account(Profile profile){
        super(profile.getEmail(), profile.getUsername(), profile.getParola(), profile.getAdresses());
    }
    public Account(Profile profile, ArrayList<Order> orders, Wishlist wishlist) {
        super(profile.getEmail(), profile.getUsername(), profile.getParola());
        this.orders = orders;
        this.wishlist = wishlist;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public Order getOrderId(int id){
        return orders.get(0);
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public Wishlist getWishlist() {
        return wishlist;
    }

    public void setWishlist(Wishlist wishlist) {
        this.wishlist = wishlist;
    }

    @Override
    public String toString() {
        return
                "Profile{" +
                        "email='" + getEmail() + '\'' +
                        ", username='" + getUsername() + '\'' +
                        ", parola='" + getParola() + '\'' +
                        ", adresses=" + getAdresses() +
                        '}'+'\n'+
                "Account{" +
                "orders=" + orders +
                ", wishlist=" + wishlist +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Account account = (Account) o;
        return orders.equals(account.orders) && wishlist.equals(account.wishlist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), orders, wishlist);
    }
}
