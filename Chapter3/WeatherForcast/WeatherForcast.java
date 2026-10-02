
/**
 * Write a description of class WeatherForcast here.
 *
 * @Neel G,
 * @10/2/26
 */
public class WeatherForcast
{
    public enum WeatherType {
        // define an enum for fixed weather catergories
        Sunny,
        Cloudy,
        Rainy,
        Foggy,
        Windy,
        Snowy
    }
    public static void main(String[] args) {
        // create counter variable to count num of rainy days
        int rainyDays = 0;
        
        // array of all possible enum constants
        WeatherType[] options = WeatherType.values();
        
        // head parts:
        // intizializer (int day = 1)
        // condition (day <=7)
        // mutator (day++)
        
        for (int day = 1; day <= 7; day++) {
           // pick a random index from 0 to the length of our enum
           int rndIndex = (int) (Math.random() * options.length);
           WeatherType today = options[rndIndex];
           
           // day #; Weather
           System.out.println("Day " + day + ": " + today);
           
           // enums are compared using == bc the are instances
           if (today == WeatherType.Rainy) {
               rainyDays++;
           }
        }
        
        System.out.println("They are " + rainyDays + " days of rain in the forcast.");
        
        System.out.println("All Supported Weather Types:");
        for (WeatherType w: WeatherType.values()) {
            System.out.println("Category: " + w);
        }
    }
}