package List;

import java.util.ArrayList;

public class clase6 {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Geometria", 30, new ArrayList<>());
        curso1.addClase(new clase("ArrayList"));

        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
    
        System.out.println(cursos.get(0).getClaseList());

     
}
}
