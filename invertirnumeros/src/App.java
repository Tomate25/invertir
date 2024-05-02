import java.util.Scanner;

public class App {

    public static int tamv = 0;
    public static Scanner leer = new Scanner(System.in);
    public static boolean continuar = true;

    public static void main(String[] args) throws Exception {

        // Abdias Natanael Lopez Rocha 2024-1354U

        boolean condiciosalida = true;

        do {
            try {
                System.out.println(
                        "Ingrese el tamaño del arreglo que no supere los 16 y sea mayor a 1 y que tampoco sea negativo ");
                tamv = leer.nextInt();
                condiciosalida = (tamv >= 2 && tamv <= 16) ? false : true;
            } catch (Exception e) {
                System.out.println("Ocurrió un error al ingresar el tamaño del arreglo. Por favor, inténtalo nuevamente.");
                leer.nextLine();
            }
        } while (condiciosalida);

        // Recibimos el array del método
        int array[] = llenado();

        System.out.println("Mostrar");

        Mostrar(array);
        ense1(array);
    }

    public static int[] llenado() {
        int[] arreglo = new int[tamv];

        do {
            try {

                for (int i = 0; i < arreglo.length; i++) {
                    System.out.println("Ingrese el valor [" + i + "]");

                    arreglo[i] = leer.nextInt();
                }
                 continuar=false;
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("ERROR: ingrese dígitos.");
                leer.nextInt();
            }
        } while (continuar);

        return arreglo;
    }

    public static void Mostrar(int[] a) {
        for (int i : a) {
            System.out.println(i);
        }
        System.out.println("Array");
    }

    public static void ense1(int[] z) {
            for (int a = z.length - 1; a >= 0; a--) {
                System.out.println(z[a]);
            }

    }
}
