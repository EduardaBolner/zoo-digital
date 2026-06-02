package br.edu.atitus.eduarda_bolner.zoo_digital.animais;

import br.edu.atitus.eduarda_bolner.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.eduarda_bolner.zoo_digital.comportamentos.Voo;
import br.edu.atitus.eduarda_bolner.zoo_digital.especies.Ave;

public class Coruja extends Ave implements Voo, Predacao {

    public Coruja(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz: Uu-uu-uuu!");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo um roedor.");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando silenciosamente na noite.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando roedores no escuro com visão noturna.");
    }

    @Override
    public String getEspecie() {
        return "Coruja";
    }
}
