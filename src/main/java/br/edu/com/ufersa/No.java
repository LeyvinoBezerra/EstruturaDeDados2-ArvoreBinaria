package br.edu.com.ufersa;

public class No {
    public int chave;
    public No esq, dir;

    public No(int k,No sEsq, No sDir){
        chave = k;
        esq = sEsq;
        dir = sDir;
    }
    public No(int k){
        chave = k;
        esq = null;
        dir = null;
    }


}