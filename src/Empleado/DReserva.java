/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleado;

import Cliente.*;
import java.sql.Date;

public class DReserva {

    private int idreserva;
    private int idhabitacion;
    private int idcliente;
    private int idempleado;
    private String tipo_reserva;
    private Date fecha_reserva;
    private Date fecha_ingreso;
    private Date fecha_salida;
    private Double costo_alojamiento;
    private String estado;

    public DReserva() {
    }

    public DReserva(int idreserva, int idhabitacion, int idcliente, int idempleado, String tipo_reserva, Date fecha_reserva, Date fecha_ingreso, Date fecha_salida, Double costo_alojamiento, String estado) {
        this.idreserva = idreserva;
        this.idhabitacion = idhabitacion;
        this.idcliente = idcliente;
        this.idempleado = idempleado;
        this.tipo_reserva = tipo_reserva;
        this.fecha_reserva = fecha_reserva;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_salida = fecha_salida;
        this.costo_alojamiento = costo_alojamiento;
        this.estado = estado;
    }

    public int getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(int idreserva) {
        this.idreserva = idreserva;
    }

    public int getIdhabitacion() {
        return idhabitacion;
    }

    public void setIdhabitacion(int idhabitacion) {
        this.idhabitacion = idhabitacion;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }

    public String getTipo_reserva() {
        return tipo_reserva;
    }

    public void setTipo_reserva(String tipo_reserva) {
        this.tipo_reserva = tipo_reserva;
    }

    public Date getFecha_reserva() {
        return fecha_reserva;
    }

    public void setFecha_reserva(Date fecha_reserva) {
        this.fecha_reserva = fecha_reserva;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public Double getCosto_alojamiento() {
        return costo_alojamiento;
    }

    public void setCosto_alojamiento(Double costo_alojamiento) {
        this.costo_alojamiento = costo_alojamiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
