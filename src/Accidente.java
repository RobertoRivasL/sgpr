/**
 * Clase que representa un accidente.
 * Contiene detalles sobre el accidente, como identificador, RUT del cliente, fecha, hora, lugar, origen y consecuencias.
 *
 * @version 2.0
 * @author Roberto Rivas
 * @author Billy Alvarez
 * @author Roberto Orellana
 * @author Nicolas Massot
 */
public class Accidente {

    // Atributos
    private int idAcc; // Identificador del accidente
    private int rutCliente; // RUT del cliente
    private String dia; // Día del accidente
    private String hora; // Hora del accidente
    private String lugar; // Lugar del accidente
    private String origen; // Origen del accidente
    private String consecuencias; // Consecuencias del accidente

    // Constructores

    /**
     * Constructor por defecto.
     */
    public Accidente() {
    }

    /**
     * Constructor con todos los atributos del accidente.
     *
     * @param idAcc Identificador del accidente
     * @param rutCliente RUT del cliente
     * @param dia Día del accidente
     * @param hora Hora del accidente
     * @param lugar Lugar del accidente
     * @param origen Origen del accidente
     * @param consecuencias Consecuencias del accidente
     */
    public Accidente(int idAcc, int rutCliente, String dia, String hora, String lugar, String origen, String consecuencias) {
        this.idAcc = idAcc;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.origen = origen;
        this.consecuencias = consecuencias;
    }

    // Métodos Getters y Setters

    public int getIdAcc() {
        return idAcc;
    }

    public void setIdAcc(int idAcc) {
        this.idAcc = idAcc;
    }

    public int getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(int rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getConsecuencias() {
        return consecuencias;
    }

    public void setConsecuencias(String consecuencias) {
        this.consecuencias = consecuencias;
    }

    /**
     * Muestra los datos del accidente en formato de cadena.
     *
     * @return Cadena con los datos del accidente.
     */
    @Override
    public String toString() {
        return "Accidente{" +
                "idAcc=" + idAcc +
                ", rutCliente=" + rutCliente +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", origen='" + origen + '\'' +
                ", consecuencias='" + consecuencias + '\'' +
                '}';
    }

    /**
     * Método principal.
     */
    public static void main(String[] args) {
        // Implementación del método principal si es necesario
    }
}