package fahreneitCelsiusConverter.model;

import java.util.*;

public class Model extends Observable {
    private double degrees;
    
    public void convertToFahrenheit(double c) {
        this.degrees = c*1.8 + 32;
        setChanged();
        notifyObservers(degrees);
    }

    public void convertToCelsius(double f) {
        this.degrees = (f - 32) / 1.8;
        setChanged();
        notifyObservers(degrees);
    }
}
