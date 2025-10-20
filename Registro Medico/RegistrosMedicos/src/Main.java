//* Ejercicio 3.17 - Computarizacion de registros medicos
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer nombre: ");
        String primerNombre = scanner.nextLine();
        System.out.print("Ingresa el apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingresa el sexo: ");
        String sexo = scanner.nextLine();
        System.out.print("Ingresa el día de nacimiento: ");
        int diaNacimiento = scanner.nextInt();
        System.out.print("Ingresa el mes de nacimiento: ");
        int mesNacimiento = scanner.nextInt();
        System.out.print("Ingresa el año de nacimiento: ");
        int anoNacimiento = scanner.nextInt();
        System.out.print("Ingresa la altura en centímetros: ");
        double altura = scanner.nextDouble();
        System.out.print("Ingresa el peso en kilogramos: ");
        double peso = scanner.nextDouble();
        PerfilMedico perfil = new PerfilMedico(primerNombre, apellido, sexo, diaNacimiento, mesNacimiento, anoNacimiento, altura, peso);
        System.out.println("\nInformación del Perfil Médico: ");
        System.out.println("Primer nombre: " + perfil.getPrimerNombre());
        System.out.println("Apellido: " + perfil.getApellido());
        System.out.println("Sexo: " + perfil.getSexo());
        System.out.println("Fecha de nacimiento: " + perfil.getDiaNacimiento() + "/" + perfil.getMesNacimiento() + "/" + perfil.getAnoNacimiento());
        System.out.println("Altura: " + perfil.getAltura() + " cm");
        System.out.println("Peso: " + perfil.getPeso() + " kg");

        System.out.println("\nRESULTADOS:");
        System.out.println("Edad: " + perfil.calcularEdad() + " años");
        System.out.println("BMI: " + perfil.calcularBMI() + " (" + perfil.obtenerCategoriaBMI() + ")");
        System.out.println("Frecuencia cardiaca máxima: " + perfil.frecuenciaCardiacaMaxima() + " latidos por minuto");
        System.out.println("Rango de frecuencia cardiaca esperada: " + perfil.rangoFrecuenciaCardiaca());

        System.out.println("\nTabla de Valores del BMI:");
        System.out.println("Bajo peso: menos de 18.5");
        System.out.println("Normal: entre 18.5 y 24.9");
        System.out.println("Sobrepeso: entre 25 y 29.9");
        System.out.println("Obeso: 30 o más");

    }
}