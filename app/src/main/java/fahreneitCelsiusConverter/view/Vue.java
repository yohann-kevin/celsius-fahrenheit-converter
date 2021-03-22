package fahreneitCelsiusConverter.view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Vue extends JFrame implements Observer {
    JTextField degrees = new JTextField("", 25);
    JButton celsius = new JButton("Celsius"),
            fahrenheit = new JButton("Fahrenheit"),
            exit = new JButton("Exit");

    public Vue() {
        super("Degrees Convert");
        getContentPane().setLayout(new GridLayout(2,1));
        getContentPane().add(this.degrees);
        JPanel p = new JPanel();
        p.add(this.celsius);
        p.add(this.fahrenheit);
        p.add(this.exit);
        getContentPane().add(p);
        pack();
        setVisible(true);
        this.exit.addActionListener(e -> { System.exit(0); });
    }

    public double getDegrees() {
        double value = 0;
        try {
            value = (Double.parseDouble(this.degrees.getText()));
        } catch (NumberFormatException e) {
            value = Double.NaN;
        }
        finally {
            return value;
        }
    }

    public void addFahrenheitListener(ActionListener a) {
        this.fahrenheit.addActionListener(a);
    }

    public void addCelsiusListener(ActionListener a) {
        this.celsius.addActionListener(a);
    }
    
    @Override
    public void update(Observable o, Object d) {
        degrees.setText(Double.toString((Double) d));
    }

}
