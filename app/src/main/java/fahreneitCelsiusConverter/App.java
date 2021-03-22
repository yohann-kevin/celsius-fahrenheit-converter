package fahreneitCelsiusConverter;

import fahreneitCelsiusConverter.controller.Controlleur;
import fahreneitCelsiusConverter.model.Model;
import fahreneitCelsiusConverter.view.Vue;

public class App {
    public static void main(String[] args) {
        Model m = new Model();
        Vue v = new Vue();
        Controlleur c = new Controlleur(m, v);
        m.addObserver(v);
    }
}
