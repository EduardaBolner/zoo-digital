package br.edu.atitus.eduarda_bolner.zoo_digital.animais;

import br.edu.atitus.eduarda_bolner.zoo_digital.comportamentos.Nado;
import br.edu.atitus.eduarda_bolner.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.eduarda_bolner.zoo_digital.especies.Mamifero;

public class Golfinho extends Mamifero implements Nado, Predacao {

    public Golfinho(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz: Ee-ee-ee! (cliques e assobios)");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo peixe fresco.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando e fazendo acrobacias no oceano.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando peixes em grupo com sua matilha.");
    }

    @Override
    public String getEspecie() {
        return "Golfinho";
    }
}
