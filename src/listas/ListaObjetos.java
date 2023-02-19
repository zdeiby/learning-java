package listas;

public class ListaObjetos  {
    private String nombre;
    private int tiempo;

    public ListaObjetos(String nombre, int tiempo){
        this.nombre=nombre;
        this.tiempo=tiempo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public int getTiempo(){
        return this.tiempo;
    }

    public void setTiempo(int tiempo){
        this.tiempo=tiempo;
    }

    @Override
    public String toString(){
        return this.nombre;
    }

}
