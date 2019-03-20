/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

import java.util.Scanner;

/**
 *
 * @author Renan
 */
public class Sistema {

    public static void main(String[] args) {

        TadListaLigada lista = new TadListaLigada();

        Scanner scn = new Scanner(System.in);
        Scanner scnS = new Scanner(System.in);

        while (true) {

            System.out.println("\n\n\n==========================================");
            System.out.println("      TAD Lista Ligada");
            System.out.println("==========================================");
            System.out.println("");
            System.out.println("0 - sair"); //feito
            System.out.println("1 - inserir um elemento no inicio da lista"); //feito
            System.out.println("2 - inserir um elemento no final da lista"); //feito
            System.out.println("3 - alterar o valor do elemento de posição n na lista");//feito
            System.out.println("4 - inserir um elemento na posição n da lista (o atual n irá para n+1)"); //feito
            System.out.println("5 - excluir um elemento da posição n da lista"); //feito
            System.out.println("6 - contar os elementos da lista"); //feito
            System.out.println("7 - imprimir elementos da lista"); //feito 

            System.out.println("\n");
            System.out.print("Digite sua escolha: ");
            int opc = scn.nextInt();

            int num;
            int num2;
            if (opc == 0) {
                break;
            } else if (opc == 1) {
                System.out.println("Informe o valor do novo elemento a ser inserido no inicio: ");
                num = scn.nextInt();
                Elemento e = new Elemento(num);
                lista.insereInicio(e);

            } else if (opc == 2) {
                System.out.println("Informe o valor do novo elemento a ser inserido no final: ");
                num = scn.nextInt();
                Elemento e = new Elemento(num);
                if (lista.vazia()) {
                    lista.insereInicio(e);
                } else {
                    lista.insereFinal(e);
                }

            } else if (opc == 3) {
                System.out.println("Insira a posicao do elemento a ser alterado: ");
                num = scn.nextInt();
                System.out.println("Agora insira o novo valor: ");
                num2 = scn.nextInt();
                lista.alteraValor(num, num2);

            } else if (opc == 4) {
                System.out.println("Insira a posição onde o elemento vai ser inserido: ");
                num = scn.nextInt();
                System.out.println("Agora insira o novo valor: ");
                num2 = scn.nextInt();
                Elemento e = new Elemento(num2);
                lista.adicionaPosicao(num, e);

            } else if (opc == 5) {
                System.out.println("insira a posição do elemento a ser removido: ");
                num = scn.nextInt();
                lista.removePosicao(num);

            } else if (opc == 6) {
                System.out.println("Quantidade de elementos na lista: " + lista.tamanho());

            } else if (opc == 7) {
                System.out.println(lista.imprime());
            }

            System.out.println("\n\n(press. ENTER)");
            String s = scnS.nextLine();

        }

        System.out.println("\n--------------------------------------------------");
        System.out.println("*** Obrigado e ate' breve ***");

    }

}