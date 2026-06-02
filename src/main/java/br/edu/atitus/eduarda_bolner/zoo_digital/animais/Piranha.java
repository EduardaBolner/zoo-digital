package br.edu.atitus.eduarda_bolner.zoo_digital.animais;

import br.edu.atitus.eduarda_bolner.zoo_digital.comportamentos.Nado;
import br.edu.atitus.eduarda_bolner.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.eduarda_bolner.zoo_digital.especies.Peixe;

public class Piranha extends Peixe implements Nado, Predacao {

    public Piranha(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " produz sons de grunhido ao ser capturada.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está devorando carne com seus dentes afiados.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando em cardume pelo rio Amazonas.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando em bando de forma coordenada.");
    }

    @Override
    public String getEspecie() {
        return "Piranha";
    }
}
