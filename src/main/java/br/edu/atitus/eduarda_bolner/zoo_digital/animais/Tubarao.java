package br.edu.atitus.eduarda_bolner.zoo_digital.animais;

import br.edu.atitus.eduarda_bolner.zoo_digital.comportamentos.Nado;
import br.edu.atitus.eduarda_bolner.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.eduarda_bolner.zoo_digital.especies.Peixe;

public class Tubarao extends Peixe implements Nado, Predacao {

    public Tubarao(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " não emite sons audíveis, mas detecta vibrações.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo focas e peixes grandes.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando velozmente pelas profundezas.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando com sentido de olfato apurado.");
    }

    @Override
    public String getEspecie() {
        return "Tubarão";
    }
}
