import java.util.List;

public class Doenca {
    private String nome;
    private List<String> sintomas;
    private String dataDiagnostico;

    public Doenca(String nome, List<String> sintomas, String dataDiagnostico) {
        this.nome = nome;
        this.sintomas = sintomas;
        this.dataDiagnostico = dataDiagnostico;
    }

    public String getNome() {
        return nome;
    }

    public List<String> getSintomas() {
        return sintomas;
    }

    public String getDataDiagnostico() {
        return dataDiagnostico;
    }
}