package br.edu.atitus.eduarda_bolner.zoo_digital.animais;

import br.edu.atitus.eduarda_bolner.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.eduarda_bolner.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.eduarda_bolner.zoo_digital.comportamentos.Voo;
import br.edu.atitus.eduarda_bolner.zoo_digital.especies.Ave;

public class Aguia extends Ave implements Voo, Corrida, Predacao {

    public Aguia(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz: Kiiiik! (grito agudo)");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo carne de sua presa.");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está planando majestosamente nas alturas.");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo na decolagem.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está mergulhando em alta velocidade para capturar sua presa.");
    }

    @Override
    public String getEspecie() {
        return "Águia";
    }
}
