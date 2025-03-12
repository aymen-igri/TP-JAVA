 public class Cercle implements Forme_Geometrique{
    private double rayon;

    public Cercle(double rayon){this.rayon=rayon;}

    public double calculerAire(){return Math.PI*(rayon*rayon);}
    public double calculerPerimetre(){return 2*Math.PI*rayon;}
    public void afficherDetails(){
        System.out.println("la forme geometrique du cercle:");
        System.out.println("l'aire:"+calculerAire());
        System.out.println("perimetre:"+calculerPerimetre()+"\n");
    }
}
