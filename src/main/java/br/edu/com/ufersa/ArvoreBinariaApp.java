package br.edu.com.ufersa;

public class ArvoreBinariaApp {
    public static void main(String[] args) {
//
//        No no7 = new No(7);
//        No no10 = new No(10);
//        No no16 = new No(16);
//
//        No no4 = new No(4);
//        No no9 = new No(9, no7, no10);
//        No no17 = new No(17, no16, null);
//
//        No no6 = new No(6, no4, no9);
//        No no13 = new No(13, null, no17);
//
//        No no11 = new No(11, no6, no13);

//        No no1 = new No(1, no2);
//        No no2 = new No(2);
//        No no3 = new No(3);
//        No no4 = new No(4);
//        No no5 = new No(5);

                // Criando a raiz
                No raiz = new No(10);

                // Adicionando filhos
                raiz.esq = new No(5);
                raiz.dir = new No(20);

                // Adicionando netos
                raiz.esq.esq = new No(3);
                raiz.esq.dir = new No(7);
                raiz.dir.esq = new No(15);
                raiz.dir.dir = new No(25);

                // Agora a árvore está assim:
                //            10
                //          /    \
                //         5      20
                //        / \    /  \
                //       3   7  15  25


        ArvoreBinariadeBusca arvoreBinaria= new ArvoreBinariadeBusca(new No(10));
        System.out.println("Percurso em ordem:");
        arvoreBinaria.ordem();
        System.out.println("\nPercurso em pré-ordem:");
        arvoreBinaria.preOrdem();
        System.out.println("\nPercurso em pós-ordem:");
        arvoreBinaria.posOrdem();
        System.out.println("\nPercurso por nível:");
        arvoreBinaria.porNivel();

//        No raiz = new No(10);
//        raiz.esq = new No(5);
//        raiz.dir = new No(20);

        ArvoreBinariadeBusca arvore = new ArvoreBinariadeBusca(new No(7));
        System.out.println("\nPercurso em ordem:");
        arvore.ordem();
        System.out.println("\nPercurso em pré-ordem:");
        arvore.preOrdem();
        System.out.println("\nPercurso em pós-ordem:");
        arvore.posOrdem();
        System.out.println("\nBuscar:");
        No resultado = arvore.buscar(7);
        if (resultado != null) {
            System.out.println("Encontrado: " + resultado.chave);
        } else {
            System.out.println("Não encontrado!");
        }
        System.out.println("\nPercurso em ordem:");
        arvore.ordem();
        System.out.println("\nRemove:");
//        arvore.remover(4);
//        arvore.remover(10);
//        arvore.remover(17);
        System.out.println("\nPercurso em ordem:");
        arvore.ordem();





        arvore.inserir(15);
        arvore.inserir(25);

        System.out.println("\nPercurso em ordem:");
        arvore.ordem();



    }
}
