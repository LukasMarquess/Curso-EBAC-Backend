public class pessoaFisica extends Pessoa{

    private String cpf;
    private String rg;

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public String getRG() {
        return rg;
    }

    public void setRG(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "=== Dados da Pessoa Física ===\n" +
                "Nome: " + this.getNome() + "\n" +
                "Nascimento: " + this.getNascimento() + "\n" +
                "E-mail: " + this.getEmail() + "\n" +
                "Estado Civil: " + this.getestadoCivil() + "\n" +
                "CPF: " + this.getCPF() + "\n" +
                "RG: " + this.getRG();
    }

}