package br.com.fiap;

import java.util.Comparator;

public class OrdenarPorNota implements Comparator<Gamer> {
    
    @Override
    public int compare(Gamer o1, Gamer o2) {
        return o1.getNota().compareTo(o2.getNota());
    }

}
