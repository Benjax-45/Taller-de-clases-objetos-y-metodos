import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Fecha date = new Fecha(1,1,10000);
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el Día ");
        date.setDia(sc.nextInt());
        System.out.println("Ingrese el Mes");
        date.setMes(sc.nextInt());
        System.out.println("Ingrese el Año");
        date.setAño(sc.nextInt());

        date.establecer();

        date.mostrarFecha();
    }
}

