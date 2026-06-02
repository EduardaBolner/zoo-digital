package br.edu.atitus.eduarda_bolner.zoo_digital.animais;


import br.edu.atitus.eduarda_bolner.zoo_digital.comportamentos.Nado;
import br.edu.atitus.eduarda_bolner.zoo_digital.especies.Mamifero;

public class Baleia extends Mamifero implements Nado {

    public Baleia(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz: sons graves pelas profundezas.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está filtrando krill pelo oceano.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está migrando pelo oceano Atlântico.");
    }

    @Override
    public String getEspecie() {
        return "Baleia";
    }
}
