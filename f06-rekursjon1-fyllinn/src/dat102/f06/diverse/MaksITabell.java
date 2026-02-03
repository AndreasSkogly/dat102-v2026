package dat102.f06.diverse;

import java.util.Arrays;

public class MaksITabell {
	
	public static void main(String[] args) {
		
		int[] tabell = {-4, 5, 12, 0, 3, 7, -2, 3};
		
		System.out.println("Den største verdien i tabellen " + Arrays.toString(tabell) + " er " + maksTab(tabell));
	}

	public static int maksTab (int[] t) {
		return maksTab(t, 0, t.length-1);
	}

	public static int maksTab (int[] t, int start, int slutt) {
		if (start == slutt) {
			return t[start];
		} else {
			int midten = (start + slutt) / 2;
			int maksV = maksTab (t, start, midten);
			int maksH = maksTab (t, midten+1, slutt);

			return Math.max(maksV, maksH);
		}

	}

}
