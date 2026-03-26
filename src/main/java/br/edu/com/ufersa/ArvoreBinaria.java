package br.edu.com.ufersa;

import java.util.LinkedList;
import java.util.Queue;

public class ArvoreBinaria {
    private No raiz;

    public ArvoreBinaria(No no) {

        raiz = no;
    }


    public void ordem() {

        ordem(raiz);
    }

    private void ordem(No no) {

        if (no != null) {
            ordem(no.esq);
            ordem(no.dir);
            System.out.print(no.chave + " ");
            ordem(no.dir);
        }
    }


    public void preOrdem() {
        preOrdem(raiz);
    }

    private void preOrdem(No no) {
        if (no != null) {
            System.out.print(no.chave + " ");
            preOrdem(no.esq);
            preOrdem(no.dir);


        }
    }

    public void posOrdem() {

        posOrdem(raiz);
    }


    private void posOrdem(No no) {
        if (no != null) {
            posOrdem(no.esq);
            posOrdem(no.dir);
            System.out.print(no.chave + " ");
        }
    }

    public void porNivel() {

        porNivel(raiz);
    }

    private void porNivel(No no) {

        // No atual
        if (no != null) {
            Queue<No> fila = new LinkedList<>();
            fila.add(no);
            while (!fila.isEmpty()) {
                No atual = fila.remove();
                System.out.print(atual.chave + " ");
                if (atual.dir != null) fila.add(atual.dir);
                if (atual.esq != null) fila.add(atual.esq);
            }

        }
    }

    /* public int porAltura(No no) {

         return porAltura(raiz);
     }

     private int porAltura(No no) {
         int alturaEsq = 0, alturaDir = 0;

         if (no == null) {
             return -1;
         }
         if (alturaEsq > alturaDir) {

             return alturaEsq = porAltura(no.esq);
         } else {

             return alturaDir = porAltura(no.dir);
         }

     }*/
    public void inserir(int valor) {
        raiz = inserir(raiz, valor);
    }

    private No inserir(No no, int valor) {
        if (no == null) {
            no = new No(valor);
        } else if (valor < no.chave) {
            no.esq = inserir(no.esq, valor);
        } else if (valor > no.chave) {
            no.dir = inserir(no.dir, valor);
        }
        return no;

    }

    public int buscar() {
        return buscar();
    }

    private No buscar(No no, int valor) {
        if (no == null) {
            return null;
        }
        if (valor < no.chave) {
            return buscar(no.esq, valor);

        } else if (valor > no.chave) {
            return buscar(no.dir, valor);
        } else {
            return no;
        }
    }


}