package task.qatesting.october.ida;

import java.rmi.server.Operation;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class kalkulatorresult extends kalkulatoperator {
	
	public static void main (String[] args) {
		boolean isvalid = true;
	     //boolean flag;
		//Scanner ini untuk menangkap inputan user 
		Scanner SC = new Scanner (System.in);
		int a = 0,b = 0;
		String op;
		String n = null;
		
		System.out.print("Masukan angka pertama");
		//Menampung nilai a dari inputan user 
		if(isvalid && SC.hasNextInt()) {
			a = SC.nextInt();
			
		}
		else {
			System.out.println("Invalid data");
			isvalid = false;
		}
		//flag = true;
        //if (n instanceof String) {
        	//System.out.println("Invalid data");
        //}
		if(isvalid) {
			System.out.print("Masukan angka kedua");
			//Menampung nilai a dari inputan user 
			if(SC.hasNextInt()) {
				
				b = SC.nextInt();
			}
			else {
				System.out.println("Invalid data");
				isvalid = false;
			}
		}
		
			
		//System.out.print("Invalid only input number");
		//Menampung nilai a dari inputan user 
		//n = SC.next();
		//flag = false;
		
		if(isvalid){
			//ganti baris
			SC.nextLine();
			
			System.out.println("Masukkan operator....+ - * /");
			op = SC.nextLine();
			
			
			if(op.equals(TAMBAH)){
				tambah(a,b);	
			}
			if(op.equals(KURANG)){
				kurang(a,b);	
			}
			if(op.equals(KALI)){
				kali(a,b);	
			}
			if(op.equals(BAGI)){
				bagi(a,b);	
			}
			if(op.equals(BAGI+BAGI)){
				bagi(a,b);	
			}
			
		}
	
	}

	private static void kurang(int a, int b) {
		// TODO Auto-generated method stub
		
	}
	
 }


