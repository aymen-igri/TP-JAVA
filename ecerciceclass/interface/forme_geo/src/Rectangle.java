public class Rectangle implements Forme_Geometrique{
    private double longeur;
    private double largeur;

    public Rectangle(double longeur,double largeur){this.largeur=largeur;this.longeur=longeur;}

    public double calculerAire(){return largeur*longeur;}
    public double calculerPerimetre(){return (largeur+longeur)*2;}
    public void afficherDetails(){
        System.out.println("la forme geometrique du rectangle:");
        System.out.println("l'aire:"+calculerAire());
        System.out.println("perimetre:"+calculerPerimetre()+"\n");
    }
}
