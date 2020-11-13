import java.util.Scanner;

class hitungvolum{
	public static void main(String[]args){
		volum R = new volum();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan jari-jari: ");
		double jari = input.nextDouble();
		R.setJari(jari);
		R.getVolumByJari();
	}
}