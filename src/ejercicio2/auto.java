package Ejercicio2;

public class auto {
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    private String marca;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    private String modelo;

    public int getAño() {
        return año;
    }

    public void setAño() {
        this.año = año;
    }
    private int año;

    public int getPrecio() {
        return precio;

    }

    public void setPrecio(int precio) {

        this.precio = precio;
    }

    private int precio;
public void automovil(String _modelo,String _marca,int _año,int _precio){
    precio=_precio;
    marca=_marca;
    año=_año;
    modelo=_modelo;



}
}
