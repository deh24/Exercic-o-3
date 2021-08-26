package Controller;

public class ThreadC extends Thread{
	private int n;
	private int matematica[][] = new int [3][5];
	
	public ThreadC(int n, int [][]matematica){
		this.n = n;
		this.matematica = matematica;
	}
	public void run(){
		somalina();
		
	}
	private void somalina() {
		// TODO Auto-generated method stub
		int resultado = 0;
		for(int i = 0; i < 5; i++){
			resultado += matematica[n][i];
		}
		System.out.println("A Soma Das LInhas "+(n+1)+": "+resultado);
	}

}