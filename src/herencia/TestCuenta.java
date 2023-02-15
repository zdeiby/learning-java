package herencia;

public class TestCuenta {
    public static void main(String[] args) {
        CuentaCorriente cc= new CuentaCorriente("lopex", 1);
        CuentaAhorros ca= new CuentaAhorros("carla", 3);
        cc.setCantidad(2000);
        
    }
}
