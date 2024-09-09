package funcion;

public class datos {

    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] pasos = new int[5];
            int suma = 0;

            for (int i = 0; i < 5; i++) {
                System.out.println("Ingrese la cantidad de pasos que dio el día " + (i + 1));
                pasos[i] = scanner.nextInt(); // Almacena cada valor en el array
                suma += pasos[i];
            }

            double promedio = (double) suma / pasos.length;
            System.out.println("El promedio de pasos es: " + promedio);

            // Imprimir el array para verificar que los datos estén almacenados correctamente
            System.out.println("Pasos por día:");
            for (int i = 0; i < pasos.length; i++) {
                System.out.println("Día " + (i + 1) + ": " + pasos[i] + " pasos");
            }
        }
    }

    //Almacenando los datos en un array

    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] pasos = new int[5];
            int suma = 0;

            // Almacenar datos en un array
            for (int i = 0; i < 5; i++) {
                System.out.println("Ingrese la cantidad de pasos que dio el día " + (i + 1));
                pasos[i] = scanner.nextInt(); // Almacena cada valor en el array
                suma += pasos[i];
            }

            double promedio = (double) suma / pasos.length;
            System.out.println("El promedio de pasos es: " + promedio);

            // Imprimir el array utilizando un ciclo for
            System.out.println("Pasos por día:");
            for (int i = 0; i < pasos.length; i++) {
                System.out.println("Día " + (i + 1) + ": " + pasos[i] + " pasos");
            }
        }
    }

    //usando un ciclo while

    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] pasos = new int[5];
            int suma = 0;
            int i = 0;

            while (i < 5) {
                System.out.println("Ingrese la cantidad de pasos que dio el día " + (i + 1));
                pasos[i] = scanner.nextInt(); // Almacena cada valor en el array
                suma += pasos[i];
                i++; // Incrementa el contador
            }

            double promedio = (double) suma / pasos.length;
            System.out.println("El promedio de pasos es: " + promedio);

            // Imprimir el array para verificar que los datos estén almacenados correctamente
            System.out.println("Pasos por día:");
            i = 0; // Reinicia el contador
            while (i < pasos.length) {
                System.out.println("Día " + (i + 1) + ": " + pasos[i] + " pasos");
                i++; // Incrementa el contador
            }
        }
    }

    //imprimir usando un ciclo for.

    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] pasos = new int[5];
            int suma = 0;
            int i = 0;

            while (i < 5) {
                System.out.println("Ingrese la cantidad de pasos que dio el día " + (i + 1));
                pasos[i] = scanner.nextInt(); // Almacena cada valor en el array
                suma += pasos[i];
                i++; // Incrementa el contador
            }

            double promedio = (double) suma / pasos.length;
            System.out.println("El promedio de pasos es: " + promedio);

            // Imprimir el array utilizando un ciclo for
            System.out.println("Pasos por día:");
            for (i = 0; i < pasos.length; i++) {
                System.out.println("Día " + (i + 1) + ": " + pasos[i] + " pasos");
            }
        }
    }
}
