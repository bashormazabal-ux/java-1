import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ESTUDIANTE estudiante = new ESTUDIANTE(
                "joaquin",
                "informatica",
                67

                );

        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese carrera: ");
        String carrera = scanner.nextLine();

        System.out.print("Ingrese edad: ");
        int edad = scanner.nextInt();

        ESTUDIANTE ESTUDIANTE = new ESTUDIANTE(nombre, carrera, edad);


        if (edad < 18) {
            System.out.println("Estudiante menor de edad.");
        } else if (edad < 25) {
            System.out.println("Estudiante joven.");
        } else {
            System.out.println("Estudiante adulto.");
        }
        estudiante.mostrarInformacion();


    }
}