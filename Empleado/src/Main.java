import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("", "", 1.1);
        Empleado empleado2 = new Empleado("", "", 1.1);

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el Nombre : ");
        empleado1.setNombre(sc.nextLine());
        System.out.println("Ingrese el Apellido Paterno : ");
        empleado1.setApellidoPaterno(sc.nextLine());
        System.out.println("Ingrese el Salario : ");
        empleado1.setSalario(sc.nextDouble());
        sc.nextLine();
        System.out.println(" ");

        System.out.println("Ingrese el Nombre : ");
        empleado2.setNombre(sc.nextLine());
        System.out.println("Ingrese el Apellido Paterno : ");
        empleado2.setApellidoPaterno(sc.nextLine());
        System.out.println("Ingrese el Salario : ");
        empleado2.setSalario(sc.nextDouble());
        sc.nextLine();
        System.out.println(" ");

        empleado1.establecer();
        System.out.println(" ");
        empleado2.establecer();
        System.out.println(" ");

    }
}
