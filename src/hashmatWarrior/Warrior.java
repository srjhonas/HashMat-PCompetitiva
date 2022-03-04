package hashmatWarrior;

import java.util.ArrayList;
import java.util.Scanner;

public class Warrior {

	public static void main(String[] args) {
		ArrayList<String> iteraciones = new ArrayList<String>();
		Scanner lectura = new Scanner(System.in);
		while (lectura.hasNext()) {
			String registro = lectura.nextLine();
			if (registro.equalsIgnoreCase("End of File")) {
				
				break;
			} else {
				iteraciones.add(registro);
			}

		}

		for (String dato : iteraciones) {			
			String[] parts = dato.split(" ");
			int diferencia = 0;
			int num1 = Integer.parseInt(parts[0]);
			int num2 = Integer.parseInt(parts[1]);
			diferencia = num2 - num1;
			if(diferencia<0) {
				diferencia = diferencia *-1;
			}
			System.out.println(diferencia);
		}
		
		lectura.close();
	}

}
