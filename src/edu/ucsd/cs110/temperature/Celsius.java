package edu.ucsd.cs110.temperature;
public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return new Celsius(super.getValue());
    }

    @Override
    public Temperature toFahrenheit() {
        float temp = super.getValue();
        return new Fahrenheit((temp * 9/5) + 32);
    }

    public String toString()
    {
        return "" + super.getValue() + " C";
    }
}