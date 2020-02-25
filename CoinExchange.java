import java.util.Scanner;
public class CoinExchange {

	public static void main(String[] args) {
		
		//ตัวแปรเหรียญ
	      int coin10 = 0; 
	      int coin5 = 0;
	      int coin1 = 0;
	    //ตัวแปรจำนวนเหรียญ
	      int amount10 = 100; 
	      int amount5 = 100;
	      int amount1 = 100;
	      
	    //ตัวแปรธนบัตร 
	      int bank100; 
	      int bank50;
	      int bank20;
	      
	    //ตัวแปรเลือกเหรียญ
	      int coinselect = 0;
	      
	    //ตัวแปรเงินที่รับเข้าเครื่อง  
	      int money = 0;
 
	    //ตัวแปรรับค่าการยกเลิก
	      int cancel;
	    
	     
	      Scanner CoinType = new Scanner(System.in); // เลือกประเภทเหรียญที่จะแลก
		  System.out.println("Please enter your coin type 10 / 5 / 1."); 
		  coinselect = CoinType.nextInt(); // รับค่าประเภทเหรียญ
		  if (coinselect != 10 && coinselect != 5 && coinselect != 1){
			  System.out.println("//////////Error coin select please run the program again.////////"); 
		  }
		  
	      Scanner scan = new Scanner(System.in); // จำนวนเงินที่จะใช้แลก
	      System.out.println("Please enter your money 100 / 50 / 20."); 
	      money = scan.nextInt(); // รับจำนวนเงิน // ตัวแปรเพื่อเก็บจำนวนเงิน
	      if (money != 100 && money != 50 && money != 20){
			  System.out.println("//////////Error money insert please run the program again.////////"); 
	      }
	      
	      if (coinselect == 10) {
	    	  
	    	  coin10 = money / 10;//คำนวนเหรียญ
	    	  System.out.println("10 = " + coin10 + " coins.");
	    	  amount10 = amount10 - coin10; //คำนวนเหรียญคงเหลือ
	    	  
	    	  Scanner CancelSelect = new Scanner(System.in); // ยกเลิก
	    	  
			  System.out.println("Do you want to cancal? choose yes = 1 // no = 0"); 
			  cancel = scan.nextInt();
			 //กรณีเลือก 1
			  if (cancel == 1){
				  amount10 = 100;
				  System.out.println("Cancel success!! Please run the program again"); 
			  }
			//กรณีเลือก 0
			  if (cancel == 0){
				  System.out.println("Exchange success!! "); 
			  }
			  //จำนวนเหรียญคงเหลือ
			  System.out.println("Coin 10 remaining " + amount10 + " coins");
			  System.out.println("Coin 5 remaining " + amount5 + " coins");
			  System.out.println("Coin 1 remaining " + amount1 + " coins");
	      }
	      
	      if (coinselect == 5) {
	    	  
	    	  coin5 = money / 5;//คำนวนเหรียญ
	    	  System.out.println("จำนวนเหรียญ 5 = " + coin5 + " coins.");
	    	  amount5 = amount5 - coin5; //คำนวนเหรียญคงเหลือ
	    	  
	    	  Scanner CancelSelect = new Scanner(System.in); // ยกเลิก
	    	  
			  System.out.println("Do you want to cancal? choose yes = 1 // no = 0"); 
			  cancel = scan.nextInt();
			//กรณีเลือก 1
			  if (cancel == 1){
				  amount5 = 100;
				  System.out.println("Cancel success!! Please run the program again"); 
			  }
			//กรณีเลือก 0
			  if (cancel == 0){
				  System.out.println("Exchange success!! "); 
				  
			  }
			  //จำนวนเหรียญคงเหลือ
			  System.out.println("Coin 10 remaining " + amount10 + " coins");
			  System.out.println("Coin 5 remaining " + amount5 + " coins");
			  System.out.println("Coin 1 remaining " + amount1 + " coins");
	      }
	      
	      if (coinselect == 1) {
	    	
	    	  coin1 = money / 1;//คำนวนเหรียญ
	    	  System.out.println("1 = " + coin1 + " coins.");
	    	  amount1 = amount1 - coin1; //คำนวนเหรียญคงเหลือ
	    	  
	    	  Scanner CancelSelect = new Scanner(System.in); // ยกเลิก
	    	  
			  System.out.println("Do you want to cancal? choose yes = 1 // no = 0"); 
			  cancel = scan.nextInt();
			//กรณีเลือก 1
			  if (cancel == 1){
				  amount1 = 100;
				  System.out.println("Cancel success!! Please run the program again"); 
			  }
			//กรณีเลือก 0
			  if (cancel == 0){
				  System.out.println("Exchange success!! "); 
			  }
			  //จำนวนเหรียญคงเหลือ
			  
			  System.out.println("Coin 10 remaining " + amount10 + " coins");
			  System.out.println("Coin 5 remaining " + amount5 + " coins");
			  System.out.println("Coin 1 remaining " + amount1 + " coins");
	      }
	      
	      
	     
		  
	   }
	
}
