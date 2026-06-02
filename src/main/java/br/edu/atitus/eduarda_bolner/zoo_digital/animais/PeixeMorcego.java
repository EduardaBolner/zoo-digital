package br.edu.atitus.eduarda_bolner.zoo_digital.animais;

import br.edu.atitus.eduarda_bolner.zoo_digital.comportamentos.Nado;
import br.edu.atitus.eduarda_bolner.zoo_digital.especies.Peixe;

public class PeixeMorcego extends Peixe implements Nado {

    public PeixeMorcego(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " produz sons de baixa frequência para se comunicar.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo pequenos invertebrados do fundo do mar.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está caminhando com suas nadadeiras pelo fundo do oceano.");
    }

    @Override
    public String getEspecie() {
        return "Peixe-morcego";
    }
}
