/**
 * @author lucas Marques
 */

public class Carro {

    private String marca;
    private int cilindradas;
    private float price;

    /**
     *
     * @return Retorna a marca do carro
     */
    public String getMarca() {
        return marca;
    }

    /**
     *
     * @param marca refere-se a marca do carro que iremos colocar
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     *
     * @return retorna a cilindrada do carro
     */
    public int getCilindradas() {
        return cilindradas;
    }

    /**
     *
     * @param cilindradas refere-se a potência do motor referente a classe carro
     */
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    /**
     *
     * @return retorna o preço do carro
     */
    public float getPrice() {
        return price;
    }

    /**
     *
     * @param price refere-se ao valor do carro
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     *
     * @param desconto desconto em % que iremos dá ao carro
     * @param price valor do carro
     * @return preço final com desconto
     */
    public float descontPrice(float desconto, float price){
        return price - (desconto*price);
    }

    public static void main(String[] args){
        Carro f1 = new Carro();
        f1.setCilindradas(600);
        f1.setMarca("Ferrari");
        f1.setPrice(100.000F);

        System.out.println(f1.getMarca());
        System.out.println(f1.getCilindradas());
        System.out.println(f1.getPrice());
        float valorFinal = f1.descontPrice(0.2F, f1.getPrice());
        System.out.println(valorFinal);


    }
}