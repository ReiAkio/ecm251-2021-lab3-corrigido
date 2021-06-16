package linked_list_test_drive;

import br.maua.model.Pessoa;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTestDrive {
    public static void main(String[] args){
        LinkedList<Pessoa> pessoas = new LinkedList<>();
        pessoas.add(new Pessoa("Batman", "001"));
        pessoas.add(new Pessoa("Superman", "002"));
        pessoas.add(new Pessoa("Mutano", "003"));

        System.out.println("=========");
        System.out.println("Passando por toda a ListaLigada:");
        Iterator<Pessoa> iterator = pessoas.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
