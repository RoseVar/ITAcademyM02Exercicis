import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class M02Fase03 {

	public static void main(String[] args) {
			
		//Fase 1 y 2
		List<Character> meuNom= new ArrayList<Character>();
		meuNom.add('R');
		meuNom.add('o');
		meuNom.add('s');
		meuNom.add('e');
		meuNom.add('r');
	
		//FASE 3: Emmagatzemar en un Map tant les lletres de la llista com el nombre de vegades que apareixen.
			
		//per saber les lletres que conté el nom: 
		//creem un arraylist per recollir el resultat
		List<Character> lletresComponenNom= new ArrayList<Character>();
		//revisem tota la list del nom
		for (Character lletra: meuNom) {
			//passant la lletra a maiúscula
			lletra= Character.toUpperCase(lletra);
			//si no està a la llista del resultat l'afagim 
			if (!lletresComponenNom.contains(lletra)){				
				lletresComponenNom.add(lletra);
			}
		}
			
		//per crear el map amb les lletres i les seves repeticions
		//creem un Map per recollir el resultat
		Map<Character, Integer> controlLletres = new HashMap<Character, Integer>();
		//per cada lletra de la list amb el resum de les lletres que composen el nom
		for (Character lletraUnica: lletresComponenNom) {
			Integer contador= 0;
			//la comparem amb el nom recollit en una list
			for (Character lletra: meuNom) {
				//passem a maiúscula la lletra a comparar
				lletra= Character.toUpperCase(lletra);
				//Si es la mateixa
				if (lletraUnica.equals(lletra)) {
					//Afagim una al contador
					contador++;
				}
			}
			//Afagim al map la lletra i quants cops surt
			controlLletres.put(lletraUnica, contador);
		}
		//Fem una sortida per consola per confirmar que està ben fet.
		System.out.println(controlLletres);
		
	}
}
