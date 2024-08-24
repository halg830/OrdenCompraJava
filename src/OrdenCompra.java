import java.util.Date;

public class OrdenCompra {
    private Integer identificador;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos = new Producto[4];
    private int indiceProducto;

    private static Integer ultimoId = 0;

    public OrdenCompra(){
        this.identificador = ++ultimoId;
    }

    public OrdenCompra(String descripcion){
        this();
        this.descripcion = descripcion;
    }

    public Integer getIdentificador(){
        return this.identificador;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    public Date getFecha(){
        return this.fecha;
    }

    public String getCliente(){
        return this.cliente.getNombre() + " " + this.cliente.getApellido();
    }

    public String getProductos(){
        String detalle = "Productos: \n";

        int contador = 1;
        for(Producto producto : this.productos){
            detalle += contador++ + " Fabricante: " + producto.getFabricante() + ", Nombre: " + producto.getNombre() + ", Precio: " + producto.getPrecio() + "\n";
        }

        return detalle;
    }

    public String getGranTotal(){
        int total=0;
        for(Producto producto : productos){
            total+=producto.getPrecio();
        }
        return "El gran total es: " + total;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public void setFecha(Date fecha){
        this.fecha = fecha;
    }

    public void addProducto(Producto producto){
        if(indiceProducto<this.productos.length){
            this.productos[indiceProducto++] = producto;
        }
    }
}
