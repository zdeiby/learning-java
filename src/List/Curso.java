package List;

import java.util.ArrayList;
import java.util.List;

import Maps.Alumno;

public class Curso {
    private String nombre;
    private int tiempo;
    private List<clase> claseList = new ArrayList<>();

    public Curso(String nombre, int tiempo){
        this.nombre=nombre;
        this.tiempo=tiempo;

    }
    public Curso(String nombre, int tiempo, List<clase> claseList){
        this.nombre=nombre;
        this.tiempo=tiempo;
        this.claseList= claseList;

    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    public int getTiempo() {
        return tiempo;
    }
    public void setClaseList(List<clase> claseList) {
        this.claseList = claseList;
    }

    public List<clase> getClaseList() {
        return claseList;
    }

    public void addClase(clase clase){
        this.claseList.add(clase);
    }

    @Override
    public String toString() {
        return this.nombre;
    }
    public void add(Alumno alumno1) {
    }
    public Object getAlumnos() {
        return null;
    }
}
