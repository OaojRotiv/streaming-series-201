package Classes;

public class Serie {
    private String nome;
    private String plataforma;
    private Double nota;

    @Override

    public String toString() {
        return String.format("Série: %s%n\tPlataforma: %s%n\tNota: %s", nome, plataforma, nota);

    }

    public Serie(String nome, String plataforma) {
        this.nome = nome;
        this.plataforma = plataforma;
        this.nota = 0.0;
    }

    public Serie(String nome) {
        this.nome = nome;
        this.plataforma = "Plataforma indefinida";
        this.nota = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public Double getNota() {
        return nota;
    }

    public boolean setNota(Double nota) {

        if (nota >= 0 || nota <= 10) {
            this.nota = nota;
            return true;
        }
        return false;

    }
}
