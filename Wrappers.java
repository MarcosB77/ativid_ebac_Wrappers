package Wrappers;

/**
 * Aluno_Marcos
 */

public class Wrappers {
    public static void main(String[] args) {
        int resultado = Exemplo1();
        Exemplo_Casting(resultado);
    }

    private static int Exemplo1() {
        int num1 = 15;
        int num2 = 20;

        int resultado = num1 + num2;

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        System.out.println("Resultado: " + resultado);

        return resultado;
    }

    private static void Exemplo_Casting(int resultado) {
        short casting = (short) resultado;

        System.out.println("Resultado com casting para short: " + casting);
    }
}
