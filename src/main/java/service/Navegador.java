package service;

import funcoes.NavegadorInternet;

public class Navegador extends NavegadorInternet {
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página da Web");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova guia");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
}
