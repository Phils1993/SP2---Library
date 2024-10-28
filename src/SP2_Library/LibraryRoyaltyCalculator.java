package SP2_Library;

import java.util.ArrayList;
public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {

        // create an Author and books and a audiobook
        Author a1 = new Author("Philip ");

        Title lydbog1 = new AudioBook("lydbog 1", "LYRIK", 10,10);
        Title printBook1 = new PrintedBook("Jordens Søjler", "SKØN", 30,10);
        Title printBook2 = new PrintedBook("Kvinden i Buret", "BI",20,20);
        Title printBook3 = new PrintedBook("Atomic Habits", "TE",10,40);

        // adding titles to Author:
        a1.addTitle(lydbog1);
        a1.addTitle(printBook1);
        a1.addTitle(printBook2);
        a1.addTitle(printBook3);

        // print to see if titles are added:
        System.out.println(a1);
        //prints a line between
        System.out.println("-------------------");

        // prints out eks. for printedsbooks royalties and are the calculated correct?
        System.out.println("PrintedBook eks.");
        System.out.println(printBook1.calculatePoints() + " Points");
        System.out.println(String.format("%2f", printBook2.calculateRoyalties()) + " kr");
        System.out.println("-----------------");

        // eks. for audioe book
        System.out.println("Lydbog eks.: ");
        System.out.println(lydbog1.calculatePoints() + " Points");
        System.out.println(String.format("%2f",lydbog1.calculateRoyalties()) + " kr");
        System.out.println("------------------");

        // earned total:
        System.out.println("Total earned: " + a1.getName() + String.format("%2f", a1.calculateTotalpay()) + " kr. ");
    }

    // afslut SP2 - easy
}
