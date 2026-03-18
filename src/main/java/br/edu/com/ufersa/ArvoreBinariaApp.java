package br.edu.com.ufersa;

public class ArvoreBinariaApp {
    public static void main(String[] args) {

        No no7 = new No(7);
        No no10 = new No(10);
        No no16 = new No(16);

        No no4 = new No(4);
        No no9 = new No(9, no7, no10);
        No no17 = new No(17, no16, null);

        No no6 = new No(6, no4, no9);
        No no13 = new No(13, null, no17);

        No no11 = new No(11, no6, no13);

        ArvoreBinaria arvoreBinaria = new ArvoreBinaria(no11);
        System.out.println("Percurso em ordem:");
        arvoreBinaria.ordem();
        System.out.println("\nPercurso em pré-ordem:");
        arvoreBinaria.preOrdem();
        System.out.println("\nPercurso em pós-ordem:");
        arvoreBinaria.posOrdem();
        System.out.println("\nPercurso por nível:");
        arvoreBinaria.porNivel();

        No raiz = new No(10);
        raiz.esq = new No(5);
        raiz.dir = new No(20);

        ArvoreBinaria arvore = new ArvoreBinaria(raiz);

        System.out.println("Altura da árvore: " + arvore.porAltura());



    }
}
