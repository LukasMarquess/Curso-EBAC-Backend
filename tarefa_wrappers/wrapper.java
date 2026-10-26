public class wrapper {

    public static void main(String[] args){

        int aP = Integer.parseInt(args[0]);
        Integer aW = aP;
        System.out.println("O tipo da variável é: " + aW.getClass().getSimpleName() + " e seu valor é: " + aW);

    }
}
