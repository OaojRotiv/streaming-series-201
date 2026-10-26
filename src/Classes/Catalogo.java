package Classes;

import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Serie> serieArrayList = new ArrayList<>();

    public void addSerie(Serie serie){
        serieArrayList.add(serie);
    }

    public Serie getSerie(String nomeBusca){
        for (Serie s : serieArrayList){
            if(s.getNome()==nomeBusca){
                return s;
            }
        }
        return null;
    }
}
