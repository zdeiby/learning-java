package Abstacts;

public abstract class User {
    private String nombre;
    private String edad;

    public User(String nombre, String edad){
            this.nombre=nombre;
            this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public abstract void showDataUser();

    @Override
    public String toString(){
        return nombre+" "+edad;
    }
}
