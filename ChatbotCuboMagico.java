/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatbotcubomagico;

import java.util.Scanner;

/**
 *
 * @author StiphanieMaradaSilva RA 21051015 para disciplina de Processamento da
 * Informação, ministrada pela professora Debora Medeiros. Projeto final
 * apresentado em 16/08/17.
 */
public class ChatbotCuboMagico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner linhaDeComando = new Scanner(System.in);
        // cria os passos
        int numeroDePassos = 7;
        // cria os passos
        String[] passos = new String[numeroDePassos];
        //foi necessário criar um vetor para cada passo, pois cada um tem uma explicação diferente. Do contrário eu poderia fazer um 'for' e deixá-lo em loop.
        passos[0] = "Explicação do Passo 1";
        passos[1] = "Explicação do Passo 2";
        passos[2] = "Explicação do Passo 3";
        passos[3] = "Explicação do Passo 4";
        passos[4] = "Explicação do Passo 5";
        passos[5] = "Explicação do Passo 6";
        passos[6] = "Explicação do Passo 7";

        System.out.println("Bem vindo ao chatbot que te ensina a montar um cubo mágico.");
        int opcao;
        do {
            System.out.println("Podemos começar? Digite a opção desejada: 1 - SIM | 2 - NÃO");
            opcao = linhaDeComando.nextInt();
            if (opcao == 1) {
                System.out.println("Digite o seu nome: ");
                String nome = linhaDeComando.next();

                System.out.println("Oi " + nome + "! Vamos montar um cubo mágico em " + numeroDePassos + " passos!");
                int passo = 0;
                do {
                    // imprime o passo atual!
                    System.out.println(passos[passo]);

                    // faz escolha do próximo passo após ter visto passo atual
                    int escolha;
                    boolean escolhaEhInvalida;
                    do {
                        System.out.println("Podemos passar para o próximo passo? 1 - SEGUIR ou 2 - VOLTAR");
                        escolha = linhaDeComando.nextInt();
                        // se a escolha nao é 1 ou 2, ela é inválida
                        escolhaEhInvalida = escolha != 1 && escolha != 2;
                        if (escolhaEhInvalida) {
                            System.out.println("Esta foi uma escolha invalida! Tente novamente...");
                        }
                        // usuario tem que escolher uma escolha válida para sair do loop
                    } while (escolhaEhInvalida);

                    if (escolha == 1) {
                        passo++;
                    } else if (escolha == 2) {
                        // usuario já está no primeiro passo e tenta voltar mais do que deveria
                        if (passo - 1 < 0) {
                            System.out.println("Nós já estamos no primeiro passo! Vamos recapitular!");
                            // caso não estiver no primeiro passo, então só volta e aprende o passo novamente
                        } else {
                            passo--;
                        }
                    }

                } while (passo <= passos.length - 1);
                System.out.println("PARABÉNS! Terminaste todos os passos!");

                opcao = 2;

            } else if (opcao == 2) {
                System.out.println("Que pena! Estamos desenvolvendo outros chatbots para te ensinar a fazer outras tarefas. Boa sorte!");
            } else {
                System.out.println("Opção não reconhecida. Tente novamente!");
            }
        } while (opcao != 2);

    }

}
