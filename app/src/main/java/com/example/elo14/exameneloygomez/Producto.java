package com.example.elo14.exameneloygomez;

import java.io.Serializable;

/**
 * Created by elo14 on 12/12/2017.
 */

public class Producto implements Serializable{
    private int idProducto, imagen, galeriaImagenes1, galeriaImagenes2, galeriaImagenes3;
    private String nombreProducto, descripcion;
    private double precio;

    public Producto(int idProducto, int imagen, String nombreProducto, String descripcion, double precio, int galeriaImagenes1, int galeriaImagenes2, int galeriaImagenes3) {
        this.idProducto = idProducto;
        this.imagen = imagen;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.galeriaImagenes1 = galeriaImagenes1;
        this.galeriaImagenes2 = galeriaImagenes2;
        this.galeriaImagenes3 = galeriaImagenes3;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getGaleriaImagenes1() {
        return galeriaImagenes1;
    }

    public void setGaleriaImagenes1(int galeriaImagenes1) {
        this.galeriaImagenes1 = galeriaImagenes1;
    }

    public int getGaleriaImagenes2() {
        return galeriaImagenes2;
    }

    public void setGaleriaImagenes2(int galeriaImagenes2) {
        this.galeriaImagenes2 = galeriaImagenes2;
    }

    public int getGaleriaImagenes3() {
        return galeriaImagenes3;
    }

    public void setGaleriaImagenes3(int galeriaImagenes3) {
        this.galeriaImagenes3 = galeriaImagenes3;
    }

}
