package calcIt;
import java.util.*;
import calcIt.*;

public class CalcuLateIt {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int opt = 0;
		
		while(true) {
			System.out.println("What type of data are you working with?\n" + "1. Integer\n" + "2. Float\n" + "3. Double\n" + "4. Long\n" + "5. Exit\n");
			System.out.println("Choose one of the options");
			opt = sc.nextInt();
			
			switch(opt) {
			case 1:
				System.out.println("What type of arithmetic do you want to do?\n" + "1. Addition\n" + "2. Subtraction\n" + "3. Multiplication\n" + "4. Division\n");
				System.out.println("Choose one of the options");
				int x, y, z;
				int ca = sc.nextInt();
				
				switch(ca) {
				case 1:
					System.out.println("Enter two integers");
					x = sc.nextInt();
					y = sc.nextInt();
					
					z = addition.addInt(x, y);
					System.out.println("Result is : " + z);
					break;
					
				case 2:
					System.out.println("Enter two integers");
					x = sc.nextInt();
					y = sc.nextInt();
					
					z = subtraction.subInt(x, y);
					System.out.println("Result is : " + z);
					break;
					
				case 3:
					System.out.println("Enter two integers");
					x = sc.nextInt();
					y = sc.nextInt();
					
					z = multiplication.multInt(x, y);
					System.out.println("Result is : " + z);
					break;
				
				case 4:
					System.out.println("Enter two integers");
					x = sc.nextInt();
					y = sc.nextInt();
					
					z = division.diviInt(x, y);
					System.out.println("Result is : " + z);
					break;
				}
				break;
				
			case 2:
				System.out.println("What type of arithmetic do you want to do?\n" + "1. Addition\n" + "2. Subtraction\n" + "3. Multiplication\n" + "4. Division\n");
				System.out.println("Choose one of the options");
				float a;
				float b;
				float c;
				int cb = sc.nextInt();
				
				switch(cb) {
				case 1:
					System.out.println("Enter two integers");
					a = sc.nextFloat();
					b = sc.nextFloat();
					
					c = addition.addFloat(a, b);
					System.out.println("Result is : " + c);
					break;
					
				case 2:
					System.out.println("Enter two integers");
					a = sc.nextFloat();
					b = sc.nextFloat();
					
					c = subtraction.subFloat(a, b);
					System.out.println("Result is : " + c);
					break;
					
				case 3:
					System.out.println("Enter two integers");
					a = sc.nextFloat();
					b = sc.nextFloat();
					
					c = multiplication.multFloat(a, b);
					System.out.println("Result is : " + c);
					break;
				
				case 4:
					System.out.println("Enter two integers");
					a = sc.nextFloat();
					b = sc.nextFloat();
					
					c = division.diviFloat(a, b);
					System.out.println("Result is : " + c);
					break;
				}
				break;
				
			case 3:
				System.out.println("What type of arithmetic do you want to do?\n" + "1. Addition\n" + "2. Subtraction\n" + "3. Multiplication\n" + "4. Division\n");
				System.out.println("Choose one of the options");
				double i;
				double j;
				double k;
				int cc = sc.nextInt();
				
				switch(cc) {
				case 1:
					System.out.println("Enter two integers");
					i = sc.nextDouble();
					j = sc.nextDouble();
					
					k = addition.addDoub(i, j);
					System.out.println("Result is : " + k);
					break;
					
				case 2:
					System.out.println("Enter two integers");
					i = sc.nextDouble();
					j = sc.nextDouble();
					
					k = subtraction.subDoub(i, j);
					System.out.println("Result is : " + k);
					break;
					
				case 3:
					System.out.println("Enter two integers");
					i = sc.nextDouble();
					j = sc.nextDouble();
					
					k = multiplication.multDoub(i, j);
					System.out.println("Result is : " + k);
					break;
				
				case 4:
					System.out.println("Enter two integers");
					i = sc.nextDouble();
					j = sc.nextDouble();
					
					k = division.diviDoub(i,j);
					System.out.println("Result is : " + k);
					break;
				}
				break;
				
			case 4:
				System.out.println("What type of arithmetic do you want to do?\n" + "1. Addition\n" + "2. Subtraction\n" + "3. Multiplication\n" + "4. Division\n");
				System.out.println("Choose one of the options");
				long l;
				long m;
				long n;
				int cd = sc.nextInt();
				
				switch(cd) {
				case 1:
					System.out.println("Enter two integers");
					l = sc.nextLong();
					m = sc.nextLong();
					
					n = addition.addlong(l, m);
					System.out.println("Result is : " + n);
					break;
					
				case 2:
					System.out.println("Enter two integers");
					l = sc.nextLong();
					m = sc.nextLong();
					
					n = subtraction.sublong(l, m);
					System.out.println("Result is : " + n);
					break;
					
				case 3:
					System.out.println("Enter two integers");
					l = sc.nextLong();
					m = sc.nextLong();
					
					n = multiplication.multlong(l, m);
					System.out.println("Result is : " + n);
					break;
				
				case 4:
					System.out.println("Enter two integers");
					l = sc.nextLong();
					m = sc.nextLong();
					
					n = division.divilong(l, m);
					System.out.println("Result is : " + n);
					break;
				}
				break;
				
			case 5: 
				System.out.println("Thank you For using the App");
				System.exit(0);
				
			default: 
				System.out.println("Option does not exist \n");
			}
		}
		
	}

}
