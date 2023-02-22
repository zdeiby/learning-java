package List;

import javax.swing.Action;

public class clase {
    private String nombre;

    public clase(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return this.nombre;
    }

   
}
