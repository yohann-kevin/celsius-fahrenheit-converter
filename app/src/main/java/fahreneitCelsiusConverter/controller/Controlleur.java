package fahreneitCelsiusConverter.controller;

import javax.swing.event.*;

import fahreneitCelsiusConverter.model.Model;
import fahreneitCelsiusConverter.view.Vue;

public class Controlleur {
    public Controlleur(Model m, Vue v) {
        v.addFahrenheitListener(e -> m.convertToFahrenheit(v.getDegrees()));
        v.addCelsiusListener(e -> m.convertToCelsius(v.getDegrees()));
    }
}
