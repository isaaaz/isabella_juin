import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
* Author : isabella
* Date : Jun. 11, 2021 
* Description :
*/

public class Exercice1 {  


	public static void main(String[] args) throws IOException, FileNotFoundException
	{
		FileReader ficALire;
		BufferedReader entree;
		int c;
		int count = 0;
		
		try {
		ficALire=new FileReader("/Users/isabella/desktop/monFichier.txt");
		entree = new BufferedReader(ficALire);
		c= entree.read(); // Lecture du premier caractère

		while(entree.ready()) 
		{
			
			c=(char) entree.read();
			
			
			if (c=='a'){
				count++;
			}
		}
			
			System.out.println("Il y a " + count + "carateres dans le texte");
			entree.close(); 
			
			
		} catch(FileNotFoundException fnf) {
			System.out.println("Le fichier ne peut pas etre lu");
			
		} catch (IOException ioe) {
			System.out.println("Erreur entrée");
			 
		 }
		}
	

}
