public class Medicacao {
    private String nome;
    private String dosagem;
    private String dataPrescricao;

    public Medicacao(String nome, String dosagem, String dataPrescricao) {
        this.nome = nome;
        this.dosagem = dosagem;
        this.dataPrescricao = dataPrescricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDosagem() {
        return dosagem;
    }

    public String getDataPrescricao() {
        return dataPrescricao;
    }
}