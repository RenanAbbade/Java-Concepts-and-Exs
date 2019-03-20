/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Documento : TadListaLigada.java
 *
 * @author Marcio P. Feitosa em 11/09/2018 - 10:01:54
 */
public class TadListaLigada {

    private int totalElementos = 0;

    public TadListaLigada() {
        this.inicio = null;
    }

    Elemento inicio;

    public boolean vazia() {
        return inicio == null;
    }

    public void insereInicio(Elemento e) {
        e.setProximo(inicio);
        inicio = e;
        this.totalElementos++;
    }

    public void insereFinal(Elemento e) {
        if (vazia()) {
            insereInicio(e);
        } else {
            Elemento x = inicio;
            while (x.getProximo() != null) {
                x = x.getProximo();
            }
            x.setProximo(e);

        }
        this.totalElementos++;

    }

    public void adicionaPosicao(int posicao, Elemento elemento) {
        if (posicao == 0) {
            insereInicio(elemento);
        } else if (posicao == this.totalElementos) {
            insereFinal(elemento);
        } else {

            Elemento anterior = pegaCelula(posicao - 1);
            Elemento proximo = anterior.getProximo();
            Elemento x = new Elemento(anterior.getProximo(), elemento);

            anterior.setProximo(x);
            proximo.setAnterior(x);
            this.totalElementos++;

        }

    }

    public String imprime() {
        String ret = "[";

        if (!vazia()) {
            Elemento x = inicio;
            while (true) {
                ret += " " + x.getNumero();
                if (x.getProximo() != null) {
                    x = x.getProximo();
                } else {
                    break;
                }
            }

        }

        ret += " ]";
        return ret;

    }

    public int tamanho() {
        return this.totalElementos;
    }

    public void alteraValor(int posicao, int numero) {
        if (vazia()) {
            throw new IllegalArgumentException("Lista está vazia!");
        } else {
            Elemento antiga = this.pegaCelula(posicao);
            antiga.setNumero(numero);
            this.totalElementos++;

        }

    }

    public void removePosicao(int posicao) {

        Elemento anterior = this.pegaCelula(posicao - 1);
        Elemento atual = anterior.getProximo();
        Elemento proximo = atual.getProximo();

        anterior.setProximo(proximo);
        this.totalElementos--;

    }

    public boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.totalElementos;
    }

    public Object pega(int posicao) {
        return pegaCelula(posicao).getNumero();
    }

    public Elemento pegaCelula(int posicao) {

        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("posicao nao existe");
        }

        Elemento atual = inicio;

        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }
        return atual; //retornou a celula jose
    }

}