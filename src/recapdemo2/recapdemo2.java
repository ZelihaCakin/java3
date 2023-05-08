package recapdemo2;

import java.util.Iterator;

import javax.swing.event.ListDataEvent;

public class recapdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] myList = { 1.2, 1.3, 4.3, 5.6 };
		double total = 0;
		double max = myList[0];
		int j=0;
		
//		veya 
//		double[] myList=new double[4];
//		myList[0]=1.2;
//		myList[1]=1.3;
//		myList[2]=4.3;
//		myList[3]=5.6;
		
		for (int i = 0; i < myList.length; i++) {
			j= j+1;
			
			System.out.println("My list dizisinin " + j + ". elemanı:" + myList[i] );

		}
		System.out.println("veya;");
		for (double number : myList) {
			if (max < number) {
				max = number;
			}
			total = total + number;
			
			System.out.println(number);

		}
		System.out.println("My List dizisindeki elemanların toplamı ise: " + total);

		System.out.println("Dizideki sayıların en büyüğü: " + max);

	}

}
