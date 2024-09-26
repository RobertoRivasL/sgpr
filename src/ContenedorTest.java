import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Scanner;

public class ContenedorTest {

    private Contenedor contenedor;
    private Validaciones mockValidaciones;
    private Scanner mockScanner;

    @Before
    public void setUp() {
        contenedor = new Contenedor();
        mockValidaciones = Mockito.mock(Validaciones.class);
        mockScanner = Mockito.mock(Scanner.class);

        // Inyectar el mock en el contenedor
        contenedor.validar = mockValidaciones;
    }

    @Test
    public void testAlmacenarCliente_NombreCorrecto() {
        // Simular la entrada del usuario
        when(mockScanner.nextLine()).thenReturn("Juan Perez", "01/01/1990", "8", "12345678", "Santiago", "AfpModel", "Fonasa", "MiCasa", "22");
        when(mockValidaciones.validarNombreApellido("Juan Perez")).thenReturn(true);
        when(mockValidaciones.validarFechaNacimiento("01/01/1990")).thenReturn(true);
        when(mockValidaciones.validarRut(12345678)).thenReturn(true);
        when(mockValidaciones.validarDireccion("MiCasa")).thenReturn(true);
        when(mockValidaciones.validarEdad(22)).thenReturn(true);
        when(mockValidaciones.validarAfp("AfpModel")).thenReturn(true);

        // Ejecutar el método
        contenedor.almacenarCliente();

        // Verificar que el cliente fue agregado
        assertEquals(1, contenedor.listaAsesoria.size());
    }

    @Test
    public void testAlmacenarCliente_NombreIncorrecto() {
        // Simular un nombre incorrecto
        when(mockScanner.nextLine()).thenReturn("JP");

        when(mockValidaciones.validarNombreApellido("JP")).thenReturn(false);

        // Ejecutar el método
        contenedor.almacenarCliente();

        // Verificar que no se almacenó ningún cliente
        assertEquals(0, contenedor.listaAsesoria.size());
    }

    // Pruebas adicionales para otros métodos de Contenedor.java pueden seguir este patrón
}

