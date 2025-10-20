public class Fecha {

    private int mes;
    private int dia;
    private int año;

    public Fecha(int mes, int dia, int año) {
        this.mes = mes;
        this.dia = dia;
        this.año = año;
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

    public void establecer(){
        System.out.println("El día que ingreso es el : " + getDia());
        System.out.println("El mes que ingreso es el : " + getMes());
        System.out.println("El año que ingreso es el : " + getAño());
        System.out.println();
    }
    public void mostrarFecha(){
        System.out.println(getDia() + "/" + getMes()+ "/" + getAño());
    }
}
