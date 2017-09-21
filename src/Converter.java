import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.geometry.Rectangle2D;

import java.awt.*;
import java.util.Optional;

import javax.swing.*;
import java.util.Optional;

public class Converter extends Application {
    public void start(Stage PrimaryStage) {
        Rectangle2D primaryScreenBound = Screen.getPrimary().getBounds();
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        String height = JOptionPane.showInputDialog("Enter your height");

        TextInputDialog textInputDialog = new TextInputDialog("140.5");
        textInputDialog.setTitle("Matrics Converter");
        textInputDialog.setHeaderText("Centimeter to Feet and Inches Converter");
        textInputDialog.setContentText("Enter your height in centimeter");
        Optional<String> result = textInputDialog.showAndWait();

        double heightInCmSwing = Double.parseDouble(height);
        double heightInInchesSwing = heightInCmSwing*0.39;
        int heightInFeetSwing = (int) (heightInInchesSwing/12);
        int remainderHeightInchesSwing = (int) (heightInInchesSwing%12);

        double heightInCm = Double.parseDouble(result.get());
        double heightInInches = heightInCm*0.39;
        int heightInFeet = (int) (heightInInches/12);
        int remainderHeightInches = (int) (heightInInches%12);

        JOptionPane.showMessageDialog(null, "your height is " + heightInFeet + "feet " + "and200" +remainderHeightInchesSwing + "inches");



        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Height Converter");
        alert.setContentText("Your height is");
        alert.getDialogPane().setPrefSize(360,180);
        alert.setContentText(heightInFeet + "feet " + remainderHeightInches + " inches");


        System.out.println(primaryScreenBound.getWidth());
        System.out.println(primaryScreenBound.getHeight());
        System.out.println(alert.getDialogPane().getWidth());
        System.out.println(alert.getDialogPane().getHeight());

        alert.setX(primaryScreenBound.getWidth()-alert.getDialogPane().getPrefWidth());
        alert.setY(primaryScreenBound.getHeight()-alert.getDialogPane().getPrefHeight());
        alert.showAndWait();


    }
}
