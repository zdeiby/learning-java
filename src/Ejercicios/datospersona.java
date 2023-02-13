package Ejercicios;

public class datospersona {
    public static void main(String[] args) {
        Persona deiby = new Persona();
        deiby.setPeso(90);
        deiby.setAltura(1.70);
        System.out.println(deiby.calcularIMC());
       deiby.addicion.setApellido("Graciano");
       deiby.addicion.setApodo("david");
     System.out.println( deiby.addicion.getApellido());
     System.out.println(deiby.addicion.getApodo()); 
    }
}
