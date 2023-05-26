public class Alergia {
    private String alergeno;
    private String gravidade;

    public Alergia(String alergeno, String gravidade) {
        this.alergeno = alergeno;
        this.gravidade = gravidade;
    }

    public String getAlergeno() {
        return alergeno;
    }

    public String getGravidade() {
        return gravidade;
    }
}