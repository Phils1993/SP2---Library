package SP2_Library;

import java.util.ArrayList;

public class Author {
    private final String name;
    private ArrayList<Title> titles;

    public Author(String name) {
        this.name = name;
        this.titles = new ArrayList<>();

    }
    public void addTitle(Title title) {
        titles.add(title);
    }

    // calculates money earned and return the total pay
    public  float calculateTotalpay(){
        float total = 0;
        for ( Title title: titles){
            total += (float) title.calculateRoyalties();
        }
        return total;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Author" + name + "\nTitles: " + titles;
    }
}
