package Interface;

public class Nuse extends User{
    private String especialidad;

    public Nuse(String nombre, String edad) {
        super(nombre, edad);
    }

        public String getEspecialidad() {
            return especialidad;
        }

        public void setEspecialidad(String especialidad) {
            this.especialidad = especialidad;
        }
    
}
