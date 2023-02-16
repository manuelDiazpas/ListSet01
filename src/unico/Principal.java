package unico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		final Integer MAX_NUM = 20;
		final Integer MAX_AL = 100;
		
		List<Integer> numAl = new ArrayList<Integer>();
		
		for (int i = 0; i<MAX_NUM; i++) {
			numAl.add(generarNumAl(MAX_AL));
		}
		
		System.out.println("Números creados:");
		System.out.println(numAl);
		
		System.out.println();
		System.out.println("Ordenamiento de números en sentido creciente:");
		Collections.sort(numAl);;		
		System.out.println(numAl);
		
		System.out.println();
		System.out.println("Ordenamiento de números en sentido decreciente:");
		Collections.sort(numAl, Collections.reverseOrder());
		System.out.println(numAl);
	}

	private static Integer generarNumAl(Integer max) {
		return (int)(Math.random() * max + 1);
	}

}
