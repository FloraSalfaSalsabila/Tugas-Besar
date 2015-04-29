/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diskrit2;

/**
 *
 * @author flora fauna
 */
public class Hitung {
	
	public void Menghitung (long min, long max){
		long a =0;
		long b=1;
		long fibo = 0;
		
		while (fibo <= max)// untuk nilai maksimal
			{
			if(fibo >=min && fibo %2 !=0) // untuk berapa minimal dan yg habis di bagi 2 tidak bisa tampil
				System.out.println(""+fibo); //tampilkan
				fibo= a +b; // rumus
				a	= b;	//rumus
				b = fibo; //rumus
			
			
		}
		
		
		}
	}
//void ganjil(long min, long max){
	//for (long bil = min; bil <= max; bil++){
		//if (bil %2 !=0)
			//System.out.println("sa"+bil);
	//}
//}
/*
	public void fibonaci(long min, long max){
	long a=0;
	long b=1;
	long fibo =0;
			while(fibo <= max){
				if (fibo>= min)
					System.out.println(fibo);
				fibo= a+b;
				a=b;
				b=fibo;
			}
}

*/

    /**
     * @param args the command line arguments
     */
    
    

