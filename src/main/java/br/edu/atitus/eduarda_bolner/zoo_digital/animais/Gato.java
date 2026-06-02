package br.edu.atitus.eduarda_bolner.zoo_digital.animais;

import br.edu.atitus.eduarda_bolner.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.eduarda_bolner.zoo_digital.comportamentos.Escalada;
import br.edu.atitus.eduarda_bolner.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.eduarda_bolner.zoo_digital.especies.Mamifero;

public class Gato extends Mamifero implements Corrida, Escalada, Predacao {

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz: Miau!");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo peixinho.");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo pela casa.");
    }

    @Override
    public void escalar() {
        System.out.println(getNome() + " está escalando a cortina.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando um ratinho.");
    }

    @Override
    public String getEspecie() {
        return "Gato";
    }
}
