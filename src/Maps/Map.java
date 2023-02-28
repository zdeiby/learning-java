package Maps;

import List.Curso;

public class Map{
    
   public static void main(String[] args) {
    Curso curso1=new Curso("historia",30);

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

            
    curso1.add(alumno1);
    curso1.add(alumno2);
    curso1.add(alumno3);
    curso1.add(alumno4);
    curso1.add(alumno5);
    curso1.add(alumno6);
    curso1.add(alumno7);
    curso1.add(alumno8);
    curso1.add(alumno9);
    curso1.add(alumno10);

    System.out.println(curso1);

   //curso1.forEach(alumno -> System.out.println(alumno));
  // }


}
}