import java.util.Scanner;
public class CoinExchange {

	public static void main(String[] args) {
		
		//���������­
	      int coin10 = 0; 
	      int coin5 = 0;
	      int coin1 = 0;
	    //����èӹǹ����­
	      int amount10 = 100; 
	      int amount5 = 100;
	      int amount1 = 100;
	      
	    //����ø��ѵ� 
	      int bank100; 
	      int bank50;
	      int bank20;
	      
	    //��������͡����­
	      int coinselect = 0;
	      
	    //������Թ����Ѻ�������ͧ  
	      int money = 0;
 
	    //������Ѻ��ҡ��¡��ԡ
	      int cancel;
	    
	     
	      Scanner CoinType = new Scanner(System.in); // ���͡����������­�����š
		  System.out.println("Please enter your coin type 10 / 5 / 1."); 
		  coinselect = CoinType.nextInt(); // �Ѻ��һ���������­
		  if (coinselect != 10 && coinselect != 5 && coinselect != 1){
			  System.out.println("//////////Error coin select please run the program again.////////"); 
		  }
		  
	      Scanner scan = new Scanner(System.in); // �ӹǹ�Թ�������š
	      System.out.println("Please enter your money 100 / 50 / 20."); 
	      money = scan.nextInt(); // �Ѻ�ӹǹ�Թ // ����������纨ӹǹ�Թ
	      if (money != 100 && money != 50 && money != 20){
			  System.out.println("//////////Error money insert please run the program again.////////"); 
	      }
	      
	      if (coinselect == 10) {
	    	  
	    	  coin10 = money / 10;//�ӹǹ����­
	    	  System.out.println("10 = " + coin10 + " coins.");
	    	  amount10 = amount10 - coin10; //�ӹǹ����­�������
	    	  
	    	  Scanner CancelSelect = new Scanner(System.in); // ¡��ԡ
	    	  
			  System.out.println("Do you want to cancal? choose yes = 1 // no = 0"); 
			  cancel = scan.nextInt();
			 //�ó����͡ 1
			  if (cancel == 1){
				  amount10 = 100;
				  System.out.println("Cancel success!! Please run the program again"); 
			  }
			//�ó����͡ 0
			  if (cancel == 0){
				  System.out.println("Exchange success!! "); 
			  }
			  //�ӹǹ����­�������
			  System.out.println("Coin 10 remaining " + amount10 + " coins");
			  System.out.println("Coin 5 remaining " + amount5 + " coins");
			  System.out.println("Coin 1 remaining " + amount1 + " coins");
	      }
	      
	      if (coinselect == 5) {
	    	  
	    	  coin5 = money / 5;//�ӹǹ����­
	    	  System.out.println("�ӹǹ����­ 5 = " + coin5 + " coins.");
	    	  amount5 = amount5 - coin5; //�ӹǹ����­�������
	    	  
	    	  Scanner CancelSelect = new Scanner(System.in); // ¡��ԡ
	    	  
			  System.out.println("Do you want to cancal? choose yes = 1 // no = 0"); 
			  cancel = scan.nextInt();
			//�ó����͡ 1
			  if (cancel == 1){
				  amount5 = 100;
				  System.out.println("Cancel success!! Please run the program again"); 
			  }
			//�ó����͡ 0
			  if (cancel == 0){
				  System.out.println("Exchange success!! "); 
				  
			  }
			  //�ӹǹ����­�������
			  System.out.println("Coin 10 remaining " + amount10 + " coins");
			  System.out.println("Coin 5 remaining " + amount5 + " coins");
			  System.out.println("Coin 1 remaining " + amount1 + " coins");
	      }
	      
	      if (coinselect == 1) {
	    	
	    	  coin1 = money / 1;//�ӹǹ����­
	    	  System.out.println("1 = " + coin1 + " coins.");
	    	  amount1 = amount1 - coin1; //�ӹǹ����­�������
	    	  
	    	  Scanner CancelSelect = new Scanner(System.in); // ¡��ԡ
	    	  
			  System.out.println("Do you want to cancal? choose yes = 1 // no = 0"); 
			  cancel = scan.nextInt();
			//�ó����͡ 1
			  if (cancel == 1){
				  amount1 = 100;
				  System.out.println("Cancel success!! Please run the program again"); 
			  }
			//�ó����͡ 0
			  if (cancel == 0){
				  System.out.println("Exchange success!! "); 
			  }
			  //�ӹǹ����­�������
			  
			  System.out.println("Coin 10 remaining " + amount10 + " coins");
			  System.out.println("Coin 5 remaining " + amount5 + " coins");
			  System.out.println("Coin 1 remaining " + amount1 + " coins");
	      }
	      
	      
	     
		  
	   }
	
}
