import java.util.ArrayList;
import java.util.List;

public class M02Fase02 {

	public static void main(String[] args) {
			
		//Canvia la taula per una llista (List<Character>)
		List<Character> meuNom= new ArrayList<Character>();
		meuNom.add('R');
		meuNom.add('o');
		meuNom.add('s');
		meuNom.add('e');
		meuNom.add('r');
	
		//Fase1: Fes un bucle que recorri aquesta taula i mostri per consola cadascuna de les lletres
		//Fase2 Al bucle, si la lletra �s una vocal imprimeix a la consola: �VOCAL�. Sin�, imprimeix: �CONSONTANT�.
		//Si trobes un numero, mostra per pantalla: �Els noms de persones no contenen n�meros!�.*/
		for (Character lletra: meuNom) {
			//Si es lletra
			if (Character.isLetter(lletra)) {
				//Si es vocal
				if (lletra=='a'|lletra=='e'|lletra=='i'|lletra=='o'|lletra=='u') {
					System.out.println("VOCAL("+lletra+"), ");
				//si no es vocal (es consonant)	
				} else {
					System.out.println("CONSONANT("+lletra+"), ");
				}
			//si es n�mero	
			} else if (Character.isDigit(lletra)){
				System.out.println("Els noms de persones no contenen n�meros!");
			//Cap cas anterior	
			} else {
				//Sense indicacions
			}
		}
	}
}
