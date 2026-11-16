package Classes;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private List<Serie> serieArrayList = new ArrayList<>();

    public void addSerie(Serie serie){
        serieArrayList.add(serie);
    }

    public Serie buscarSerie(String nomeBusca){
        for (Serie s : serieArrayList){
            if(s.getNome().toLowerCase().equals(nomeBusca.toLowerCase())){
                return s;
            }
        }
        return null;
    }
}
