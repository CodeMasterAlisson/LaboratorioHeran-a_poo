package Lab01;

public class Refeitorio {

    private String nome;
    private String matricula;
    private String cpf;

    public Refeitorio(){
        this.matricula = "2024med0012";
        this.nome = "João";
        this.cpf = "111.222.333-44";
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + "\nMatricula: " + matricula;
    }
}
