package equalshash;

import java.util.Collection;
import java.util.HashSet;

public class TestAlumno {
    public static void main(String[] args) {

        Alumno alumno1=new Alumno("luis miguel", "001");
        Alumno alumno2=new Alumno("deiby graciano", "002");
        Alumno alumno3=new Alumno("pancho suarez", "003");
        Alumno alumno4=new Alumno("luisa lopez", "004");
        Alumno alumno5=new Alumno("ana maria hernandez", "005");
        Alumno alumno6=new Alumno("lucas dalto", "006");
        Alumno alumno7=new Alumno("sebastian gomez", "007");
        Alumno alumno8=new Alumno("anahi lopez", "008");
        Alumno alumno9=new Alumno("juan david castaño", "009");
        Alumno alumno10=new Alumno("briyin paz", "010");

        Collection<Alumno> listaAlumnos = new HashSet<>(); //new ArrayList<>();
        
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);
        listaAlumnos.add(alumno7);
        listaAlumnos.add(alumno8);
        listaAlumnos.add(alumno9);
        listaAlumnos.add(alumno10);

        System.out.println(listaAlumnos.contains(alumno1));

        Alumno alumnoNuevo = new Alumno("luis miguel", "001");
        
        System.out.println(listaAlumnos.contains(alumnoNuevo));

    }
}
