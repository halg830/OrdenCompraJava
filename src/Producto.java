public class Producto {
    public String fabricante;
    public String nombre;
    public int precio;

    public Producto(String fabricante, String nombre, int precio){
        this.fabricante = fabricante;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getFabricante(){
        return this.fabricante;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getPrecio(){
        return this.precio;
    }

    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setPrecio(int precio){
        this.precio = precio;
    }
}
