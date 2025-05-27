package com.mycompany.adivinhe;

import javax.swing.JOptionPane;

public class Adivinhe {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bem-vindo ao jogo de adivinhação");
        JOptionPane.showMessageDialog(null, "Acredito que já jogaram Akaito, um jogo de adivinhação. Você pensa em um personagem ou pessoa e a maquina tenta adivinhar \n o que você está pensando ");
        JOptionPane.showMessageDialog(null, "Esse jogo funciona da mesma forma, só que brincamos apenas com cantores famosos do Kpop");

        String resposta = JOptionPane.showInputDialog(null, "Pronto para jogar?");

        if (resposta.equals("sim")) {
            JOptionPane.showMessageDialog(null, "Show! Lá vamos nós");
            String pergunta0 = JOptionPane.showInputDialog(null, "Você está pensando em um homem ou mulher?");

            if (pergunta0.equals("homem")) {
                String pergunta1 = JOptionPane.showInputDialog(null, "Faz parte de algum grupo de kpop mundialmente famoso?");
                if (pergunta1.equals("sim")) {
                    String pergunta3 = JOptionPane.showInputDialog(null, "Tem mais de 6 membros nesse grupo?");
                    if (pergunta3.equals("sim")) {
                        String pergunta4 = JOptionPane.showInputDialog(null, "O grupo teve sua estreia antes de 2013?");
                        if (pergunta4.equals("não")) {
                            String pergunta5 = JOptionPane.showInputDialog(null, "O grupo conseguiu alcançar mais de 1 bilhão de visualizações em suas musicas?");
                            if (pergunta5.equals("sim")) {
                                String pergunta6 = JOptionPane.showInputDialog(null, "Já foi indicado para o Grammy?");
                                if (pergunta6.equals("sim")) {
                                    JOptionPane.showConfirmDialog(null, "Estamos falando do BTS?");
                                }
                            }
                        }
                    }
                }
            } else if (pergunta0.equals("mulher")) {
                String pergunta2 = JOptionPane.showInputDialog(null, "Faz parte de algum grupo de kpop mundialmente famoso?");
                if (pergunta2.equals("sim")) {
                    String pergunta7 = JOptionPane.showInputDialog(null, "Tem mais de 6 membros nesse grupo?");
                    if (pergunta7.equals("sim")) {
                        String pergunta8 = JOptionPane.showInputDialog(null, "O grupo teve sua estreia antes de 2013?");
                        if (pergunta8.equals("não")) {
                            String pergunta9 = JOptionPane.showInputDialog(null, "O grupo faz parte da JYP?");
                            if (pergunta9.equals("sim")) {
                                String pergunta10 = JOptionPane.showInputDialog(null, "É um grupo feminino de K-pop com o maior número de Daesangs?");
                                if (pergunta10.equals("sim")) {
                                    JOptionPane.showConfirmDialog(null, "Estamos falando do Twice?");
                                }
                            }
                        }
                    }
                }
            }

        } else if (resposta.equals("não")) {
            JOptionPane.showMessageDialog(null, "Que pena, quem sabe em outra hora");
        }
    }
}
