package br.edu.com.ufersa;

import java.util.LinkedList;
import java.util.Queue;

public class ArvoreBinaria {
    private final No raiz;

    public ArvoreBinaria(No no) {

        raiz = no;
    }




    public void ordem(){

        ordem(raiz);
    }
   private void ordem(No no){

        if(no != null){
            ordem(no.esq);
            ordem(no.dir);
            System.out.print(no.chave + " ");
            ordem(no.dir);
        }
    }


    public void preOrdem() {
        preOrdem(raiz);
    }

    private void preOrdem(No no){
        if(no != null){
            System.out.print(no.chave + " ");
            preOrdem(no.esq);
            preOrdem(no.dir);


        }
    }
    public void posOrdem(){

        posOrdem(raiz);
    }



        private void posOrdem(No no){
        if(no != null){
            posOrdem(no.esq);
            posOrdem(no.dir);
            System.out.print(no.chave + " ");
        }
    }

    public void porNivel(){

        porNivel(raiz);
    }

    private void porNivel(No no){

        // No atual
        if(no != null){
            Queue<No> fila = new LinkedList<>();
            fila.add(no);
            while(!fila.isEmpty()){
                No atual = fila.remove();
                System.out.print(atual.chave + " ");
                if(atual.dir != null) fila.add(atual.dir);
                if(atual.esq != null) fila.add(atual.esq);
            }

        }
    }

}