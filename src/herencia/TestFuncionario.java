package herencia;

public class TestFuncionario {
    public static void main(String[] args) {
        Funcionario Diego = new Funcionario();
        Diego.setNombre("diego de jesus");
        Diego.setDocumento("103523");
        Diego.setSalario(50000);
        Diego.setTipo(0);

        System.out.println(Diego.getNombre());
        System.out.println(Diego.getDocumento());
        System.out.println(Diego.getSalario());
        System.out.println(Diego.getBonificacion());
    }
}
