
public class M02Fase01 {

	public static void main(String[] args) {
		/*Exercici: L’exercici consisteix en mostrar per consola quantes vegades apareix 
		cada lletra del teu nom i cognoms amb diferents variants (fases).*/
		
		//Crea una taula (char[]) amb el teu nom on cada posició correspongui a una lletra.
		char[] meuNom= {'R', 'o', 's', 'e', 'r'};
	
		//Fes un bucle que recorri aquesta taula i mostri per consola cadascuna de les lletres
		for (char lletra: meuNom) {
			System.out.print("'" + lletra+ "' ");
		}
	}
}
