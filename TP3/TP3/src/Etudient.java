



public class Etudient extends Personne {
    
    private int nummerEtudiant;

    // a
    public Etudient(){}
    public Etudient(String nom, int nummerEtudiant, String email){
        super(nom, email);
        this.nummerEtudiant = nummerEtudiant;
    }

    // b
    public String getnom(){return getNom();}
    public int getnummerEtudiant(){return nummerEtudiant;}
    public String getemail(){return getEmail();}
    public void setnom(String nom){setNom(nom);}
    public void setnummerEtudiant(int nummerEtudiant){this.nummerEtudiant = nummerEtudiant;}
    public void setemail(String email){setEmail(email);}

    // c
    public void afficher(){
        System.out.println("nom:" + getNom());
        System.out.println("nommero d'etudient:" + nummerEtudiant);
        System.out.println("email:" + getEmail());
    }
}