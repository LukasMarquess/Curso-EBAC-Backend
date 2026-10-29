import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class classificacao1 {

    public static void main(String[] args){

        String[] nomes;

        nomes = receberNomes();
        ordenarNomes(nomes);

    }

    public static String[] receberNomes(){

        Scanner s = new Scanner(System.in);
        System.out.println("Coloque os nomes separados por vírgula");

        String nomes = s.nextLine();

        return nomes.split("\\s*,\\s*");
    }

    public static void ordenarNomes(String[] nomesOrdem){

        Arrays.sort(nomesOrdem);
        System.out.println(Arrays.toString(nomesOrdem));
    }
}
