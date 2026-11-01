public class Programa{

    public static void main(String[] args) {
      instanciandoPF();
      System.out.println("");
      instanciandoPJ();
    }

    public static void instanciandoPF(){

      pessoaFisica pf = new pessoaFisica();
      pf.setNome("Lucas");
      pf.setNascimento("15/05/2002");
      pf.setEmail("abcde@gmail.com");
      pf.setestadoCivil("Solteiro");
      pf.setCPF("025.427.524-26");
      pf.setRG("025.427.524");
      System.out.println(pf);

    }

    public static void instanciandoPJ(){

      pessoaJuridica pj = new pessoaJuridica();
      pj.setNome("Goku");
      pj.setNascimento("07/08/1958");
      pj.setEmail("gokuaxa@gmail.com");
      pj.setestadoCivil("Casado");
      pj.setCNPJ("12.345.678/0001-90");
      pj.setrazaoSocial("Gokus e Vegetas LTAD Americas");
      System.out.println(pj);
    }
}