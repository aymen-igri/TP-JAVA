public class Document{
    private String titre;
    private String auteur;
    private int anneePublication;

    public Document(String titre,String auteur,int anneePublication){
        this.titre=titre;this.auteur=auteur;this.anneePublication=anneePublication;
    }

    public String getTitre(){return this.titre;}
    public String getAuteur(){return this.auteur;}
    public int getAnneePublication(){return this.anneePublication;}

    public void setTitre(String titre){this.titre=titre;}
    public void setAuteur(String auteur){this.auteur=auteur;}
    public void setAnneePublication(int anneePublication){this.anneePublication=anneePublication;}

    public void afficher(){
        System.out.println("titre: "+titre);
        System.out.println("auteur: "+auteur);
        System.out.println("annee de publication: "+anneePublication);
        
    }
}