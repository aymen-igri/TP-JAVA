//q6

public class Département {
    private String nom;
    private Professeur chefDepartement;
    private Personne[] membres;
    private int nbrMembres;

    // a
    public Département(){
        this.nom = "";
        this.chefDepartement = null;
        this.membres = new Personne[100];
    }
    
    public String getNom(){return this.nom;}
    public Professeur getChefDepartement(){return this.chefDepartement;}

    public void setNom(String nom){this.nom=nom;}
    public void setChefDepartement(Professeur chefDepartement){this.chefDepartement=chefDepartement;}
    
    // b
    public void ajouterMembre(Personne p){
        if (p instanceof Salarié){
            if(nbrMembres<membres.length){
                membres[nbrMembres]=p;
                nbrMembres++;
            }else{
                System.out.println("pas d'espace");
            }
        }else{
            System.out.println("la personne doit etre un doctorant ou un professeur");
        }
    }

    public float calculMasseSalariale(int nbrh){
         float totale=0;
         for (int i=0;i<nbrMembres;i++){
            totale+=((Salarié)membres[i]).calculeSalaire(nbrh);
         }
         return totale;
    }

}
