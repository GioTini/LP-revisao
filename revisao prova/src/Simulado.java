import java.util.Scanner;

public class Simulado {
    /** Desenvolva os códigos dentro de cada espaço reservado para as questões
     * Ex.: a questão 1 -> public static void questao1() { **DESENVOLVA DENTRO DAS CHAVES }
     *  Para executar e testar uma das atividades, apague as barras duplas "//" da questão que deseja e rode o código
     *  Para executar, por exemplo, a questão 2, readicione as barras duplas "//" ao inicio de "questao1()" e apague
     *  as barras duplas da "questao2()"
     */
    public static void main(String[] args) {
//        questao1();
//        questao2();
//        questao3();
//        questao4();
//        questao5();
//        questao6();
//        questao7();
//        questao8();
//        questao9();
//        questao10();
    }

    /** Faça um programa para a leitura de duas notas parciais de um aluno.
     A mensagem “Aprovado”, se a média alcançada for maior ou igual a sete;
     A mensagem “Aprovado com Distinção”, se a média for igual a dez;
     A mensagem "Em recuperação" se a média for maior que três e menor que sete;
     A mensagem “Reprovado” se a média for menor ou igual de do que três;
     */
    public static void questao1() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a primeira nota parcial:");
        int notaum = entrada.nextInt();

        System.out.println("Digite a segunda nota parcial:");
        int notadois = entrada.nextInt();

        if ((notaum + notadois) / 2 == 10) {
            System.out.println("Aprovado com Distinção!");
        }
        else if ((notaum + notadois) / 2 >= 7) {
            System.out.println("Aprovado!");
        }
        else if ((notaum + notadois) / 2 > 3 && (notaum + notadois) / 2 <= 7) {
            System.out.println("Em recuperação!");
        }
        else {
            System.out.println("Reprovado!");
        }
    }

    /** Faça um programa que leia três números,
     * verifique e mostre o maior deles.
     */
    public static void questao2() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int numeroum = entrada.nextInt();

        System.out.println("Digite o segundo número:");
        int numerodois = entrada.nextInt();

        System.out.println("Por fim, digite o terceiro número:");
        int numerotres = entrada.nextInt();

        if (numeroum > numerodois && numeroum > numerotres) {
            System.out.println("O número maior entre eles é o " + numeroum);
        }
        else if (numerodois > numeroum && numerodois > numerotres) {
            System.out.println("O número maior entre eles é o " + numerodois);
        }
        else {
            System.out.println("O número maior entre eles é o " + numerotres);
        }

    }

    /**
     * Faça um programa que leia três números, verifique (usando if e else) e mostre o maior e o menor deles;
     */
    public static void questao3() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int um = entrada.nextInt();

        System.out.println("Digite o segundo número:");
        int dois = entrada.nextInt();

        System.out.println("Digite o terceiro número:");
        int tres = entrada.nextInt();

        if (um > dois && um > tres) {
            System.out.println("O maior número é o " + um);
        }
        else if (dois > um && dois > tres) {
            System.out.println("O maior número é o " + dois);
        }
        else {
            System.out.println("O número maior é o " + tres);
        }
        if ( um < dois && um < tres) {
            System.out.println("O número menor é o " + um);
        } else if (dois < um && dois < tres) {
            System.out.println("O número menor é o " + dois);
        }
        else {
            System.out.println("O número menor é o " + tres);
        }
    }

    /**
     * Faça um programa que leia três números e mostre-os em ordem decrescente.
     */
    public static void questao4() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int um = entrada.nextInt();

        System.out.println("Digite o segundo número:");
        int dois = entrada.nextInt();

        System.out.println("Digite o tercerio número:");
        int tres = entrada.nextInt();

        if (um > dois && dois > tres){
            System.out.println("Sua ordem ficou: " + um + dois + tres);
        }
        else if (dois > tres && tres > um) {
            System.out.println("Sua ordem ficou: " + dois + tres + um);
        }
        else if (tres > um && tres > dois);

    }

    /**
     * Faça um Programa que leia 2 números e em seguida pergunte ao usuário
     * qual operação ele deseja realizar.
     * O resultado da operação deve ser acompanhado de uma frase que diga se o número é:
     * Par ou ímpar;
     * Positivo ou negativo;
     */
    public static void questao5() {

    }

    /**
     * Faça um programa que pergunte em que turno você estuda.
     * Peça para digitar M-matutino ou V-vespertino ou N-noturno.
     * Imprima a mensagem “Bom dia!” ou  “Boa Noite” ou “Valor inválido”, conforme o caso.
     */
    public static void questao6() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o seu turno de estudos? Usando M para matutino, V para vespertino ou N para noturno:");
        String turno = entrada.nextLine();

        switch (turno) {
            case "M" -> System.out.println("Bom dia!");
            case "m" -> System.out.println("Bom dia!");
            case "V" -> System.out.println("Boa tarde!");
            case "v" -> System.out.println("Boa tarde!");
            case "N" -> System.out.println("Boa noite!");
            case "n" -> System.out.println("Boa noite!");
            default -> System.out.println("Valor inválido!");
        }
    }

    /**
     * Faça um Programa que leia um número e exiba o dia correspondente da semana.
     * (1- Domingo , 2- Segunda, etc.) se digitar outro valor deve aparecer “valor inválido)
     */
    public static void questao7() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número que corresponde a um dia da semana");
        int semana = entrada.nextInt();

        switch (semana) {
            case 1 -> System.out.println("Domingo.");
            case 2 -> System.out.println("Segunda.");
            case 3 -> System.out.println("Terça.");
            case 4 -> System.out.println("Quarta.");
            case 5 -> System.out.println("Quinta.");
            case 6 -> System.out.println("Sexta.");
            case 7 -> System.out.println("Sabádo.");
            default -> System.out.println("Valor não corresponde à um dia da semana!");
        }

    }

    /**
     * Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre o mais barato.
     */
    public static void questao8() {

    }

    /**
     * Faça um programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno. Dicas:
     *
     * Três lados formam um triangulo quando a soma de quaisquer dos dois lados é maior que o terceiro.
     * Triângulo Equilátero: três lados iguais;
     * Triângulo Isósceles: quaisquer dois lados iguais;
     * Triângulo Escaleno: três lados diferentes;
     */
    public static void questao9() {

    }

    /**
     * - As organizações CSM resolveram dar um aumento de salário aos seus colaboradores e
     * lhe contrataram para desenvolver o programa que calculará os reajustes.
     *
     * a. Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual;
     * b. Salários até R$ 280,00 (incluindo): aumento de 20%;
     * c. Salários entre R$ 280,00 e R$700,00: aumento de 15%;
     * d. Salários entre R$ 700,00 e R$ 1500,00: aumento de 10%;
     * e. Salários de R$ 1500,00 em diante: aumento de 5%
     * Após o aumento ser realizado; informe na tela;
     *
     * a. O salário antes do reajuste;
     * b. O percentual de aumento aplicado;
     * c. O valor do aumento;
     * d. O novo salário, após o aumento.
     */
    public static void questao10() {

    }
}
