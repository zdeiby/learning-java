package herencia;

public class Cuenta {
    String titular;
    double cantidad;

  

    public Cuenta(String titular, double cantidad){
        if(cantidad < 0){
            System.out.println("la cantidad agregada es invalida");
        }else{
            this.titular=titular;
            this.cantidad=cantidad;
        }  
    }

    public void setCantidad(double cantidad){
        if(cantidad < 0){
            System.out.println("la cantidad agregada es invalida");
        }else{
        this.cantidad=cantidad;
        }
    }

    public void retirar(double monto){
        if(monto > this.cantidad){
            System.out.println("saldo insuficiente");
        }
        else{
            System.out.println("saldo retirado correctamente");
            this.cantidad=this.cantidad-monto;
        }
    }

    public double getCantidad(){
        return this.cantidad;
    }

    public String getTitular(){
        return this.titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }
}
