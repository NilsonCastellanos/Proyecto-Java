package Empleado;

public class DProducto {

    private int idproducto;
    private String nombre;
    private String descripcion;
    private String unidad_medida;
    private int stock;
    private Double precio_venta;

    //Constructor vacío
    public DProducto() {
    }
    //constructor sobrecargado

    public DProducto(int idproducto, String nombre, String descripcion, String unidad_medida, int stock, Double precio_venta) {
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.unidad_medida = unidad_medida;
        this.stock = stock;
        this.precio_venta = precio_venta;
    }
    //get and set

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUnidad_medida() {
        return unidad_medida;
    }

    public void setUnidad_medida(String unidad_medida) {
        this.unidad_medida = unidad_medida;
    }

    public int getStock() {

        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(Double precio_venta) {
        this.precio_venta = precio_venta;
    }

}
