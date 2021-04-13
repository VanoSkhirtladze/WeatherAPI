package vano.skhirtladze.weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherInfo {
    public static List<Weather> getWeather(){
        List<Weather> weathers=new ArrayList<>();
        weathers.add(new Weather("Tbilisi",10,15,70,"EAST",20));
        weathers.add(new Weather("Batumi",25,11,72,"WEST",20));
        weathers.add(new Weather("Kutaisi",22,12,71,"EAST",20));

        return weathers;
    }

}
