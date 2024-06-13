package Food_application;

import java.util.Scanner;

public class food {
	
	int frenchfries=100;
	int burger=120;
	int pastry=100;
	int pizza=200;
	int coldCoffee=100;
	int colddrink=80;
	int icedtea=80;
	int ch;
	int quantity;
	static int total;
	String again;
	
	
	Scanner sc=new Scanner(System.in);
	
	
	public void displayMenu() {
		System.out.println("****************Welcome to Cafe**************");
		System.out.println("==============================================");
		System.out.println("              1.French Fries       100/-      ");
		System.out.println("              2.Burger             120/-      ");
		System.out.println("              3.Pastry             100/-      ");
		System.out.println("              4.Cold Drinks        80/-       ");
		System.out.println("              5.Cold Coffee        100/-      ");
		System.out.println("              6.Pizza              200/-      ");
		System.out.println("              7.Iced Tea           80/-       ");
		System.out.println("              8.Exit                          ");
		System.out.println("==============================================");
		
	}
	
   public void generateBill() {
	   System.out.println();
	   System.out.println("*********** Thank You for ordering *************");
	   System.out.println("***********Your Bill is : "+total+"*************");
	
}
	public void order() {
		while(true) {
		System.out.println("Enter your choice ");
		ch=sc.nextInt();
		switch (ch) {
		case 1: {  //frenchfries
			System.out.println("You have Selected French Fries");
			System.out.println("");
			System.out.println("Enter the quantity");
			quantity=sc.nextInt();
			total=total+quantity*frenchfries;
			break;			
		}
		case 2: {//burger
			System.out.println("You have Selected burger");
			System.out.println("");
			System.out.println("Enter the quantity");
			quantity=sc.nextInt();
			total=total+quantity*burger;
			break;			
		}
		
		case 3: { //pastry
			System.out.println("You have Selected pastry");
			System.out.println("");
			System.out.println("Enter the quantity");
			quantity=sc.nextInt();
			total=total+quantity*pastry;
			break;			
		}
		
		
		case 4: { //pizza
			System.out.println("You have Selected pizza");
			System.out.println("");
			System.out.println("Enter the quantity");
			quantity=sc.nextInt();
			total=total+quantity*pizza;
			break;			
		}
		
		
		case 5: {  //coldCoffee
			System.out.println("You have Selected coldCoffee");
			System.out.println("");
			System.out.println("Enter the quantity");
			quantity=sc.nextInt();
			total=total+quantity*coldCoffee;
			break;			
		}
		
		
		case 6: {  //colddrink
			System.out.println("You have Selected colddrink");
			System.out.println("");
			System.out.println("Enter the quantity");
			quantity=sc.nextInt();
			total=total+quantity*colddrink;
			break;			
		}
		case 7: {  //icedtea
			System.out.println("You have Selected icedtea");
			System.out.println("");
			System.out.println("Enter the quantity");
			quantity=sc.nextInt();
			total=total+quantity*icedtea;
			break;			
		}
		
		case 8: //exit
		{
			System.exit(1);
		}
		
		default:
			break;
		}
		
		System.out.println();
		System.out.print(" Do you wish to order anythink else(Y/N) : ");
		again=sc.next();
		if(again.equalsIgnoreCase("Y")) {
			order();
		}else if (again.equalsIgnoreCase("N")) {
			generateBill();
			System.exit(1);
			
			
		}else {
			System.out.println("Invalid Choice");
		}
	}
	}

}
