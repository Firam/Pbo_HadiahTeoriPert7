import java.util.Scanner;

class hitungvolum1{
	public static void main(String[]args){
		volum V1 = new volum();
		volum1 V2 = new volum1();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan jari-jari: ");
		double jari = input.nextDouble();
		V1.setJari(jari);
		V1.getVolumByJari();
		
		System.out.print("Masukkan diameter: ");
		double diameter = input.nextDouble();
		V2.setDiameter(diameter);
		V2.getVolumByDiameter();
	}
}