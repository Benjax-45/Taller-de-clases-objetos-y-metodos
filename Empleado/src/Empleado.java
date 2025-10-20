//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Empleado {
    private String nombre;
    private String apellidoPaterno;
    private Double salario;

    public Empleado(String nombre, String apellidoPaterno, Double salario) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.salario = salario;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getApellidoPaterno() {

        return this.apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {

        this.apellidoPaterno = apellidoPaterno;
    }

    public Double getSalario() {

        return this.salario;
    }

    public void setSalario(Double salario) {

        this.salario = salario;
    }

    public void establecer() {
        System.out.println("El Nombre es : " + getNombre());
        System.out.println("El Apellido Paterno es :" + getApellidoPaterno());
        if (getSalario() > 0.0) {
            System.out.println("El Salario que gana mensual es :" + getSalario());
            System.out.println("El Salario que gana anual es : " + getSalario() * 12);
            setSalario(getSalario() * 0.1 + getSalario())  ;
            System.out.println("El Salario despues de un aumento del 10% es de :" + getSalario());
        } else {
            System.out.println("NO PUEDES TENER UN SALARIO MENOR A 0");
        }

    }
}
