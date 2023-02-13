public class Banco {
    private String nombre;
    private double saldo;
    private String numeroDeCuenta;
    Datos usuario;
    private int agencia;

    private static int contador=0;

    public Banco(int agencia){   //constructor
        if(agencia >0){
              System.out.println("aqui se crea una nueva cuenta");
              this.agencia=agencia;
        }else{
            System.out.println("no puedes agregar agencia negativo");
            this.agencia=1;
        } 
          contador++;
        System.out.println("se van creando" + " "+ contador+" cuentas");
     
      
    }

   public boolean transferir(double valor, Banco usuario){
    if(this.saldo > 0){
         this.saldo=this.saldo-valor;
        usuario.saldo=valor+ usuario.saldo;
         return true;
    }
       return false;
   }
   public void consignar(Double valor){
        this.saldo = this.saldo+valor;
   }
   public boolean retirar(double valor){
    if(this.saldo > 0){
        this.saldo= this.saldo-valor;
        return true;
    }
    return false;
   }

   public double getSaldo(){
        return this.saldo;
   }

   public void setAgencia(int nuevaAgencia){
    this.agencia=nuevaAgencia;
   }
   public void setNombre(String nombre){
    this.nombre=nombre;
   }
   public void setNumeroDeCuenta(String numero){
    this.numeroDeCuenta=numero;
   }
   public String getNombre() {
       return nombre;
   }
   public int getAgencia() {
       return agencia;
   }
}

