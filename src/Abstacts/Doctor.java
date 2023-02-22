package Abstacts;

public class Doctor extends User{

    

    public Doctor(String nombre, String edad) {
        super(nombre, edad);
    }

    @Override
    public void showDataUser() {
        System.out.println("hospital: juan de Dios"+" pediatria");
    }
    
}
