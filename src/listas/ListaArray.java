package listas;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public interface ListaArray {
    public static void main(String[] args) {
        String alumno1 = "Deiby 1";
        String alumno2 = "Deiby 2";
        String alumno3 = "Deiby 3";
        String alumno4 = "Deiby 4";
        String alumno5 = "Deiby 5";
        String alumno6 = "Deiby 6";

        Set<String> listaAlumnos = new HashSet<>();
        Collection<String> listaAl= new HashSet<>();

        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);

        listaAl.add(alumno1);
        listaAl.add(alumno2);
        listaAl.add(alumno3);
        listaAl.add(alumno4);
        listaAl.add(alumno5);
        listaAl.add(alumno6);

        for(String alumno:listaAlumnos){
            System.out.println(alumno);

        }
        
        for(String alumno:listaAl){
            System.out.println(alumno);

        }
        
        boolean valida= listaAl.contains("deiby 1");
        System.out.println(valida);
    }
}
