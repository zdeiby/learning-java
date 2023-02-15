package herencia;

public class Funcionario {
 private String nombre;
 private String documento;
 private double salario;
 private int tipo;

 public Funcionario(){

 }

 public void setNombre(String nombre){
    this.nombre=nombre;
 }
 public String getNombre(){
    return this.nombre;
 }

 public void setDocumento(String documento) {
     this.documento = documento;
 }

 public String getDocumento(){
    return this.documento;
 }

 public void setSalario(double salario){
    this.salario=salario;
 }

 public void setTipo(int tipo) {
     this.tipo = tipo;
 }
 public int getTipo() {
     return tipo;
 }

 public double getSalario() {
     return salario;
 }

 public double getBonificacion(){
    return this.salario*0.1;
 }
}
