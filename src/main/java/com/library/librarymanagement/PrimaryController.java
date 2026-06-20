package com.library.librarymanagement;


import com.sun.javafx.image.impl.OneBitIndexed;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class PrimaryController implements Initializable{

    @FXML
    private TableView<Book> table;
    @FXML
    private TableColumn<Book, Integer> bookIDCol;
    @FXML
    private TableColumn<Book, String> titleCol;
    @FXML
    private TableColumn<Book, LocalDate> PublishYearCol;
    @FXML
    private TableColumn<Book, String> cateCol;
    @FXML
    private TableColumn<Book, Integer> quantityCol;
    
    @FXML
    private TextField txtBookID;
    @FXML
    private TextField txtTitle;
    @FXML
    private TextField txtPublishYear;
    @FXML
    private TextField txtCategory;
    @FXML
    private TextField txtQuantity;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        bookIDCol.setCellValueFactory(new PropertyValueFactory<>("bookID"));
        titleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        PublishYearCol.setCellValueFactory(new PropertyValueFactory<>("publishYear"));
        cateCol.setCellValueFactory(new PropertyValueFactory<>("category"));
        quantityCol.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        ObservableList<Book> books = FXCollections.observableArrayList();
        table.setItems(books);

    }
    
    public void insertBook(ActionEvent e) {
        if (!txtBookID.getText().isEmpty() || !txtTitle.getText().isEmpty() || !txtPublishYear.getText().isEmpty() || !txtCategory.getText().isEmpty() || !txtQuantity.getText().isEmpty()) {
        Book newBook = new Book(
                Integer.parseInt(txtBookID.getText()),  
                txtTitle.getText(), 
                Formatter.formatter(txtPublishYear.getText()),
                txtCategory.getText(),
                Integer.parseInt(txtQuantity.getText())
        );
        table.getItems().add(newBook);            
            txtBookID.clear();
            txtTitle.clear();
            txtPublishYear.clear();
            txtCategory.clear();
            txtQuantity.clear();
        }

    }
    
    
    
}
