public class ConsultaMedica {
    private String nomeMedico;
    private String dataConsulta;
    private String diagnostico;

    public ConsultaMedica(String nomeMedico, String dataConsulta, String diagnostico) {
        this.nomeMedico = nomeMedico;
        this.dataConsulta = dataConsulta;
        this.diagnostico = diagnostico;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public String getDiagnostico() {
        return diagnostico;
    }
}