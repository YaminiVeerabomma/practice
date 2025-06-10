package oops;

public class Chinning_conSuper {
	Chinning_conSuper() {
        System.out.println("Chinning_con");
    }
}

class Item extends Chinning_conSuper{
    Item() {
        super(); // Calls Chinning_con ()
        System.out.println("Item constructor");
    }
}

class Product extends Item {
    Product() {
        super(); //  Item()
        System.out.println("Product constructor");
    }

    public static void main(String[] args) {
        Product p = new Product();
    }
}


	