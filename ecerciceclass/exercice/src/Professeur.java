public class Professeur extends Utilisateur{
    private String departement;

    public Professeur(String nom, int id,String departement){
        super(nom,id);
        this.departement=departement;
    }

    public void emprunterDocument(Document doc){
            super.emprunterDocument(doc);
            System.out.println("--------------------------------------------------------");
    }
}
