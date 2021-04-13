package vano.skhirtladze.weather;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

import static vano.skhirtladze.weather.WeatherInfo.getWeather;

@Path("/api")
public class Main {

    @GET
    @Path("/weather")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Weather> weathers(){
        return getWeather();

    }

    @GET
    @Path("/weather/{CityName}")
    @Produces(MediaType.APPLICATION_JSON)
    public Weather weather(@PathParam("CityName") String CityName) {
         Weather result = null;
        for (Weather weather : weathers()){
            if (weather.getCityName().equals(CityName)){
                System.out.println(weather);
                result=weather;
            }
        }
        return result;

    }

}
