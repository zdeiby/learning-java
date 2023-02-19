package exception;

public class test {
    public static void main(String[] args) {
        try{
            metodo2();
        }catch(newException error){
            error.printStackTrace();
        }
    } private static void metodo2(){
             throw new newException("errorrrrrr");
        }
}
