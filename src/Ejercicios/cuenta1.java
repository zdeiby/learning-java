package Ejercicios;

public class cuenta1 {
    public static void main(String[] args) {
        Cuenta Diego= new Cuenta("diego andres");
        Diego.setCantidad(20000);
        System.out.println(Diego.getCantidad());
        System.out.println(Diego.titular);
        Diego.retirar(1000);
        System.out.println(Diego.getCantidad());
        Diego.setTitular("carlos andes");
        System.out.println(Diego.getTitular());
    }
}
