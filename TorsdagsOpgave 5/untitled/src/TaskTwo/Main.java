package TaskTwo;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
Cafe cafe = new Cafe();
cafe.loadMenu();

for( int i = 0 ; i < cafe.coffeeMenu.size(); i++){
    String coffee = cafe.coffeeMenu.get(i);
    System.out.println(coffee);
}
        }
    }
