

public class Module{
    private String libellé; 
    private int coefficient;
    private int nbrHeures;

    // a
    public Module(){}
    public Module(String libellé,int coefficient,int nbrHeures){
        this.libellé=libellé;
        this.coefficient=coefficient;
        this.nbrHeures=nbrHeures;
    }

    // b
    public String getlibellé(){return libellé;}
    public int getcoefficient(){return coefficient;}
    public int getnbrHeures(){return nbrHeures;}

    public void setlibellé(String libellé){this.libellé=libellé;}
    public void setcoefficient(int coefficient){this.coefficient=coefficient;}
    public void setnbrHeures(int nbrHeures){this.nbrHeures=nbrHeures;}

    public void afficher() {
        System.out.println("libelle:" + this.libellé);
        System.out.println("coefficient:" + this.coefficient);
        System.out.println("nombre d'heures:" + this.nbrHeures);
     }
}