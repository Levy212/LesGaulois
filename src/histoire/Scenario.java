package histoire;

import personnages.Gaulois;
import personnages.Romain;
public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		Romain minus = new Romain("Minus", 23);
		
		asterix.parler("Bonjour � tous");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		minus.recevoirCoup(asterix.getForce());
		asterix.frapper(minus);
		minus.recevoirCoup(asterix.getForce());
		asterix.frapper(minus);
		minus.recevoirCoup(asterix.getForce());
		
	}

}