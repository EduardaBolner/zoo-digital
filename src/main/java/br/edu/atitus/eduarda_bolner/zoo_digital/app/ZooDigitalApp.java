package br.edu.atitus.eduarda_bolner.zoo_digital.app;

import br.edu.atitus.eduarda_bolner.zoo_digital.animais.*;
import br.edu.atitus.eduarda_bolner.zoo_digital.comportamentos.*;
import br.edu.atitus.eduarda_bolner.zoo_digital.especies.Animal;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZooDigitalApp {

    private static final List<Animal> animais = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = -1;

        System.out.println("   Bem-vindo ao Zoo Digital - Eduarda B.  ");

        while (opcao != 0) {
            exibirMenu();
            opcao = lerOpcao();

            switch (opcao) {
                case 1 -> cadastrarAnimal();
                case 2 -> listarTodos();
                case 3 -> listarCorredores();
                case 4 -> listarNadadores();
                case 5 -> listarVoadores();
                case 6 -> listarPredadores();
                case 7 -> exibirTotal();
                case 0 -> System.out.println("\nAté logo! O zoo agradece sua visita. 🐾");
                default -> System.out.println("\n[ERRO] Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("              MENU PRINCIPAL               ");
        System.out.println(" 1. Cadastrar Animal");
        System.out.println(" 2. Listar Todos os Animais");
        System.out.println(" 3. Listar Animais Corredores");
        System.out.println(" 4. Listar Animais Nadadores");
        System.out.println(" 5. Listar Animais Voadores");
        System.out.println(" 6. Listar Animais Predadores");
        System.out.println(" 7. Exibir Total de Animais");
        System.out.println(" 0. Sair");
        System.out.println("-------------------------------------------");
        System.out.print("Escolha uma opção: ");
    }

    private static int lerOpcao() {
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static void cadastrarAnimal() {
        System.out.println("\n--- CADASTRAR ANIMAL ---");
        System.out.println("Tipos disponíveis:");
        System.out.println("  Mamíferos : 1-Cachorro | 2-Gato | 3-Golfinho | 4-Lobo | 5-Baleia");
        System.out.println("  Aves      : 6-Pato | 7-Pinguim | 8-Águia | 9-Coruja");
        System.out.println("  Peixes    : 10-Peixe-morcego | 11-Traíra | 12-Piranha | 13-Tubarão");
        System.out.println("  Répteis   : 14-Jacaré | 15-Cobra | 16-Iguana | 17-Tartaruga");
        System.out.print("Tipo do animal: ");

        int tipo = lerOpcao();

        System.out.print("Nome: ");
        String nome = StringUtils.capitalize(scanner.nextLine().trim());

        if (StringUtils.isBlank(nome)) {
            System.out.println("[ERRO] Nome não pode ser vazio.");
            return;
        }

        System.out.print("Idade (anos): ");
        int idade;
        try {
            idade = Integer.parseInt(scanner.nextLine().trim());
            if (idade < 0) throw new NumberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("[ERRO] Idade inválida.");
            return;
        }

        // Upcasting: todos os animais são armazenados como Animal
        Animal animal = switch (tipo) {
            case 1  -> new Cachorro(nome, idade);
            case 2  -> new Gato(nome, idade);
            case 3  -> new Golfinho(nome, idade);
            case 4  -> new Lobo(nome, idade);
            case 5  -> new Baleia(nome, idade);
            case 6  -> new Pato(nome, idade);
            case 7  -> new Pinguim(nome, idade);
            case 8  -> new Aguia(nome, idade);
            case 9  -> new Coruja(nome, idade);
            case 10 -> new PeixeMorcego(nome, idade);
            case 11 -> new Traira(nome, idade);
            case 12 -> new Piranha(nome, idade);
            case 13 -> new Tubarao(nome, idade);
            case 14 -> new Jacare(nome, idade);
            case 15 -> new Cobra(nome, idade);
            case 16 -> new Iguana(nome, idade);
            case 17 -> new Tartaruga(nome, idade);
            default -> null;
        };

        if (animal == null) {
            System.out.println("[ERRO] Tipo inválido. Animal não está cadastrado.");
            // Desfaz incremento do contador
            Animal.resetContador();
            // Recria contador manualmente (já foi decrementado pela lógica acima — não instanciou)
            return;
        }

        animais.add(animal);
        System.out.println("\n✔ " + animal.getEspecie() + " '" + animal.getNome() + "' cadastrado(a) com sucesso!");
    }

    private static void listarTodos() {
        System.out.println("\n--- TODOS OS ANIMAIS ---");
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
            return;
        }

        for (Animal a : animais) {
            System.out.println("\n" + a);
            a.emitirSom();   // Polimorfismo
            a.comer();       // Polimorfismo
        }
    }

    private static void listarCorredores() {
        System.out.println("\n--- ANIMAIS CORREDORES ---");
        boolean encontrou = false;

        for (Animal a : animais) {
            if (a instanceof Corrida corredor) {  // instanceof + Downcasting seguro
                System.out.println("\n" + a);
                corredor.correr();
                encontrou = true;
            }
        }

        if (!encontrou) System.out.println("Nenhum animal corredor cadastrado.");
    }

    private static void listarNadadores() {
        System.out.println("\n--- ANIMAIS NADADORES ---");
        boolean encontrou = false;

        for (Animal a : animais) {
            if (a instanceof Nado nadador) {
                System.out.println("\n" + a);
                nadador.nadar();
                encontrou = true;
            }
        }

        if (!encontrou) System.out.println("Nenhum animal nadador cadastrado.");
    }

    private static void listarVoadores() {
        System.out.println("\n--- ANIMAIS VOADORES ---");
        boolean encontrou = false;

        for (Animal a : animais) {
            if (a instanceof Voo voador) {
                System.out.println("\n" + a);
                voador.voar();
                encontrou = true;
            }
        }

        if (!encontrou) System.out.println("Nenhum animal voador cadastrado.");
    }

    private static void listarPredadores() {
        System.out.println("\n--- ANIMAIS PREDADORES ---");
        boolean encontrou = false;

        for (Animal a : animais) {
            if (a instanceof Predacao predador) {
                System.out.println("\n" + a);
                predador.cacar();
                encontrou = true;
            }
        }

        if (!encontrou) System.out.println("Nenhum animal predador cadastrado.");
    }

    private static void exibirTotal() {
        // Uso de atributo e método static
        System.out.println("\n--- TOTAL DE ANIMAIS ---");
        System.out.println("Total de animais cadastrados: " + Animal.getContador());
    }
}
