package br.edu.atitus.eduarda_bolner.zoo_digital.animais;

import br.edu.atitus.eduarda_bolner.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.eduarda_bolner.zoo_digital.comportamentos.Nado;
import br.edu.atitus.eduarda_bolner.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.eduarda_bolner.zoo_digital.especies.Reptil;

public class Jacare extends Reptil implements Nado, Corrida, Predacao {

    public Jacare(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz: Grrrrr! (rosnar grave)");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo um peixe grande.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando silenciosamente pelo rio.");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo em disparada na margem do rio.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando à espreita, imóvel na água.");
    }

    @Override
    public String getEspecie() {
        return "Jacaré";
    }
}
