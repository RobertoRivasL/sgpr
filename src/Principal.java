import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Contenedor contenedor = new Contenedor(); // Crear instancia de la clase Contenedor


        int op;
        do {
            System.out.println("----- MENÚ PRINCIPAL -----");
            System.out.println("1. Almacenar cliente");
            System.out.println("2. Almacenar profesional");
            System.out.println("3. Almacenar administrativo");
            System.out.println("4. Almacenar capacitación");
            System.out.println("5. Eliminar usuario");
            System.out.println("6. Listar usuarios");
            System.out.println("7. Listar usuarios por tipo");
            System.out.println("8. Listar capacitaciones");
            System.out.println("9. Salir");

            System.out.print("Ingrese una opcion: ");
            op = leer.nextInt();

            switch (op) {
                case 1 -> contenedor.almacenarCliente();
                case 2 -> contenedor.almacenarProfesional();
                case 3 -> contenedor.almacenarAdministrativo();
                case 4 -> contenedor.almacenarCapacitacion();
                case 5 -> contenedor.eliminarUsuario();
                case 6 -> contenedor.listarUsuarios();
                case 7 -> contenedor.listarUsuariosTipo();
                case 8 -> contenedor.listarCapacitaciones();
                case 9 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("Opción inválida. Intente nuevamente.");
            }
            System.out.println();
        } while (op != 9);
    }
}

