
import java.util.ArrayList;
import java.util.List;

public class Prontuario {
    private List<Doenca> doencas;
    private List<Medicacao> medicacoes;
    private List<Denticao> denticoes;
    private List<ConsultaMedica> consultas;
    private List<Alergia> alergias;
    private List<OutraOcorrencia> outrasOcorrencias;

    public Prontuario() {
        this.doencas = new ArrayList<>();
        this.medicacoes = new ArrayList<>();
        this.denticoes = new ArrayList<>();
        this.consultas = new ArrayList<>();
        this.alergias = new ArrayList<>();
        this.outrasOcorrencias = new ArrayList<>();
    }

    public void adicionarDoenca(Doenca doenca) {
        doencas.add(doenca);
    }

    public void adicionarMedicacao(Medicacao medicacao) {
        medicacoes.add(medicacao);
    }

    public void adicionarDenticao(Denticao denticao) {
        denticoes.add(denticao);
    }

    public void adicionarConsultaMedica(ConsultaMedica consulta) {
        consultas.add(consulta);
    }

    public void adicionarAlergia(Alergia alergia) {
        alergias.add(alergia);
    }

    public void adicionarOutraOcorrencia(OutraOcorrencia ocorrencia) {
        outrasOcorrencias.add(ocorrencia);
    }

    public List<Doenca> getDoencas() {
        return doencas;
    }

    public List<Medicacao> getMedicacoes() {
        return medicacoes;
    }

    public List<Denticao> getDenticoes() {
        return denticoes;
    }

    public List<ConsultaMedica> getConsultas() {
        return consultas;
    }

    public List<Alergia> getAlergias() {
        return alergias;
    }

    public List<OutraOcorrencia> getOutrasOcorrencias() {
        return outrasOcorrencias;
    }
}