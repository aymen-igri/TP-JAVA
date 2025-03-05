public class These extends Document{
    
    private String universite;

    public These(String titre,String auteur,int anneePublication,String universite){
        super(titre, auteur, anneePublication);
        this.universite=universite;
    }

    public void afficherDetails(){
        super.afficher();
        System.out.println("nom de l'université: "+universite);
    }
}
