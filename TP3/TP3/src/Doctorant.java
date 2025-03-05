

public class Doctorant extends Etudient implements Salarié {

    // a
    private String SujetThese;
    private Professeur encadrant;

    // b
    public Doctorant(){}
    
    public String getNom(){return getnom();}
    public int getNummerEtudiant(){return getnummerEtudiant();}
    public String getEmail(){return getEmail();}
    public String getSujetThese(){return this.SujetThese;}
    public Professeur getEncadrant(){return this.encadrant;}

    public void setNom(String nom){setnom(nom);}
    public void setNummerEtudiant(int nummerEtudiant){setNummerEtudiant(nummerEtudiant);}
    public void setEmail(String email){setemail(email);}
    public void setSujetThese(String SujetThese){this.SujetThese=SujetThese;}
    public void setEncadrant(Professeur encadrant){this.encadrant=encadrant;}

    // c
    @Override
    public Float calculeSalaire(int numbred){
        int heuresNorm=Math.min(numbred,32);
        int heuresSup=Math.max(0, numbred-32);
        float normald=((float)(heuresNorm*400))*(float)(1-0.34);
        float supd=((float)(heuresSup*600))*(float)(1-0.17);

        return normald+supd;
    }

    //d
    @Override
    public Float calculeVacances(int Nbrjours){
        return (float)Nbrjours/10;
    }
}

