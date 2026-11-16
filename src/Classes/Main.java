package Classes;

import Utils.Input;


public class Main {
    public static void main(String[] args) {

        Catalogo catalogo = new Catalogo();

        Serie serie1 = new Serie("pernambuco", "Netflix");
        Serie serie2 = new Serie("dark horse");
        Serie serie3 = new Serie("ronaldo", "Prime");

        serie1.setNota(3.5);
        serie2.setNota(9.0);

        System.out.println(serie1 + "\n" + serie2);

        if (!serie1.setNota(Input.db("Troque a nota da Serie 1."))) {
            System.out.println("Nota Inválida. Erro em:\n" + serie1);
        } else {
            System.out.println(serie1);
        }

        catalogo.addSerie(serie1);
        catalogo.addSerie(serie2);
        catalogo.addSerie(serie3);

        System.out.println(catalogo.buscarSerie(Input.st("Busque uma serie (nome): ")));




    }
}