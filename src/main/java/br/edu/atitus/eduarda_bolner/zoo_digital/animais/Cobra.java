package br.edu.atitus.eduarda_bolner.zoo_digital.animais;

import br.edu.atitus.eduarda_bolner.zoo_digital.comportamentos.Nado;
import br.edu.atitus.eduarda_bolner.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.eduarda_bolner.zoo_digital.especies.Reptil;

public class Cobra extends Reptil implements Predacao, Nado {

    public Cobra(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz: Ssssss! (sibilar)");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está engolindo sua presa inteira.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está deslizando pela água com movimentos ondulantes.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando com veneno e bote preciso.");
    }

    @Override
    public String getEspecie() {
        return "Cobra";
    }
}
