package main;

import service.Musica;
import service.Navegador;
import service.Telefone;

public class Main {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.selecionarMusica();
        musica.tocar();
        musica.pausar();
        System.out.println("---------------------------------------------------------");
        Navegador navegador = new Navegador();
        navegador.exibirPagina();
        navegador.atualizarPagina();
        navegador.atualizarPagina();
        System.out.println("----------------------------------------------------------");
        Telefone telefone = new Telefone();
        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();
    }
}
