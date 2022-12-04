/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package TuLancha;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author warne
 */
public class FXMLDashboardController implements Initializable {

    private Label label;
    @FXML
    private BarChart<?, ?> grafBarChart;
    @FXML
    private PieChart grafPieChart;
    @FXML
    private TableView tableView1;
    @FXML
    private LineChart<?, ?> Graf2LineChart;
    @FXML
    private TableColumn column_id;
    @FXML
    private TableColumn column_nombre;
    @FXML
    private TableColumn column_apellidos;

    private ObservableList<Cliente> clientes;
    @FXML
    private TableColumn<?, ?> column_genero;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        this.column_id.setCellValueFactory(new PropertyValueFactory("ID"));
        this.column_nombre.setCellValueFactory(new PropertyValueFactory("nombre"));
        this.column_apellidos.setCellValueFactory(new PropertyValueFactory("apellidos"));
        this.column_genero.setCellValueFactory(new PropertyValueFactory("genero"));
        AccesoDatos.cargarInfoClientes();
        AccesoDatos.cargarInfoVentas();
        clientes = FXCollections.observableArrayList(AccesoDatos.clientes);
        cargarTable();
    }

    public void cargarTable() {
        tableView1.setItems(clientes);
    }

}
