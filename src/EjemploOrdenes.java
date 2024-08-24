import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {
        Producto[] productos = {
                new Producto("Konoha", "Kunai", 3000),
                new Producto("Tsunade", "Katana", 25000),
                new Producto("Tobirama", "Shuriken", 1000),
                new Producto("Dunder mifflin", "Papel", 500),
                new Producto("Gryffindor", "Varita", 15000),
                new Producto("Stark Industries", "Arc Reactor", 1000000),
                new Producto("Wayne Enterprises", "Batarang", 7000),
                new Producto("Umbrella Corporation", "Virus-T", 500000),
                new Producto("Oscorp", "Glider", 300000),
                new Producto("Acme Corporation", "Dinamita", 2000),
                new Producto("Jurassic Park", "Dinosaurio", 5000000),
                new Producto("Wakanda", "Vibranium", 10000000),

        };

        Cliente[] clientes = {
                new Cliente("Gaara", "Del Desierto"),
                new Cliente("Kakashi", "Sensei"),
                new Cliente("Naruto", "Uzumaki")
        };

        OrdenCompra[] ordenes = {
                new OrdenCompra("Primera orden"),
                new OrdenCompra("Segunda orden"),
                new OrdenCompra("Tercera orden")
        };

        for(int i = 0; i<ordenes.length; i++){
            ordenes[i].setCliente(clientes[i]);
            ordenes[i].setFecha(new Date());

            int limite = (i+1)*4;
            for (int j = i*4; j<limite; j++) {
                ordenes[i].addProducto(productos[j]);
            }

            System.out.println("Orden de compra " + (i+1));
            System.out.println("Identificador: " + ordenes[i].getIdentificador());
            System.out.println("Descripción: " + ordenes[i].getDescripcion());
            System.out.println("Fecha: " + ordenes[i].getFecha());
            System.out.println("Cliente: " + ordenes[i].getCliente());
            System.out.print(ordenes[i].getProductos());
            System.out.println("Gran total: " + ordenes[i].getGranTotal());
            System.out.println();
        }
    }
}
