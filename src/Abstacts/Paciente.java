package Abstacts;

public class Paciente extends User{
    public  Paciente(String nombre, String edad){
        super(nombre, edad);
    }

    @Override
    public void showDataUser() {
       System.out.println("paciente");
       System.out.println("Historial completo desde nacimiento");
    }
    
}
