package opgave04;

public class WeatherStation {
    private double temperature; // in Celsius
    private double pressure; // in Bar

    public WeatherStation() {
        temperature = 0;
        pressure = 1;
    }

    public WeatherStation(double temperature, double pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
    }

    public static WeatherStation fromImperial(double temperatureF, double pressurePSI) {
        double temperatureC = (temperatureF - 32) * 5.0 / 9.0;
        double pressureBar = pressurePSI / 14.5038;
        return new WeatherStation(temperatureC, pressureBar);
    }

    public double getTemperature() {
        return this.temperature;  // In °C
    }

    public double getPressure() {
        return this.pressure;  // In bar
    }

    public double getTemperatureFahrenheit() {
        return this.temperature * 9.0 / 5.0 + 32.0;  // Convert °C to °F
    }

    public double getPressurePSI() {
        return this.pressure * 14.5038;  // Convert bar to PSI
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public void setTemperatureFahrenheit(double temperatureF) {
        this.temperature = (temperatureF - 32) * 5.0 / 9.0;  // Convert °F to °C
    }

    public void setPressurePSI(double pressurePSI) {
        this.pressure = pressurePSI / 14.5038;  // Convert PSI to bar
    }
}

