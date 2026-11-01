public abstract class Pessoa {

    private String nome;
    private String nascimento;
    private String email;
    private String estadoCivil;

    public String getestadoCivil(){
        return estadoCivil;
    }

    public void setestadoCivil(String estadoCivil){
        this.estadoCivil = estadoCivil;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}