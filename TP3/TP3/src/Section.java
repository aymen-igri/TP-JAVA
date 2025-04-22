// q4
import java.util.HashMap;
import java.util.TreeMap;

public class Section {
    private String nbrEtudiants;
    private int numeroSection;
    private Professeur chefSection;
    private HashMap <numeroEtudiants,etudiant> etudiants;



    // a
    public Section(){this.etudiants=new HashMap<>(); }

    // b
    public int getnbrEtudiants(){return nbrEtudiants;}
    public void setnbrEtudiants(String nbrEtudiants){this.nbrEtudiants=nbrEtudiants;}
    public int getnumeroSection(){return numeroSection;}
    public void setnumeroSection(int numeroSection){this.numeroSection=numeroSection;}
    public Professeur getchefSection(){return chefSection;}
    public void setchefSection(Professeur chefSection){this.chefSection=chefSection;}
    public Etudient getEtudiant(String numeroEtudient){return this.etudiants.isEmpty() ? null : etudiants.get(numeroEtudient);}

    // c
    public void ajouterEtudient(Etudient e){
        if (nbrEtudiants<etudients.length){
           etudients[nbrEtudiants]=e;
           nbrEtudiants++; 
        }
        else{
            System.out.println("vous avez depasser le nombre maximal des etudiants");
        }
    }
    public boolean RechercherEtudiant(Etudient e){
        for (int i = 0; i < nbrEtudiants; i++) {
            if (etudients[i].getnummerEtudiant() == e.getnummerEtudiant()) {
                    return true; // Return true if a matching student is found
            }
        }
        return false; // Return false if no matching student is found after the loop
    }
   
    public void afficher(){
        for(int i=0 ; i<nbrEtudiants ; i++){
            System.out.println("etudiant numero"+(i+1));
            etudients[i].afficher();
            System.out.println("__________________________");
        }
    }

    public void afficherParOrder(){

        TreeMap<String, Etudient> sortedMap = new TreeMap<>(etudiants);

        for (String key : sortedMap.keySet()) {
            System.out.println("Numero d'etudiant: " + key);
            sortedMap.get(key).afficher();
            System.out.println("__________________________");
        }
    }
}
