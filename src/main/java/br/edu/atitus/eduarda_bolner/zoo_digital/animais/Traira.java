package br.edu.atitus.eduarda_bolner.zoo_digital.animais;

import br.edu.atitus.eduarda_bolner.zoo_digital.comportamentos.Nado;
import br.edu.atitus.eduarda_bolner.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.eduarda_bolner.zoo_digital.especies.Peixe;

public class Traira extends Peixe implements Nado, Predacao {

    public Traira(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " não emite sons audíveis.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo outros peixes menores.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando nas margens do rio à espreita.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando com bote rápido e dentes afiados.");
    }

    @Override
    public String getEspecie() {
        return "Traíra";
    }
}
