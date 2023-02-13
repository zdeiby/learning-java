public class Usuario1 {
    public static void main(String[] args) {
        Banco Diego = new Banco(-1);
        Diego.setNombre("Diego alonzo");
        Diego.setNumeroDeCuenta("123");
        Diego.usuario = new Datos();
        Diego.usuario.setCedula(1025);
        Diego.usuario.setDireccion("calle 50c");
        Diego.usuario.setTelefono(3221109);
        System.out.println( Diego.getSaldo());
        Diego.consignar(1000.0);
        System.out.println( Diego.getSaldo());
        System.out.println(Diego.usuario.getCedula());
        System.out.println(Diego.getNombre());

        System.out.println(Diego.getNombre());
        System.out.println(Diego.getAgencia());

        Banco Carlos=new Banco(2);
        Banco Carlos1=new Banco(2);
        Banco Carlos2=new Banco(2);
        Banco Carlos3=new Banco(2);
        Banco Carlos4=new Banco(2);
        Banco Carlos5=new Banco(2);
        Banco Carlos6=new Banco(2);
        Banco Carlos7=new Banco(2);

    }
}
