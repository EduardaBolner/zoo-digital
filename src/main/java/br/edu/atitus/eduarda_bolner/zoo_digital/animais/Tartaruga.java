package br.edu.atitus.eduarda_bolner.zoo_digital.animais;

import br.edu.atitus.eduarda_bolner.zoo_digital.comportamentos.Nado;
import br.edu.atitus.eduarda_bolner.zoo_digital.especies.Reptil;

public class Tartaruga extends Reptil implements Nado {

    public Tartaruga(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz: sons suaves e graves.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo algas marinhas devagar.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando graciosamente pelo oceano.");
    }

    @Override
    public String getEspecie() {
        return "Tartaruga";
    }
}
