package br.com.fiap;

import java.util.Comparator;

public class OrdenarPorTitulo implements Comparator<Gamer> {
    
    @Override
    public int compare(Gamer o1, Gamer o2) {
        return o1.getTitulo().compareTo(o2.getTitulo());
    }

}
