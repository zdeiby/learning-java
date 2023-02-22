package Abstacts;

public class test {
    public static void main(String[] args) {
        User user = new Nuse("deiby", "28");
        user.showDataUser();
        User user2 = new Doctor("deiby", "28");
        user2.showDataUser();
        User paciente = new Paciente("deiby","38");
        paciente.showDataUser();
        System.out.println(paciente);

    }
}
