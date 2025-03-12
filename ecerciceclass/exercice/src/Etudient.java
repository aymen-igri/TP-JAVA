public class Etudient extends Utilisateur{
    private String filiere;
    private int limit=0;

    public Etudient(String nom, int id,String filiere){
        super(nom,id);
        this.filiere=filiere;
    }

    public void emprunterDocument(Document doc){
        if (limit <5){
            super.emprunterDocument(doc);
            System.out.println("--------------------------------------------------------------------------");
            limit++;
            }else{
                System.out.println("vous avez depasser la limit des emprunts");
            }
    }
}
