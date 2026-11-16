package Classes;

public class Serie {
    private String nome;
    private String plataforma;
    private Double nota;

    @Override

    public String toString(){
        return String.format("Série: %s%n\tPlataforma: %s%n\t Nota: %s", nome, plataforma, nota);

    }

    public Serie(String nome, String plataforma){
        this.nome = nome;
        this.plataforma = plataforma;
    }

    public Serie(String nome) {
        this.nome = nome;
        this.plataforma = "Plataforma indefinida";
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

    public void setNota(Double nota) {


            if(nota>=0||nota<=10){
             this.nota = nota;
            }else{
                System.out.println("Nota Inválida!");
            }



    }
}
