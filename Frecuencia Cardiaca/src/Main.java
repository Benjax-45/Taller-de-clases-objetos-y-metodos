import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    FrecuenciasCardiacas paciente = new FrecuenciasCardiacas("", "", 1,1,1000);
    Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la persona: ");
        paciente.setNombre(sc.nextLine());
        System.out.println("Ingrese el apellido de la persona: ");
        paciente.setApellido(sc.nextLine());
        System.out.println("Ingrese el dia de nacimiento de la persona: ");
        paciente.setDia(sc.nextInt());
        System.out.println("Ingrese el mes de nacimiento de la persona: ");
        paciente.setMes(sc.nextInt());
        System.out.println("Ingrese el año de nacimiento de la persona: ");
        paciente.setAño(sc.nextInt());

        int edadPaciente = paciente.edad();
        System.out.println(" ");

        int frecuenciaMaxima = paciente.frecuenciaCardiacaMáxima();
        System.out.println(" ");


        paciente.mostrar();
        System.out.println(" ");

        System.out.println("La edad de: " + paciente.getNombre() + " " + paciente.getApellido() + " es de : " + edadPaciente + " años");

        System.out.println("La frecuencia cardiaca máxima tiene que puede tener es de: " + frecuenciaMaxima + " LPM");

        paciente.frecuenciaCardiacaEsperada();
    }
}

