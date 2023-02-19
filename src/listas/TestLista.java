package listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestLista {
    public static void main(String[] args) {
        ListaObjetos curso1 = new ListaObjetos("Geometria", 30);
        ListaObjetos curso2 = new ListaObjetos("Fisica", 10);
        ListaObjetos curso3 = new ListaObjetos("quimica", 20);
        ListaObjetos curso4 = new ListaObjetos("historia", 50);

        ArrayList<ListaObjetos> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);
        System.out.println(cursos);

       cursos.sort(Comparator.comparing(ListaObjetos::getNombre));
        
       System.out.println(cursos);

       List<ListaObjetos> cursoList =cursos.stream().sorted(Comparator.comparingInt(ListaObjetos::getTiempo)).collect(Collectors.toList());
        System.out.println(cursoList);

        List<ListaObjetos> cursoList2 =cursos.stream().filter(ListaObjetos -> !ListaObjetos.getNombre().equalsIgnoreCase("Fisica")).sorted(Comparator.comparingInt(ListaObjetos::getTiempo)).collect(Collectors.toList());
        System.out.println(cursoList2);
    }
}
