public class Usuario2 {
    public static void main(String[] args) {
        Banco Clara = new Banco(10);
        Clara.setAgencia(4);
        Clara.setNombre("Clara alonzo");
        Clara.setNumeroDeCuenta("123");
        Clara.usuario = new Datos();
        Clara.usuario.setCedula(1025);
        Clara.usuario.setDireccion("calle 50c");
        Clara.usuario.setTelefono(3221109);
        System.out.println( Clara.getSaldo());
        Clara.consignar(1000.0);
        System.out.println( Clara.getSaldo());
    }
}
