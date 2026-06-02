package br.edu.atitus.eduarda_bolner.zoo_digital.animais;

import br.edu.atitus.eduarda_bolner.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.eduarda_bolner.zoo_digital.comportamentos.Escalada;
import br.edu.atitus.eduarda_bolner.zoo_digital.comportamentos.Nado;
import br.edu.atitus.eduarda_bolner.zoo_digital.especies.Reptil;

public class Iguana extends Reptil implements Corrida, Escalada, Nado {

    public Iguana(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz: sons graves de bufar quando ameaçada.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo folhas e flores.");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo rapidamente em duas patas.");
    }

    @Override
    public void escalar() {
        System.out.println(getNome() + " está escalando uma árvore com suas garras.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando com sua cauda poderosa.");
    }

    @Override
    public String getEspecie() {
        return "Iguana";
    }
}
