package br.edu.atitus.eduarda_bolner.zoo_digital.animais;

import br.edu.atitus.eduarda_bolner.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.eduarda_bolner.zoo_digital.comportamentos.Nado;
import br.edu.atitus.eduarda_bolner.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.eduarda_bolner.zoo_digital.especies.Ave;

public class Pinguim extends Ave implements Nado, Corrida, Predacao {

    public Pinguim(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz: Squawk squawk!");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo peixe gelado.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando velozmente sob o gelo.");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está caminhando bamboleando pelo gelo.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando krill no gelo.");
    }

    @Override
    public String getEspecie() {
        return "Pinguim";
    }
}
