package br.senai.sp.jandira.ds1t.aluno.model;
import java.util.Scanner;
public class AlunoApp {
    String nome;
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    double notaFinalDoAluno;

    public void receberDadosDoAluno() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Vamos começar então, qual seu nome aluno?");
        nome = leitor.nextLine();

        System.out.print("Beleza, agora " + nome + " me informe qual foi a sua primeira nota?");
        nota1 = leitor.nextDouble();

        System.out.print("Agora me fala a segunda nota:");
        nota2 = leitor.nextDouble();

        System.out.print("Terceira nota por favor:");
        nota3 = leitor.nextDouble();

        System.out.print("Ae essa é o ultimo qual é a quarta nota:");
        nota4 = leitor.nextDouble();

        calcularMediaDoAluno();
    }

    public void calcularMediaDoAluno() {
        double somaDasNotas;
        somaDasNotas = nota1 + nota2 + nota3 + nota4;
        notaFinalDoAluno =somaDasNotas /4;

        exibirResultadoDoAluno();
    }

    public void exibirResultadoDoAluno() {
        System.out.println("------------------------------------------------");
        if (notaFinalDoAluno >= 5.0) {
            System.out.println("É o seguinte " + nome + " você foi aprovado!!");
        } else if (notaFinalDoAluno <3.0) {
            System.out.println("Então " + nome + " infelizmente você foi reprovado meus pesames");
        } else {
            System.out.println("Você ainda tem chance, vamos deixar você em recuperação. Ok?");
        }
        System.out.println("Você ficou com a media de " + notaFinalDoAluno + ".");
        System.out.println("------------------------------------------------");
    }
}
