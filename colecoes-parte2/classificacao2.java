import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class classificacao2 {

    public static void main(String[] args){

        String[][] nomesSexo = receberNomes();

        String[] nomes = nomesSexo[0];
        String[] sexos = nomesSexo[1];

        classificarNomes(nomes, sexos);


    }

    public static String[][] receberNomes(){

        Scanner s = new Scanner(System.in);
        System.out.println("Coloque os nomes junto com o sexo. Exemplo: Lucas-M, Mariana-F");

        String nomes = s.nextLine();

        String[] pessoas = nomes.split("\\s*,\\s*");

        String[] NOMES = new String[pessoas.length];
        String[] SEXOS = new String[pessoas.length];

        for (int i = 0; i < pessoas.length; i++) {

            String[] partes = pessoas[i].split("-");

            NOMES[i] = partes[0];
            SEXOS[i] = partes[1];
        }

        return new String[][] {NOMES, SEXOS};
    }

    public static void classificarNomes(String[] nome, String[] sexo){

        int tamanho = nome.length;
        int t1 = 0,t2 = 0;

        String[] masculino = new String[tamanho];
        String[] feminino = new String[tamanho];

        for (int i = 0; i < tamanho; i++){

            if(sexo[i].equalsIgnoreCase("M")){
                masculino[t1] = nome[i];
                t1++;
            }

            else{
                feminino[t2] = nome[i];
                t2++;
            }

        }

        System.out.println("Grupo Masculino:");
        for(int j = 0; j < t1; j++){
            System.out.println(masculino[j]);
        }

        System.out.println("");

        System.out.println("Grupo Feminino:");
        for (int k = 0; k <t2; k++) {
            System.out.println(feminino[k]);
        }
    }
}
