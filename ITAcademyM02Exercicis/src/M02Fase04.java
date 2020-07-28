import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class M02Fase04 {

	public static void main(String[] args) {
			
		//Fase 1,2,3
		List<Character> meuNom= new ArrayList<Character>();
		meuNom.add('R');
		meuNom.add('o');
		meuNom.add('s');
		meuNom.add('e');
		meuNom.add('r');
	
		//FASE 4
		//Crea una altra llista amb el teu cognom on cada posició correspongui a una lletra.
		List<Character> meuCognom= new ArrayList<Character>();
		meuCognom.add('V');
		meuCognom.add('a');
		meuCognom.add('r');
		meuCognom.add('g');
		meuCognom.add('a');
		meuCognom.add('s');
		
		//Fusiona les dues llistes en una sola. A més, afegeix una posició amb un espai buit entre la primera i la segona. 
		//És a dir, partim de la llista name i surname i al acabar l’execució només tindrem una que es dirà fullName.
		//FullName: [‘N’, ‘A’, ‘M’, ‘E’, ‘ ‘, ‘S’, ‘U’, ‘R‘, ‘N’, ‘A’, ‘M’, ‘E’]
		//creo una llista per recollir el resultat
		List<Character> nomComplet= new ArrayList<Character>();
		
		//per cada lletra a la llista del nom, l'afageixo a la llista del resultat
		for (Character lletresNom: meuNom) {
			nomComplet.add(Character.toUpperCase(lletresNom));
		}

		//afagim un espai buit
		nomComplet.add(' ');
		
		//per cada lletra a la llista del cognom, l'afageixo a la llista del resultat
		for (Character lletresCognom: meuCognom) {
			nomComplet.add(Character.toUpperCase(lletresCognom));
		}		

		
		//Fem la sortida per consola 
		System.out.println("FullName: "+nomComplet);
		
	}
}
