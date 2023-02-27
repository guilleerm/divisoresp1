import java.sql.SQLOutput;

public class Divisores {
    public void visualizarDivisores(int valor) {
        String divisores = "Divisores de " + valor + ": ";
        for (int i = 1; i < valor; i++) {
            if (valor % i == 0) {
                divisores += i + " ";
            }
        }
        System.out.println(divisores);
    }

    public void numeroDivisores(int numero) {
        int contador = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                contador++;
            }
        }
        System.out.println("\n El numero " + numero + " tiene " + contador + " divisores");
    }

    public void sumarDivisores(int numero) {
        int contador = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                contador += i;
            }
        }
        System.out.println("\n El numero " + numero + " tiene " + contador + " divisores");
    }

}