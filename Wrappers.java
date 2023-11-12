package Wrappers;

/**
 * Aluno_Marcos
 */

public class Wrappers {

    public static void main(String[] args) {
        int resultadoExemplo = exemplo();
        exemplo2(resultadoExemplo);
    }

    private static int exemplo() {
        int num = 65;
        System.out.println("Exemplo: " + num);
        return num;
    }

    private static Float exemplo2(int valor) {
        Float wrapperFloat = (float) valor; // Converte o valor inteiro para Float.
        System.out.println("Exemplo2: Convertendo para Float: " + wrapperFloat);
        return wrapperFloat;


    }
}