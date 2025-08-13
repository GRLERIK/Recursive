import model.Recursive;
import model.Recursive2;

public class Main {
    public static void main(String[] args) {
         Recursive r = new Recursive();
         Recursive2 r2 = new Recursive2();

         System.out.println("Erik:");
         r.setN(3);
         r.crescente();

         System.out.println("Levi:");
         r2.setN(6);
         r2.setN2(3);
         r2.div();
    }

}