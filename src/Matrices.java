
import java.util.Random;
import javax.swing.JOptionPane;

public class Matrices {

    public static void main(String[] args) {
        // Solicitamos el numero de filas y columnas que tendran las matrices y se asigna como N para filas y M para las columnas
        int N = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de filas:",
                "Matrices", JOptionPane.QUESTION_MESSAGE));
        int M = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de columnas:",
                "Matrices", JOptionPane.QUESTION_MESSAGE));

        // Aqui declaramos las tres matrices que vamos a necesitar las dos que se multiplicaran y la tercera que sera el resultadoasignando
        // les asignamos el tamaño que se capturo en N y M
        int[][] matriz1 = new int[N][M];
        int[][] matriz2 = new int[N][M];
        int[][] resultado = new int[N][M];

        // Usamos la funcion ramdom, para llenar las matrices con datos entre 0 y 10
        // haciendo uso de dos ciclo for que van hasta que sean menor que los valores de N y M
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz1[i][j] = random.nextInt(10); // Valores aleatorios entre 0 y 9
                matriz2[i][j] = random.nextInt(10);
            }
        }

        // Multiplicamos cada numero de la matriz1 * matriz2 y los alamcenamos en la matriz de resultado
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                resultado[i][j] = matriz1[i][j] * matriz2[i][j];
            }
        }

        // Usamos la clase StringBuilder, para crear la cadena que luego mostramos con Joptionpane
        // usamos \n para dar los saldos de linea y organizar mejor la impresion
        StringBuilder resultadoStr = new StringBuilder("Matriz 1:\n");
        resultadoStr.append(imprimirMatriz(matriz1));

        resultadoStr.append("x\n");

        resultadoStr.append("Matriz 2:\n");
        resultadoStr.append(imprimirMatriz(matriz2));

        resultadoStr.append("=\n");

        resultadoStr.append(imprimirMatriz(resultado));

        JOptionPane.showMessageDialog(null, resultadoStr.toString(),
                "Resultado de la Multiplicacion", JOptionPane.QUESTION_MESSAGE);
    }

    // Esta funcion imprime la matriz la recorre con dos ciclos, se agregan los corchetes y los saltos de linea
    public static String imprimirMatriz(int[][] matriz) {
        StringBuilder matrizStr = new StringBuilder();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizStr.append("[").append(matriz[i][j]).append("] ");
            }
            matrizStr.append("\n");
        }
        matrizStr.append("\n");
        return matrizStr.toString();
    }
}
