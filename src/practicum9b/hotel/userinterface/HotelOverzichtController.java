package practicum9b.hotel.userinterface;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import practicum9b.hotel.model.Boeking;
import practicum9b.hotel.model.Hotel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class HotelOverzichtController {
    @FXML
    private Label hotelnaamLabel;
    @FXML
    private ListView<String> boekingenListView;
    @FXML
    private DatePicker overzichtDatePicker;

    private Hotel hotel = Hotel.getHotel();

    public void initialize() {
        hotelnaamLabel.setText("Boekingen hotel " + hotel.getNaam());
        overzichtDatePicker.setValue(LocalDate.now());
        // dit update de data

        toonBoekingen();
    }

    public void toonVorigeDag(ActionEvent actionEvent) {
        LocalDate dagEerder = overzichtDatePicker.getValue().minusDays(1);
        overzichtDatePicker.setValue(dagEerder);
    }

    public void toonVolgendeDag(ActionEvent actionEvent) {
        LocalDate dagLater = overzichtDatePicker.getValue().plusDays(1);
        overzichtDatePicker.setValue(dagLater);
    }

    public void nieuweBoeking(ActionEvent actionEvent) {
        try {
            String fxmlPagina = "Boekingen.fxml";
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPagina));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Boeking");

            Stage huidigeStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            huidigeStage.hide();

            stage.setOnHiding(event -> {
                huidigeStage.show();
            });

            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void toonBoekingen() {
        LocalDate selectedDate = overzichtDatePicker.getValue();

        ObservableList<String> boekingen = FXCollections.observableArrayList();

        for (Boeking boeking : hotel.getBoekingen()) {
            if (!boeking.getAankomstDatum().isAfter(selectedDate) && !boeking.getVertrekDatum().isBefore(selectedDate))
                boekingen.add(
                        String.format(
                                "Naam: %s, Aankomst: %s, Vertrek: %s",
                                boeking.getBoeker().getNaam(),
                                boeking.getAankomstDatum(),
                                boeking.getVertrekDatum()
                        )
                );
            }

        boekingenListView.setItems(boekingen);
    }
}