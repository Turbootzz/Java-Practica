package practicum9b.hotel.userinterface;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import practicum9b.hotel.model.Boeking;
import practicum9b.hotel.model.Hotel;
import practicum9b.hotel.model.Kamer;
import practicum9b.hotel.model.KamerType;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BoekingenController {

    public Label titel;
    private Hotel hotel = Hotel.getHotel();

    public BoekingenController() {
    }

    @FXML
    private DatePicker aankomstdatum;

    @FXML
    private TextField adres;

    @FXML
    private ComboBox<KamerType> kamertype;

    @FXML
    private TextField naam;

    @FXML
    private DatePicker vertrekdatum;

    public void initialize() {
        if (kamertype != null) {
            List<KamerType> kamerTypen = hotel.getKamerTypen();
            kamertype.setItems(FXCollections.observableArrayList(kamerTypen));
        } else {
            System.err.println("Hotel is niet geïnitialiseerd!");
        }
    }

    @FXML
    public void updateBoekingenOverzicht() {
        // Code om het boekingen-overzicht te updaten
        if(naam.getText() == null || naam.getText().isEmpty()) {
            titel.setText("naam is niet gevuld!");
            titel.setStyle("-fx-text-fill: red;");
            return;
        }
        if(adres.getText() == null || adres.getText().isEmpty()) {
            titel.setText("adres is niet gevuld!");
            titel.setStyle("-fx-text-fill: red;");
            return;
        }
        if(aankomstdatum.getValue() == null) {
            titel.setText("aankomstdatum is niet gevuld!");
            titel.setStyle("-fx-text-fill: red;");
            return;
        }
        if(vertrekdatum.getValue() == null) {
            titel.setText("vertrekdatum is niet gevuld!");
            titel.setStyle("-fx-text-fill: red;");
            return;
        }
        if(kamertype.getValue() == null) {
            titel.setText("kamertype is niet gevuld!");
            titel.setStyle("-fx-text-fill: red;");
            return;
        }

        try {
            hotel.voegBoekingToe(
                    aankomstdatum.getValue(),
                    vertrekdatum.getValue(),
                    naam.getText(),
                    adres.getText(),
                    kamertype.getValue()
            );
            titel.setText("Boeking geplaatst!");
            titel.setStyle("-fx-text-fill: green;");
            System.out.println("Boekingen-overzicht wordt geüpdatet in de BoekingenController.");
        } catch (Exception e) {
            titel.setText("Kan geen boekingen vinden: " + e.getMessage());
            titel.setStyle("-fx-text-fill: red;");
        }
    }

    @FXML
    public void Reset(ActionEvent event) {
        naam.setText("");
        adres.setText("");
        aankomstdatum.setValue(null);
        vertrekdatum.setValue(null);
        kamertype.setValue(null);
    }
}