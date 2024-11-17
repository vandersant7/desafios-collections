package com.vandersant.list.Search;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {

    private List<Livro> listLivro;

    public CatalagoLivros() {
        this.listLivro = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        listLivro.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livroPorAutor = new ArrayList<>();

        for (Livro l : listLivro) {
            if (l.getAutor().equalsIgnoreCase(autor)) {
                livroPorAutor.add(l);
            }
        }


        return livroPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloDeAnos = new ArrayList<>();
        for (Livro l : listLivro) {
            if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                livrosPorIntervaloDeAnos.add(l);
            }
        }

        return livrosPorIntervaloDeAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!listLivro.isEmpty()) {
            for (Livro l : listLivro) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }

        return livroPorTitulo;
    }


}
