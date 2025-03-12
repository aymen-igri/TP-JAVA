public class Utilisateur {
    private String nom;
    private int id;
    

    public Utilisateur(String nom, int id){this.nom=nom;this.id=id;}

    public String getNom(){return nom;}
    public int getId(){return id;}

    public void setNom(String nom){this.nom=nom;}
    public void setId(int id){this.id=id;}

    public void emprunterDocument(Document doc){
        System.out.println(nom +" emprunt ce document:");
        doc.afficher();
    }
} 
