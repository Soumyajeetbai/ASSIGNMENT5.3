
public class TemporaryEmp extends Employee {
	TemporaryEmp(int id,String name,int total,double sal){
		super(id,name,total,sal);
	}
	int paid_leave=8,sick_leave=6,casual_leave=4;
	

	public void claculate_balance_leaves() {
		
		int total=total_leave-(paid_leave+sick_leave+casual_leave);
		System.out.println("Balace Leave=="+total);
	}

	public boolean avail_leave(int no_of_leaves, char type_of_leave) {
		
		if(no_of_leaves<total_leave)
			return true;
			else
				
			return false;
	}

	public void calculate_salary() {
		float hra=(float)30.50;
		int rate=1000;
		double totalsalary=hra*rate;
		System.out.println("Salary="+totalsalary);
		
	}


	}


