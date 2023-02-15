package herencia;

public class TestGerente {
    public static void main(String[] args) {
       Gerente Gerente = new Gerente();
        Gerente.setNombre("javier de la cuesta");
        Gerente.setDocumento("103523");
        Gerente.setSalario(50000);
        Gerente.setTipo(1);
        Gerente.setClave("AluraCursos");
        System.out.println(Gerente.getNombre());
        System.out.println(Gerente.getDocumento());
        System.out.println(Gerente.getSalario());
        System.out.println(Gerente.getBonificacion());
        System.out.println(Gerente.iniciarSesion("AluraCursos"));
    }
}
