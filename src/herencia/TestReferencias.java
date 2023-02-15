package herencia;

public class TestReferencias {
    public static void main(String[] args) {
        Funcionario funcionario = new Gerente();
        funcionario.setNombre("Diego");

        Gerente gerente = new Gerente();
        gerente.setNombre("carlos");

        funcionario.setSalario(2000);
        gerente.setSalario(10000);
    }
}
