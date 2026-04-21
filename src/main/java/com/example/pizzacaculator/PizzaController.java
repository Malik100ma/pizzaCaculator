package com.example.pizzacaculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PizzaController {
    @FXML
    TextField diametrField1, diametrField2, priceField1, priceField2;
    @FXML
    Label resultLabel;

    public void calculate(ActionEvent actionEvent) {
        try {
            double diameter1 = Double.parseDouble(diametrField1.getText());
            double price1 = Double.parseDouble(diametrField1.getText());

            double diameter2 = Double.parseDouble(diametrField1.getText());
            double price2 = Double.parseDouble(diametrField1.getText());

            double Value1 = calculateValua(diameter1, price1);
            double Value2 = calculateValua(diameter2, price2);
        } catch (NumberFormatException e) {
            resultLabel.setText("Пишіть цифрами ");
        }
    }

    public double calculateValua(double diameter, double price) {
        double radius = diameter / 2;
        return Math.PI * radius * radius / price;
    }
}