import boissons.Boisson;
import boissons.Expresso;
import decorateurs.Caramel;
import decorateurs.Chocollat;

public class Main {
    public static void main(String[] args) {

        Boisson b = new Expresso();
        System.out.println("*************************");
        System.out.println(b.getDescription());
        System.out.println(b.cout());
        System.out.println("**************************");
        b = new Chocollat(b);
        System.out.println("**************************");
        System.out.println(b.getDescription());
        System.out.println(b.cout());
        System.out.println("****************************");

        b = new Caramel(b);
        System.out.println("**************************");
        System.out.println(b.getDescription());
        System.out.println(b.cout());
        System.out.println("****************************");
        b = new Chocollat(b);
        System.out.println("**************************");
        System.out.println(b.getDescription());
        System.out.println(b.cout());
        System.out.println("****************************");
        
        b = new Chocollat(b);
        System.out.println("**************************");
        System.out.println(b.getDescription());
        System.out.println(b.cout());
        System.out.println("****************************");
    }
}