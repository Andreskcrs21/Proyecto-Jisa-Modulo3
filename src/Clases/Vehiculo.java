
package Clases;

public class Vehiculo {
    private String codigo;
    private String marca;
    private String color;
    private String modelo;
    private String categoria;
    private String existencia;
    private String año;
    private String precio;
    private String sucursal;

    public Vehiculo(String codigo, String marca, String color, String modelo,
            String categoria, String existencia, String año, String precio, String sucursal) {
        this.codigo = codigo;
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.categoria = categoria;
        this.existencia = existencia;
        this.año = año;
        this.precio = precio;
        this.sucursal = sucursal;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getExistencia() {
        return existencia;
    }

    public void setExistencia(String existencia) {
        this.existencia = existencia;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    
}
