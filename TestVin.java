package Exercice1;
import javax.swing.*;
import javax.swing.JOptionPane;

public class TestVin {

    public static void main(String args[]) {

                
            	Vin blanc = new Vin (("MiamMiam"),("Espagne"),(8.95));
          
                Vin rouge = new Vin (("Délicieux"),("France"),(14.50));
              
                Vin rose = new Vin (("Mystère"),("Californie"),(10.00));
               
		
		JTextArea affichage = new JTextArea();
		 
		 	 
		 affichage.append("Voici les " + Vin.nbVin + " vins\n");
		 affichage.append("Le prix total des vins est de " + Vin.totalPrix + "$.\n");
		 affichage.append(blanc.toString() + "\n");
		 affichage.append(rouge.toString() + "\n");
		 affichage.append(rose.toString() + "\n");
		 
		 
		 affichage.append("\n");
		 

			
			JOptionPane.showMessageDialog(null, affichage ,
					"Résultats des vins", JOptionPane.PLAIN_MESSAGE);



    }


}