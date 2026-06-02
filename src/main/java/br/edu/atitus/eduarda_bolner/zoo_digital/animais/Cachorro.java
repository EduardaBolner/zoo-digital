package br.edu.atitus.eduarda_bolner.zoo_digital.animais;

import br.edu.atitus.eduarda_bolner.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.eduarda_bolner.zoo_digital.comportamentos.Nado;
import br.edu.atitus.eduarda_bolner.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.eduarda_bolner.zoo_digital.especies.Mamifero;

public class Cachorro extends Mamifero implements Corrida, Nado, Predacao {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz: Au au!");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo ração.");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo atrás da bola!");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando no lago.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando a meia que roubou.");
    }

    @Override
    public String getEspecie() {
        return "Cachorro";
    }
}
