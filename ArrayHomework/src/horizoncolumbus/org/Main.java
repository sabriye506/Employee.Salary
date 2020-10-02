package horizoncolumbus.org;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> dreamCities = new ArrayList();

        dreamCities.add("Boston");
        dreamCities.add("Columbus");
        dreamCities.add("New York");
        dreamCities.sort(null);
        System.out.println(dreamCities);

        dreamCities.remove(2);

        System.out.println(dreamCities);

        String favoriteCity = dreamCities.get(1);

        System.out.println("There are " + dreamCities.size() + " of the cities that I like most. My most favorite city is " + favoriteCity + ".");


    }
}
