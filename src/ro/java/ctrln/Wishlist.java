package ro.java.ctrln;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class Wishlist {

    private ArrayList<Product> products = new ArrayList<>();

    public Wishlist(){}

    public Wishlist(ArrayList<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product){
        products.add(product);
    }
    public void deleteProduct(String name){

        for( Iterator<Product> iterator = products.iterator() ; iterator.hasNext();){
            Product product = iterator.next();
            if(product.getName().equals(name)){
                iterator.remove();
            }
        }

      //  products.removeIf(product -> product.getName() == name);
    }


    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }


    @Override
    public String toString() {
        return "Wishlist{" +
                "products=" + products +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wishlist wishlist = (Wishlist) o;
        return products.equals(wishlist.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }
}
