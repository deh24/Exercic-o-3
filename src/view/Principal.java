package view;

import java.util.Random;

import Controller.ThreadC;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matematica[][] = new int [3][5];
		Random random = new Random();
		
		System.out.println("Matrizes ; ");
		for (int i = 0; i <= 0; i++){
			for( int k = 0; k <= 4; k++){
				matematica[i][k] = random.nextInt(10);
				System.out.println(matematica[i][k] +" ");
			}
			System.out.println();
			
		}
		System.out.println("----------\n ");
		for(int n = 0; n <= 2; n++){
			Thread ThreadC = new ThreadC(n, matematica);
			ThreadC.start();
			
			
		}

	}

}
