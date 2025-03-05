
// q4
public class Section {
    private Etudient[] etudients;
    private int nbrEtudiants;
    private int numeroSection;
    private Professeur chefSection;

    // a
    public Section(){etudients=new Etudient[80];}

    // b
    public int getnbrEtudiants(){return nbrEtudiants;}
    public void setnbrEtudiants(int nbrEtudiants){this.nbrEtudiants=nbrEtudiants;}
    public int getnumeroSection(){return numeroSection;}
    public void setnumeroSection(int numeroSection){this.numeroSection=numeroSection;}
    public Professeur getchefSection(){return chefSection;}
    public void setchefSection(Professeur chefSection){this.chefSection=chefSection;}

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
}
