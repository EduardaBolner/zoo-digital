package br.edu.atitus.eduarda_bolner.zoo_digital.animais;

import br.edu.atitus.eduarda_bolner.zoo_digital.comportamentos.Nado;
import br.edu.atitus.eduarda_bolner.zoo_digital.comportamentos.Voo;
import br.edu.atitus.eduarda_bolner.zoo_digital.especies.Ave;

public class Pato extends Ave implements Nado, Voo {

    public Pato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz: Quack quack!");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo plantas aquáticas.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando no lago.");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando em formação com outros patos.");
    }

    @Override
    public String getEspecie() {
        return "Pato";
    }
}
