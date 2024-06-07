public class Main {
    public static void main(String[] args) {
        // Se inicia el servicio de productos y menú
        ProductoServicio productoServicio = new ProductoServicio();
        Menu menu = new Menu(productoServicio, new ArchivoServicio());
        // se inicia el menú interactivo
        menu.mostrarMenu();
    }
}
