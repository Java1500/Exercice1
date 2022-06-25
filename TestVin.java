package Exercice1;
import javax.swing.*;
import javax.swing.JOptionPane;

public class TestVin {

    public static void main(String args[]) {

		
        
        Vin b = new Vin (("MiamMiam"),1,("Espagne"),(8.95));
          
        Vin r = new Vin (("Délicieux"),("France"),(14.50));
              
        Vin s = new Vin (("Mystère"),3,("Californie"),(10.00));

               
		
		JTextArea affichage = new JTextArea();
		 
		 	 
		 affichage.append("Voici les " + Vin.nbVin + " vins\n");
		 affichage.append("Le prix total des vins est de " + Vin.totalPrix + "$.\n");
		 affichage.append(b.toString() + "\n");
		 affichage.append(r.toString() + "\n");
		 affichage.append(s.toString() + "\n");
		
		 
		 
		 affichage.append("\n");

		 b.setPrix(b.getPrix()+2);
		 r.setPrix(23.00);
		 r.setOrigine("Italie");
		 s.setNom("Vino verde");
		 /*s.setType();*/
		 s.setOrigine(b.getOrigine());
		 Vin n = new Vin (("L'érablière"),("Québec"),(15.00));


		 affichage.append("Voici les " + Vin.nbVin + " vins\n");
		 affichage.append("Le prix total des vins est de " + Vin.totalPrix + "$.\n");
		 affichage.append(b.toString() + "\n");
		 affichage.append(r.toString() + "\n");
		 affichage.append(s.toString() + "\n");
		 affichage.append(n.toString() + "\n");	 

			
			JOptionPane.showMessageDialog(null, affichage ,
					"Résultats des vins", JOptionPane.PLAIN_MESSAGE);

					

    }


}