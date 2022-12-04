/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package TuLancha;

import java.net.URL;
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
    
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        clientes= FXCollections.observableArrayList();
        this.column_id.setCellValueFactory(new PropertyValueFactory("ID"));
        this.column_nombre.setCellValueFactory(new PropertyValueFactory("nombre"));
        this.column_apellidos.setCellValueFactory(new PropertyValueFactory("apellidos"));
        cargarTable();
    }    
    
    public void cargarTable(){
        Cliente ncliente = new Cliente("12123dsa1","Warner","Moscoso Morales");
        Cliente n1cliente = new Cliente("18ds1zd1y","Joylin","Benavidez nose");
        Cliente n2cliente = new Cliente("1238dsa1s","Mileidy","Corrales Chan");
        Cliente n3cliente = new Cliente("sada1sda1","Deivid","Paniagua Porras");
        Cliente n4cliente = new Cliente("saud1sqa1","Yuliana","Sánchez García");
        
        clientes.add(ncliente);
        clientes.add(n1cliente);
        clientes.add(n2cliente);
        clientes.add(n3cliente);
        clientes.add(n4cliente);
        
        tableView1.setItems(clientes);

    }
    
}
