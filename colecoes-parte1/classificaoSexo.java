import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class classificaoSexo {

    public static void main(String[] args){
        List<String> nome = new ArrayList<>();
        List<String> sexo = new ArrayList<>();

        receberParametros(nome, sexo);
        Classificar(nome, sexo);

    };

    public static void receberParametros(List<String> nomes, List<String> sexos){

        String inserir = "Sim";

        Scanner scanner = new Scanner(System.in);

        while(inserir.equalsIgnoreCase("Sim")){

            System.out.println("Insira o Nome");
            nomes.add(scanner.nextLine());
            System.out.println("");
            System.out.println("Insira o Sexo");
            sexos.add(scanner.nextLine());
            System.out.println("");

            System.out.println("Quer acrescentar outro nome?");
            inserir = scanner.nextLine();
            System.out.println("");
        }

    }

    public static void Classificar(List<String> nomes, List<String> sexo){

        int tamanho = nomes.size();
        List<String> masc = new ArrayList<>();
        List<String> fem = new ArrayList<>();

        for(int i = 0; i < tamanho; i++){

            if(sexo.get(i).equalsIgnoreCase("Masculino"))
                masc.add(nomes.get(i));
            else
                fem.add(nomes.get(i));
        }

        System.out.println("Grupo Masculino: ");
        for (String item : masc) {
            System.out.println(item);
        }

        System.out.println("");

        System.out.println("Grupo Feminino: ");
        for (String item : fem) {
            System.out.println(item);
        }
    }

}
