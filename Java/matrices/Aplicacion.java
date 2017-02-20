import java.util.Scanner;
import java.util.Vector;
import Jama.Matrix;
class Aplicacion {

    static Vector<Matrix> matrices = new Vector<Matrix>();
    
    static Scanner in = new Scanner(System.in);
    public static void main (String[] args) {
        //System.out.println("Hello");
        char c = 0;
        while (c != '0') {
            menu();
            c = leerTecla();
    //        System.out.println("Ha seleccionado la opcion: " + c);
            if (c == '1') {
                opcion1();
            } else if (c == '2') {
                opcion2();
            } else if (c == '3') {
                opcion3();
            } else if (c == '4') {
                opcion4();
            }
        }
    }

    public static void menu () {
        System.out.println("   Menu de matrices");
        System.out.println("1. Introducir matriz");
        System.out.println("2. Mostrar matriz");
        System.out.println("3. Multiplicar matrices");
        System.out.println("4. Inversa");
        System.out.println("0. Salir");
    }

    public static char leerTecla () {
        String inputString = in.next();
        return inputString.charAt(0);
    }

    public static void opcion1() {
        System.out.println("\n-->Ha elegido la opcion 1.");
        Matrix matriz = LeerMatriz(in);
        matrices.addElement(matriz);
    }

    public static void opcion2() {
        System.out.println("Ha seleccionado la opcion 2");
        for (int i = 0; i < matrices.size(); i++) {
            matrices.elementAt(i).print(2,5);
        }
    }

    public static void opcion3() {
        System.out.println("Ha seleccionado la opcion 3");
        System.out.println("Primera matriz:");
        int m1 = in.nextInt();
        System.out.println("Segunda matriz:");
        int m2 = in.nextInt();
        Matrix prod = matrices.elementAt(m1).times(matrices.elementAt(m2));
        matrices.addElement(prod);
    }

    public static void opcion4() {
        System.out.println("Ha seleccionado la opcion 4");
        System.out.println("Seleccione matriz:");
        int m1 = in.nextInt();
        Matrix inv = matrices.elementAt(m1).inverse();
        matrices.addElement(inv);
    }

    public static Matrix LeerMatriz(Scanner in) {
        System.out.println("Numero de filas:");
        int filas = in.nextInt();
        System.out.println("Numero de columnas:");
        int columnas = in.nextInt();
        double[][] value = new double[filas][columnas];
        for (int i=0; i< filas; i++) {
            for (int j=0; j< columnas; j++) {
                System.out.println("Celda (" + (i + 1) + ", " +
                (j + 1) + "): ");
                value[i][j] = in.nextFloat();
            }
        }
        Matrix matrix = new Matrix(value);
        return matrix;
    }

}
