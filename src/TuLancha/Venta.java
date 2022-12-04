/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TuLancha;

/**
 *
 * @author warne
 */
public class Venta {

    private String mes;
    private double totalVentas;

    public Venta(String mes, double totalVentas) {
        this.mes = mes;
        this.totalVentas = totalVentas;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public double getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(double totalVentas) {
        this.totalVentas = totalVentas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Venta{");
        sb.append("mes=").append(mes);
        sb.append(", totalVentas=").append(totalVentas);
        sb.append('}');
        return sb.toString();
    }
    
}
