import java.util.Scanner;

public class notas {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        float[] numeros = new float[4];

        for (int i = 0; i < 4; i++) {
            numeros[i] = s.nextFloat();
        }

        calculaMedia(numeros);
    }

    public static void calculaMedia(float[] notas){

        float media = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;

        if (media >= 7)
            System.out.println("Aprovado com média: " + media);
        else if (media >= 5 && media < 7)
            System.out.println("Aluno em recuperação");
        else
            System.out.println("Aluno reprovado");
    }
}