package Ejercicios;

public class Persona {
   private String nombre;
   private double edad =0;
   private String DNI;
   private String sexo;
   private double peso =0;
   private double altura =0;
            Datos addicion = new Datos();

   public Persona(){

   }
   public Persona(String nombre, double edad, String DNI, String sexo, double peso ,double altura  ){
    this.nombre=nombre;
    this.edad=edad;
    this.DNI=DNI;
    this.peso=peso;
    this.altura=altura;
}
 public Persona(String nombre, double edad, String sexo){
       this(nombre,edad,"123",sexo,0,0);
   }

   public double calcularIMC(){
    double datos=-100;
    double imc=this.peso/(this.altura*this.altura);
    if (imc < 20){
        datos = -1;
    }
    if(imc >=20 && imc <=25){
        datos = 0;
    }
    if(imc > 25){
        datos = 1;
    }

    return datos;

   }

   public void setPeso(double peso) {
       this.peso = peso;
   }
   public void setAltura(double altura) {
       this.altura = altura;
   }



  

}
