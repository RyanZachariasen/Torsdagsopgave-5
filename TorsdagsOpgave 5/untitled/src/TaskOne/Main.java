package TaskOne;

import java.util.ArrayList;

public class Main{
    public static void main(String[]args){
/*Customer cust = new Customer("Ryan","Zachariasen","BillyTheKid");
System.out.println(cust.toString());
*/
        ArrayList<String>customers = new ArrayList<String>();
        customers.add("Ryan Niaina Zachariasen");
        customers.add("kunde kundesen");
        customers.add("kunde knudsen");


        printCustomers(customers);
    }
    public static void printCustomers(ArrayList<String> customers) {
        for (String i : customers) {
            System.out.println(i);
        }
    }
}
