public class Crianca {
    private String nome;
    private Prontuario prontuario;

    public Crianca(String nome) {
        this.nome = nome;
        this.prontuario = new Prontuario();
    }

    public String getNome() {
        return nome;
    }

    public Prontuario getProntuario() {
        return prontuario;
    }
}




