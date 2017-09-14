package luchador.sumo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Sumo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {

		Luchador[] luchador = leerArchivoCargaVector();

	}

	private static Luchador[] leerArchivoCargaVector()
			throws FileNotFoundException {

		String myPath = "IN/";

		Scanner sc = new Scanner(new File(myPath + "sumo.in"));
		sc.useLocale(Locale.ENGLISH);

		Luchador[] vec = new Luchador[sc.nextInt()];

		sc.nextLine();

		for (int i = 0; i < vec.length; i++) {

			Luchador lu = new Luchador();
			String[] linea = sc.nextLine().split(" ");

			lu.setPeso(Double.parseDouble(linea[0]));
			lu.setAltura(Double.parseDouble(linea[1]));

			vec[i] = lu;
		}

		sc.close();
		return vec;

	}

}
