package Exercice1;
public class Vin {

	final static int BLANC = 1;
	 final static int ROUGE = 2;
	 final static int ROSE = 3;

    private String nom;
    private int type;
    private String origine;
    private double prix;
 
    
    public static int nbVin = 0;
    public static double totalPrix = 0;
 

    public Vin(String nom, String origine, double prix) {
        this.nom = nom;
        this.origine = origine;
        this.prix = prix;
        ++nbVin;
        totalPrix += prix;
    }
    
    public Vin() {
    }
   
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    public double getprix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
    

	@Override
	public String toString() {
		return  "\t" + nom + " est un vin "+" de "+ this.origine + " et son prix est de : " + String.format("%.2f $",this.prix );
	
	

                
    }
}

