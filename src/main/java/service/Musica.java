package service;

import funcoes.ReprodutorMusical;

public class Musica extends ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("Tocando música ...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música ...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Nova música selecionada");
    }
}
