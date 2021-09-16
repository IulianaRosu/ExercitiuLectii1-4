package ro.java.ctrln;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class Order {
    private int id;
    private ArrayList<Product> products = new ArrayList<>();

    public Order(){}

    public Order(int id, ArrayList<Product> products) {
        this.id = id;
        this.products = products;
    }

    public Order(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
    public void addProduct(Product product){
            this.products.add(product);
    }
    public void deleteProduct(String name){

        for(Iterator<Product> iterator = products.iterator(); iterator.hasNext();){
            Product product = iterator.next();
            if(product.getName().equals(name)){
                iterator.remove();
            }
        }

        //  products.removeIf(product -> product.getName() == name);
    }


    @Override
    public String toString() {
        return "Order{" +
                "Id=" + id +
                ", products=" + products +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id && products.equals(order.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, products);
    }


}
