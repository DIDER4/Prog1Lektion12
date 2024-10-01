package opgave04;

public class TestWeatherStation {
    public static void main(String[] args) {
        WeatherStation station1 = new WeatherStation();
        System.out.println("Station 1 - Metric: " + station1.getTemperature() + "°C, " + station1.getPressure() + " bar");
        System.out.println("Station 1 - Imperial: " + station1.getTemperatureFahrenheit() + "°F, " + station1.getPressurePSI() + " PSI\n");

        WeatherStation station2 = new WeatherStation(35, 0.5);
        System.out.println("Station 2 - Metric: " + station2.getTemperature() + "°C, " + station2.getPressure() + " bar");
        System.out.println("Station 2 - Imperial: " + station2.getTemperatureFahrenheit() + "°F, " + station2.getPressurePSI() + " PSI\n");

        WeatherStation station3 = WeatherStation.fromImperial(68, 21);
        System.out.println("Station 3 - Imperial: " + station3.getTemperatureFahrenheit() + "°F, " + station3.getPressurePSI() + " PSI");
        System.out.println("Station 3 - Metric: " + station3.getTemperature() + "°C, " + station3.getPressure() + " bar");
    }
}
