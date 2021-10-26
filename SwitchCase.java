import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		game();
	}

public static void game() {
		
		int a=1;
	
		
		while(a==1) {
			
			System.out.println("Press 1 to Add numbers");
			System.out.println("Press 2 to Get average ");
			System.out.println("Press 3 to number is Even or Odd");
			System.out.println("Press 4 to Check number is positive or negative");
			System.out.println("Press 5 to Check Prime");
			System.out.println("Press 6 to Ouit");
			
			Scanner sc= new Scanner(System.in);      
			System.out.print("Enter number "); 
			int num1= sc.nextInt();
			
			switch(num1){  
		   
		    case 1: add();  
		    break;  
		    case 2: average();  
		    break;  
		    case 3: evenOdd();  
		    break;  
		    case 4: check();  
		    break;  
		    case 5: isPrime();  
		    break;  
		    case 6: a++;  
		    break;  
		      
		    default:System.out.println("Please Enter valid number");
		    
			}}  
		}
			
			public static void add() {
				
				Scanner sc= new Scanner(System.in);      
				System.out.println("Enter first Subject Marks- ");
				int num1= sc.nextInt();  
				System.out.println("Enter 2nd number- ");  
				int num2= sc.nextInt();
				System.out.print(num1+num2);
			}
			
			
			public static void average() {
				
				Scanner sc= new Scanner(System.in);      
				System.out.println("Enter first number- ");
				int num1= sc.nextInt();  
				System.out.println("Enter 2nd number- ");  
				int num2= sc.nextInt();
				System.out.println((num1+num2)/2);
			}
			
			
			public static void evenOdd() {
				
				Scanner sc= new Scanner(System.in);      
				System.out.println("Enter Number- ");
				int num1= sc.nextInt();  
				if(num1%2 == 0) {
					System.out.println("Even");
				}
				else
					System.out.println("odd");
				
			}
			
			public static void check() {
				
				Scanner sc= new Scanner(System.in);      
				System.out.println("Enter Number- ");
				int num1= sc.nextInt();  
				if(num1> 0) {
					System.out.println("Positive");
				}
				else
					System.out.println("Negative");
				
			}
		
			public static void isPrime() {
			
			Scanner sc= new Scanner(System.in);      
			System.out.println("Enter Number- ");
			int n= sc.nextInt();  
			int i,m=0,flag=0;          
			  m=n/2;      
			  if(n==0||n==1){  
			   System.out.println(n+" is not prime number");      
			  }else{  
			   for(i=2;i<=m;i++){      
			    if(n%i==0){      
			     System.out.println(n+" is not prime number");      
			     flag=1;      
			     break;      
			    }      
			   }      
			   if(flag==0)  { System.out.println(n+" is prime number"); }  
			  }
			
		}
		
		
		
	
	}
		
	


