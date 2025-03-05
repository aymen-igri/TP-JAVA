

public class Personne {
    private String nom;
    private String email;

    // a
    public Personne(){}
    public Personne(String nom, String email){
        this.nom = nom;
        this.email = email;
    }

    // b
    public String getNom(){return nom;}
    public String getEmail(){return email;}
    public void setNom(String nom){this.nom = nom;}
    public void setEmail(String email){this.email = email;}
}