public class Magazine extends Document{
    
    private int numero;

    public Magazine(String titre,String auteur,int anneePublication,int numero){
        super(titre, auteur, anneePublication);
        this.numero=numero;
    }

    public void afficherDetails(){
        super.afficher();
        System.out.println("numero du magazine: "+numero);
    }

}
