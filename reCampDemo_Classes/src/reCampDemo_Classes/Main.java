package reCampDemo_Classes;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem1 = new DortIslem();
		int sonuc1 = dortIslem1.Topla(3, 8);
		System.out.println(sonuc1);
		
		DortIslem dortIslem2 = new DortIslem();
		int sonuc2 = dortIslem2.Cıkar(3, 8);
		System.out.println(sonuc2);
		
		DortIslem dortIslem3 = new DortIslem();
		int sonuc3 = dortIslem3.Carp(3, 8);
		System.out.println(sonuc3);
		
		DortIslem dortIslem4 = new DortIslem();
		double sonuc4 = dortIslem4.Bol(8, 3);
		System.out.println(sonuc4);

	}

}
