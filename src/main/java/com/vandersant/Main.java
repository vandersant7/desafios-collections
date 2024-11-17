package com.vandersant;

import com.vandersant.list.Search.CatalagoLivros;


public class Main {

    public static void main(String[] args) {
        CatalagoLivros catalagoLivros = new CatalagoLivros();

        catalagoLivros.adicionarLivro("Java", "Autor 1", 2024);
        catalagoLivros.adicionarLivro("Spring Boot", "Autor 2", 2022);
        catalagoLivros.adicionarLivro("Angular", "Autor 2", 2023);
        catalagoLivros.adicionarLivro("React", "Autor 3", 2021);
        catalagoLivros.adicionarLivro("SQL", "Autor 4", 2019);

        System.out.println(catalagoLivros.pesquisarPorAutor("Autor 1"));
        System.out.println(catalagoLivros.pesquisarPorIntervaloAnos(2022, 2023));
        System.out.println(catalagoLivros.pesquisarPorTitulo("SQL"));
    }

    }