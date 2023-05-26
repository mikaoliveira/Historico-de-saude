public class Denticao {
    private String nomeDente;
    private String dataAparecimento;

    public Denticao(String nomeDente, String dataAparecimento) {
        this.nomeDente = nomeDente;
        this.dataAparecimento = dataAparecimento;
    }

    public String getNomeDente() {
        return nomeDente;
    }

    public String getDataAparecimento() {
        return dataAparecimento;
    }
}