


public class Professeur extends Personne implements Salarié{ 
    private int nummerSomme;
    private String grade;

    // a
    public Professeur(){}
    public Professeur(String nom, int nummerSomme, String email, String grade){
        setNom(nom);;
        this.nummerSomme=nummerSomme;
        setEmail(email);;
        this.grade=grade;
    }

    // b
    public String getnom(){return getNom();}
    public int getnummerSomme(){return nummerSomme;}
    public String getemail(){return getEmail();}
    public String getgrade(){return grade;}
    public void setnom(String nom){setNom(nom);}
    public void setnummerSomme(int nummerSomme){this.nummerSomme=nummerSomme;}
    public void setemail(String email){setEmail(email);}
    public void setgrade(String grade){this.grade=grade;}

    // c
    public void afficher(){
        System.out.println("nom:"+getNom());
        System.out.println("nommero :"+nummerSomme);
        System.out.println("email:"+getEmail());
        System.out.println("grade:"+grade);
    }


    // partie 2 q5
    // a
    @Override
    public Float calculeSalaire(int numbred){
        int heuresNorm=Math.min(numbred,32);
        int heuresSup=Math.max(0, numbred-32);
        float normald=((float)(heuresNorm*400))*(float)(1-0.34);
        float supd=((float)(heuresSup*600))*(float)(1-0.17);

        return normald+supd+5000;
    }

    // b
    @Override
    public Float calculeVacances(int Nbrjours){
        return (float)Nbrjours/10;
    }
}
