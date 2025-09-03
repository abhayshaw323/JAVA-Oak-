//Given an array of all the products and given a Hashset of all the defective products,create a Hashset of all the non-defective products.
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>();
        products.add("Colgate");
        products.add("Beer");
        products.add("Cigrate");
        products.add("Atta");
        products.add("Cabel wire");
        products.add("All out");

        HashSet<String> all_products = new HashSet<>(products);

        HashSet<String> defective_products = new HashSet<>();
        HashSet<String> non_defective_products = new HashSet<>();
        defective_products.add("Cigrate");
        defective_products.add("All out");

        
        for(String pro : all_products)
        {
            if(!defective_products.contains(pro)){
            non_defective_products.add(pro);
            }
        } 
        System.out.println(non_defective_products);

    }
}
