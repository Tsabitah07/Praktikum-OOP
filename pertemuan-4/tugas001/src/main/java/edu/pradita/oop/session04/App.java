package edu.pradita.oop.session04;

import javafx.application.Application;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * TUGAS001 - MVC CRUD Mahasiswa (JavaFX)
 * ========================================
 * VIEW: Tampilan UI menggunakan JavaFX TableView.
 *
 * Fitur yang harus diimplementasikan:
 * - TableView dengan kolom: NIM (int), Nama, Prodi
 * - Form input: TextField untuk NIM, Nama, Prodi
 * - Tombol "Tambah" → panggil controller.addStudent()
 * - Tombol "Hapus Terpilih" → panggil controller.removeStudent()
 * - Tombol "Clear Semua" → panggil controller.clearAll()
 * - Label pesan error jika input tidak valid
 */
public class App extends Application {

    // Controller instance
    private final StudentController controller = new StudentController();

    @Override
    public void start(Stage primaryStage) {

        // TableView<Student>
        TableView<Student> tableView = new TableView<>();

        // Kolom NIM (int)
        TableColumn<Student, Number> nimCol = new TableColumn<>("NIM");
        nimCol.setCellValueFactory(data -> new SimpleIntegerProperty(data.getValue().getNim()));
        nimCol.setPrefWidth(100);

        // Kolom Nama (String)
        TableColumn<Student, String> nameCol = new TableColumn<>("Nama");
        nameCol.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getName()));
        nameCol.setPrefWidth(200);

        // Kolom Prodi (String)
        TableColumn<Student, String> majorCol = new TableColumn<>("Prodi");
        majorCol.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getMajor()));
        majorCol.setPrefWidth(200);

        // Tambahkan kolom dan bind data
        tableView.getColumns().addAll(nimCol, nameCol, majorCol);
        tableView.setItems(controller.getStudents());

        // Input fields
        TextField nimField = new TextField();
        nimField.setPromptText("NIM (angka)");

        TextField nameField = new TextField();
        nameField.setPromptText("Nama");

        TextField majorField = new TextField();
        majorField.setPromptText("Prodi");

        // Tombol
        Button addButton = new Button("Tambah");
        Button deleteButton = new Button("Hapus Terpilih");
        Button clearButton = new Button("Clear Semua");

        // Pesan
        Label messageLabel = new Label();

        // Event handler addButton
        addButton.setOnAction(e -> {
            try {
                int nim = Integer.parseInt(nimField.getText().trim());
                controller.addStudent(nim, nameField.getText(), majorField.getText());
                nimField.clear(); nameField.clear(); majorField.clear();
                messageLabel.setText("Mahasiswa berhasil ditambahkan!");
            } catch (NumberFormatException ex) {
                messageLabel.setText("NIM harus berupa angka!");
            } catch (IllegalArgumentException ex) {
                messageLabel.setText(ex.getMessage());
            }
        });

        // Event handler deleteButton
        deleteButton.setOnAction(e -> {
            Student selected = tableView.getSelectionModel().getSelectedItem();
            if (selected == null) {
                messageLabel.setText("Pilih mahasiswa yang ingin dihapus!");
            } else {
                controller.removeStudent(selected);
                messageLabel.setText("Mahasiswa berhasil dihapus!");
            }
        });

        // Event handler clearButton
        clearButton.setOnAction(e -> {
            controller.clearAll();
            messageLabel.setText("Semua data dihapus!");
        });

        // Layout form
        GridPane form = new GridPane();
        form.setHgap(10); form.setVgap(8);
        form.setPadding(new Insets(10));

        form.add(new Label("NIM:"),   0, 0); form.add(nimField,   1, 0);
        form.add(new Label("Nama:"),  0, 1); form.add(nameField,  1, 1);
        form.add(new Label("Prodi:"), 0, 2); form.add(majorField, 1, 2);

        HBox buttons = new HBox(10, addButton, deleteButton, clearButton);
        buttons.setPadding(new Insets(5, 0, 0, 0));
        buttons.setAlignment(Pos.CENTER_LEFT);

        form.add(buttons,      1, 3);
        form.add(messageLabel, 1, 4);

        // Layout utama
        BorderPane root = new BorderPane();
        root.setCenter(tableView);
        root.setBottom(form);

        Scene scene = new Scene(root, 600, 450);
        primaryStage.setTitle("Tugas001 - CRUD Mahasiswa");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
