public class pessoaJuridica extends Pessoa{

    private String cnpj;
    private String razaoSocial;

    public String getCNPJ() {
        return cnpj;
    }

    public void setCNPJ(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getrazaoSocial() {
        return razaoSocial;
    }

    public void setrazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public String toString() {
        return "=== Dados da Pessoa Jurídica ===\n" +
                "Nome Fantasia: " + this.getNome() + "\n" +
                "Razão Social: " + this.getrazaoSocial() + "\n" +
                "CNPJ: " + this.getCNPJ() + "\n" +
                "Data de Abertura/Nascimento: " + this.getNascimento() + "\n" +
                "E-mail: " + this.getEmail() + "\n" +
                "Estado Civil do Dono: " + this.getestadoCivil();
    }

}