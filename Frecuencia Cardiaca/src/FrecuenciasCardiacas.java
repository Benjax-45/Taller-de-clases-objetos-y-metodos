public class FrecuenciasCardiacas {

    private String nombre;
    private String apellido;
    private int mes;
    private int dia;
    private int año;

    public FrecuenciasCardiacas(String nombre, String apellido, int mes, int dia, int año) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mes = mes;
        this.dia = dia;
        this.año = año;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getAño() {
        return año;
    }
    public void setAño(int año) {
        this.año = año;
    }
    public int edad(){
        int edadPaciente;
        edadPaciente = 2025 - getAño();
        return edadPaciente;
    }
    public int frecuenciaCardiacaMáxima(){
        int maxima;
        maxima = 220 - edad();
        return maxima;
    }
    public void frecuenciaCardiacaEsperada(){
        double bajo, alto;
        bajo = frecuenciaCardiacaMáxima() * 0.5 ;
        alto = frecuenciaCardiacaMáxima() * 0.85;
        System.out.println("La frecuencia Cardiaca Esperada debe estar entre: " + bajo + " LPM y " + alto + " LPM");
    }
    public void mostrar(){
        System.out.println("El nombre es: " + getNombre());
        System.out.println("El apellido es: " + getApellido());
        System.out.println("La fecha de nacimiento es el :" + getDia() + "/" + getMes()+ "/" + getAño());
    }
}
