package abstraction.abstract_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

public class TestAbstraction {

    public static void main(String[] args) {

        /*
        Create an object of Samsung called as s1
        info it will have is as below

        Samsung
        Black
        64
        700
         */

        Samsung s1 = new Samsung();
        s1.brand = "Samsung";
        s1.color = "Black";
        s1.storage = 64;
        s1.price = 700;

        Nokia n1 = new Nokia("Nokia", "Blue", 4, 100);
        Iphone i1 = new Iphone("Apple", "Silver", 128, 1000);

        List<Phone> phoneList = new ArrayList<>();
        phoneList.add(s1);
        phoneList.add(n1);
        phoneList.add(i1);

        /*
        Print all objects
        Find and print the most expensive one with the massage, "The most expensive phone is = Iphone"
        Find and print how many phones are convertible -> 2
         */

        int countConvertible = 0;
        int max = Integer.MIN_VALUE;
        Phone mostExpensive = null;

        for(Phone phones : phoneList){
            System.out.println(phones);
            if(phones.isConvertible()) countConvertible++;
            if(phones.price > max) mostExpensive = phones;
        }
        System.out.println(countConvertible);
        System.out.println("The most expensive phone is = " + mostExpensive.getClass().getSimpleName());

        System.out.println(Iphone.OS); // invoke static instance variables
        System.out.println(Samsung.OS);
        System.out.println(Nokia.OS);

        for(Phone phone : phoneList){
            phone.call();
            phone.ring();
            phone.ring();
        }








    }
}
