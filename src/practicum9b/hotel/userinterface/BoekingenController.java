package practicum9b.hotel.userinterface;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class BoekingenController {

    @FXML
    private DatePicker aankomstdatum;

    @FXML
    private TextField adres;

    @FXML
    private ComboBox<?> kamertype;

    @FXML
    private TextField naam;

    @FXML
    private DatePicker vertrekdatum;

    @FXML
    void updateBoekingenOverzicht() {
        // Code om het boekingen-overzicht te updaten
        System.out.println("Boekingen-overzicht wordt geüpdatet in de BoekingenController.");
    }

    @FXML
    void Reset(ActionEvent event) {

    }

}
