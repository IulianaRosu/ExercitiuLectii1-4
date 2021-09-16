package ro.java.ctrln;

import java.util.ArrayList;

public class Usage {

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Lapte", 5.6));
        products.add(new Product("Paine", 3.2));
        products.add(new Product("Orez", 8.9));
        products.add(new Product("Sunca", 12.4));
        products.add(new Product("Cascaval", 20));
        System.out.println("Lista de produse disponibile : " + products);

        Profile profile = new Profile("iuliana@gmail.com", "iuliana.rosu", "1234");

        ArrayList<Adress> adresses = new ArrayList<>();
        adresses.add(new Adress("Bucurest", "FLorilor", 345));
        profile.setAdresses(adresses);

        System.out.println("Profilul " + profile.getUsername() + " : " );
        System.out.println(profile);

        ////order 1
        Order shoppingCart = new Order(1);
        shoppingCart.addProduct(products.get(0));
        shoppingCart.addProduct(products.get(3));

        /////order2
        Order shoppingCart2 = new Order(2);
        shoppingCart2.addProduct(products.get(1));
        shoppingCart2.addProduct(products.get(2));

        //////Lista de comenzi
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(shoppingCart);
        orders.add(shoppingCart2);

        ///wishlist
        Wishlist wishlist = new Wishlist();
        ArrayList<Product> wishProducts = new ArrayList<>();
        wishProducts.add(products.get(4));
        wishProducts.add(products.get(3));
        wishlist.setProducts(wishProducts);

        //ccontul
        Account account = new Account(profile);
        account.setOrders(orders);
        account.setWishlist(wishlist);

        account.getWishlist().addProduct(new Product("ciocolata", 5.6));
        account.getOrderId(0).addProduct(new Product("inghetata", 4.5));

        System.out.println("Account: ");
        System.out.println(account);

        ///stergere produs din wishlist

        account.getWishlist().deleteProduct("ciocolata");

        System.out.println("Account dupa stergere: ");
        System.out.println(account);


        ///Stergere produs dintr-o comanda
        account.getOrderId(0).deleteProduct("inghetata");

        System.out.println("Account dupa stergere: ");
        System.out.println(account);











    }
}
