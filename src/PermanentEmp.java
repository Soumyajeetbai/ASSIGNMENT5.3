
public class PermanentEmp extends Employee {

	PermanentEmp(int id,String name,int total,double sal){
		super(id,name,total,sal);
	}
	int paid_leave=10,sick_leave=8,casual_leave=6;
	double pfa=2000, hra=5000, basic = 10000;

	void print_leave_details()
	{
	System.out.println("Paid Leave"+paid_leave+"Sick Leave"+sick_leave+"Casual Leave"+casual_leave);
		
	}
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
		double hra=0.5f*basic;
		double pfa=0.12*basic;
		double totalsalary=basic+(hra-pfa);
		System.out.println("Salary="+totalsalary);
		
		
	}
}
	
