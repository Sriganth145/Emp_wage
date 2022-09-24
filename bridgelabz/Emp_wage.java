package bridgelabz;

import java.util.Random;

public class Emp_wage {

	public static void main(String[] args) {
		
		Random Input = new Random();
		
		int Ran = Input.nextInt(3);
		
		int Wage_per_hour = 20;
		int Full_hour ;
		
		if(Ran == 2) {
			Full_hour =8;
			System.out.println("Employee is present");
		}
		else {
				Full_hour = 0;
				System.out.println("Employee is absent");
			
		}
			int Emp_wage_perday = Full_hour*Wage_per_hour ;
			System.out.println(Emp_wage_perday);
	}

}
