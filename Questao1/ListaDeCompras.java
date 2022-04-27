package Questao1;

import java.util.ArrayList;
import java.util.Collections;

public class ListaDeCompras {
    ArrayList<String> lista = new ArrayList<String>();


    public void insereLista(String nome){
        if(!lista.contains(nome)) {
            lista.add(nome);
        }
        else{
            System.out.println("Produto repetido!");
        }
    }


    public void imprimeLista(){
        Collections.sort(lista);

        for(int i=0;i< lista.size();i++){
            System.out.println(lista.get(i));
        }

    }

}
