import java.util.*;
class product{
    int productId;
    String name;
    int price;
    int qty;
    product(String name,int price,int qty){
        this.price=price;
        this.name=name;
        this.qty=qty;
    }
}

public class ShoppingCart {
    ArrayList<product> cart;
    ShoppingCart(){
        cart=new ArrayList<>();
        System.out.println("Cart is Empty. Add some items");
    }
    public void buyProduct(){
        int total=0;
        for(product item:this.cart){
            
            total+=item.price*item.qty;
        }
        System.out.println("Your total is "+total);
    }
    public void addToCart(String name,int price,int qty){
        cart.add(new product(name,price,qty));
    }
    public static void main(String[] args) {
        ShoppingCart cart=new ShoppingCart();
        cart.menu();
        System.out.println(cart.cart);
        cart.addToCart("Apple", 400, 2);
        cart.addToCart("Bag", 400, 2);
        System.out.println("List of items in cart");
        for(product item:cart.cart){
            System.out.println(item.name);
        }
        cart.buyProduct();
        
    }
    public  void menu(){
        System.out.println("1. iPhone 15 ---> 150000");
        System.out.println("2. Apple--> 20");
        System.out.println("3. jacket--> 1200");
        System.out.println("4. Bag--> 400");
        System.out.println("5. Cosmetics-->1200");
    }
    

}
