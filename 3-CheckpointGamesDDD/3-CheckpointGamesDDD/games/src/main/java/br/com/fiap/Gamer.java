package br.com.fiap;

public class Gamer implements Comparable<Gamer>{

    private String Titulo;
    private String Descricao;
    private Double Nota;    
    private String Genero;
    private String JogoNaoZerado;
    
    public Gamer(String titulo, String descricao, Double nota, String genero , String JogoNaoZerado) {
        Titulo = titulo;
        Descricao = descricao;
        Nota = nota;
        Genero = genero;
        this.JogoNaoZerado = JogoNaoZerado;
    }   
    
    public String getTitulo() {
        return Titulo;
    }
    
    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
    
    public String getDescricao() {
        return Descricao;
    }
    
    public void setDescricao(String descricao) {
        Descricao = descricao;
    }
    
    public Double getNota() {
        return Nota;
    }
    
    public void setNota(Double nota) {
        Nota = nota;
    }
    
    public String getGenero() {
        return Genero;
    }
    
    public void setGenero(String genero) {
        Genero = genero;
    }
    
    public String getJogoNaoZerado() {
        return JogoNaoZerado;
    }

    public void setJogoNaoZerado(String jogoNaoZerado) {
        JogoNaoZerado = jogoNaoZerado;
    }


    @Override
    public String toString() {
        return "Gamer [Descricao=" + Descricao + ", Genero=" + Genero + ", JogoNaoZerado=" + JogoNaoZerado + ", Nota="
        + Nota + ", Titulo=" + Titulo + "]";
    }

    @Override
    public int compareTo(Gamer outro) {
        if (this.JogoNaoZerado == outro.getJogoNaoZerado()) return +1;
        if (this.JogoNaoZerado == outro.getJogoNaoZerado()) return +1;
        if (this.JogoNaoZerado != outro.getJogoNaoZerado()) return -1;
        return 0;
    }
    
}
