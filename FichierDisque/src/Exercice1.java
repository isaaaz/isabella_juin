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
		
		ficALire=new FileReader("/Users/isabella/desktop/monFichier.txt");
		entree = new BufferedReader(ficALire);
		c= entree.read(); // Lecture du premier caractère
		
		while(c != -1 ) 
		{
			
			c=entree.read();
			if (){
				
				
			}
		}
	}

}
