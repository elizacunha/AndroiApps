package com.example.listafilme.model;

public class Filme {
    private String tituloFilme;
    private String generoFilme;
    private String anoFilme;

    public Filme(String tituloFilme, String generoFilme, String anoFilme) {
        this.tituloFilme = tituloFilme;
        this.generoFilme = generoFilme;
        this.anoFilme = anoFilme;
    }

    @Override
    public String toString() {
        return "Título: "+getTituloFilme()+" - Gênero: "+getGeneroFilme()+" - Ano: "+getAnoFilme();
    }

    public String getTituloFilme() {
        return tituloFilme;
    }

    public void setTituloFilme(String tituloFilme) {
        this.tituloFilme = tituloFilme;
    }

    public String getGeneroFilme() {
        return generoFilme;
    }

    public void setGeneroFilme(String generoFilme) {
        this.generoFilme = generoFilme;
    }

    public String getAnoFilme() {
        return anoFilme;
    }

    public void setAnoFilme(String anoFilme) {
        this.anoFilme = anoFilme;
    }

}
