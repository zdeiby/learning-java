package listas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ejemplo1 {
    public static void main(String[] args) {
        String curso1 = "geometria";
        String curso2="fisica";
        String curso3 = "quimica";
        String curso4 = "historia";

        ArrayList<String> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        System.out.println(cursos);

        cursos.remove(0);
        System.out.println(cursos);

        cursos.set(0, "modificado");
        System.out.println(cursos.size());

        for(int i=0; i<cursos.size(); i++){
            System.out.println(cursos.get(i));
        }

       for (String clase: cursos){
            System.out.println(clase);
        };

        cursos.forEach(clase ->{
            System.out.println(clase);
        });

        Collections.sort(cursos);
        System.out.println(cursos);

        Collections.sort(cursos,Collections.reverseOrder());
        System.out.println(cursos);

        cursos.sort(Comparator.reverseOrder());  //naturalOrder();
        System.out.println(cursos);

        List<String> cursosList =cursos.stream().sorted().collect(Collectors.toList());
        System.out.println(cursosList);

        System.out.println(cursos);

    }
}
