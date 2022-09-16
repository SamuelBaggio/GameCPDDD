package br.com.fiap;

import java.util.Comparator;

public class OrdenarPorGenero implements Comparator<Gamer> {
    
    @Override
    public int compare(Gamer o1, Gamer o2) {
        return o1.getGenero().compareTo(o2.getGenero());
    }

}