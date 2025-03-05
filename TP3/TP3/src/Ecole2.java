
import java.util.Scanner;


//q6
public class Ecole2 {   
    public static void main(String[] args) {
        Département d = new Département();
        Professeur p = new Professeur("ahmed",3,"ahmed@gmail.com","prof");
        
        Scanner scanner=new Scanner(System.in);

        System.out.println("donner le nom du departement :");
        String n=scanner.next();
        d.setNom(n);
        d.setChefDepartement(p);
        d.ajouterMembre(p);
        
        System.out.println(d.calculMasseSalariale(36));
        
        
        
    }
}
