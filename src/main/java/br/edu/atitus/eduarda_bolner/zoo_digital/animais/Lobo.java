package br.edu.atitus.eduarda_bolner.zoo_digital.animais;

import br.edu.atitus.eduarda_bolner.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.eduarda_bolner.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.eduarda_bolner.zoo_digital.especies.Mamifero;

public class Lobo extends Mamifero implements Corrida, Predacao {

    public Lobo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz: Auuuuuu! (uivo)");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo carne.");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo em matilha pela floresta.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando um cervo em bando.");
    }

    @Override
    public String getEspecie() {
        return "Lobo";
    }
}
