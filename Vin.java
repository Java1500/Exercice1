package Exercice1;
public class Vin {

	public static final  int BLANC = 1;
	public static final  int ROUGE = 2;
	public  static final  int ROSE = 3;

    private String nom;
    private int type;
    private String origine;
    private double prix;
 
    
    public static int nbVin = 0;
    public static double totalPrix = 0;
 

    public Vin(String nom,int type, String origine, double prix) {
        this.nom = nom;
        this.type = type;
        this.origine = origine;
        this.prix = prix;
        nbVin++;
        totalPrix += prix;
    }

    public Vin(String nom, String origine, double prix) {
        this.nom = nom;
        this.type = ROUGE;
        this.origine = origine;
        this.prix = prix;
        nbVin++;
        totalPrix += prix;
    }
    
    public Vin() {
    }

    
    public static int getBLANC() {
        return BLANC;
    }

    public static int getROUGE() {
        return ROUGE;
    }

    public static int getROSE() {
        return ROSE;
    }


    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        
            this.type = type;
    }

    public String getOrigine() {
        return this.origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    public double getPrix() {
        return this.prix;
    }

    public void setPrix(double prix) {
        totalPrix -= this.prix;
        totalPrix += prix;
        this.prix = prix;
    }
    
    public String type_vin(int type){

        if (type == BLANC){
            return "blanc";
        }
        else if (type == ROUGE){
            return "rouge";
        }
        else {
            return "rosé";
            
        } 

    }

	@Override
	public String toString() {
		return  "\t" + this.nom + " est un vin " + type_vin(this.type) +" de "+ this.origine + " et son prix est de : " + String.format("%.2f $",this.prix );

                
    }

}


