

public class Livre extends Document{
    
    private int nombrePages;

    public Livre(String titre,String auteur,int anneePublication,int nombrePages){
        super(titre, auteur, anneePublication);
        this.nombrePages=nombrePages;
    }

    public void afficherDetails(){
        super.afficher();
        System.out.println("nombre des pages: "+nombrePages);
    }
}
