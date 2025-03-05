
import java.util.Scanner;

// q5

public class Ecole1{
    public static void main(String[] agrs){
        
        Section s1=new Section();
        Professeur p2=new Professeur("rachid",3,"rachid@gmail.com","prof");
        s1.setnumeroSection(1);
        s1.setchefSection(p2);
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("donner le nombre des etudiants");
        int n=scanner.nextInt();
        for(int i=0;i<n;i++){
            Etudient e1 = new Etudient();
            System.out.println("nom de l'etudiant"+(i+1));
            e1.setnom(scanner.next());
            System.out.println("email de l'etudiant"+(i+1));
            e1.setemail(scanner.next());
            System.out.println("numero d'etudiant de l'etudiant"+(i+1));
            e1.setnummerEtudiant(scanner.nextInt());
            s1.ajouterEtudient(e1);
            System.out.println("-----------------------------------------");
        }
        System.out.println("enter le nom , l'email et le nombre de l'etudiant que vous voulez le rechercher");
        Etudient e=new Etudient();
        e.setnom(scanner.next());
        e.setemail(scanner.next());
        e.setnummerEtudiant(scanner.nextInt());
        
        if(s1.RechercherEtudiant(e)){
            System.out.println("l'etudiant exist");
        }else{
            System.out.println("l'etudiant n'exist pas");
        }
    }
}