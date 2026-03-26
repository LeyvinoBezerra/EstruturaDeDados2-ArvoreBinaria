package br.edu.com.ufersa;

import java.util.LinkedList;
import java.util.Queue;

public class ArvoreBinariadeBusca {
    private No raiz;

    public ArvoreBinariadeBusca(No raiz) {
        this.raiz = raiz;
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

    public No buscar(int valor) {
        return buscar(raiz, valor);
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

    public void remover(int chave) {
        raiz = remover(raiz, chave);
    }


    private No remover(No atual, int chave) {
        if (atual == null) {
            return null;
        }

        if (chave < atual.chave) {
            atual.esq = remover(atual.esq, chave);
        } else if (chave > atual.chave) {
            atual.dir = remover(atual.dir, chave);
        } else {
            // Nó encontrado
            if (atual.esq == null && atual.dir == null) {
                return null; // Caso 1: folha
            }
            if (atual.esq == null) {
                return atual.dir; // Caso 2: só filho direito
            }
            if (atual.dir == null) {
                return atual.esq; // Caso 2: só filho esquerdo
            }
            // Caso 3: dois filhos
            No sucessor = encontrarMinimo(atual.dir);
            atual.chave = sucessor.chave;
            atual.dir = remover(atual.dir, sucessor.chave);
        }
        return atual;
    }

    public No encontrarMinimo(No atual) {
        while (atual.esq != null) {
            atual = atual.esq;
        }
        return atual;
    }


}
