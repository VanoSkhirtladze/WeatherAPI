package vano.skhirtladze.weather;

public class Weather {
    private String CityName;
    private int Temperature;
    private int Humidity;
    private int Pressure;
    private String WindDirection;
    private int WindSpeed;

    public enum DirectionType{
        NORTH,
        SOUTH,
        EAST,

    }

    public Weather() {
    }

    public Weather(String cityName, int temperature, int humidity, int pressure, String windDirection, int windSpeed) {
        CityName = cityName;
        Temperature = temperature;
        Humidity = humidity;
        Pressure = pressure;
        WindDirection = windDirection;
        WindSpeed = windSpeed;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public int getTemperature() {
        return Temperature;
    }

    public void setTemperature(int temperature) {
        Temperature = temperature;
    }

    public int getHumidity() {
        return Humidity;
    }

    public void setHumidity(int humidity) {
        Humidity = humidity;
    }

    public int getPressure() {
        return Pressure;
    }

    public void setPressure(int pressure) {
        Pressure = pressure;
    }

    public String getWindDirection() {
        return WindDirection;
    }

    public void setWindDirection(String windDirection) {
        WindDirection = windDirection;
    }

    public int getWindSpeed() {
        return WindSpeed;
    }

    public void setWindSpeed(int windSpeed) {
        WindSpeed = windSpeed;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "CityName='" + CityName + '\'' +
                ", Temperature=" + Temperature +
                ", Humidity=" + Humidity +
                ", Pressure=" + Pressure +
                ", WindDirection='" + WindDirection + '\'' +
                ", WindSpeed=" + WindSpeed +
                '}';
    }
}
