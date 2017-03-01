
public class TestEmp {

	
	public static void main(String[] args) {
	   Employee ob1=new PermanentEmp(20,"Harry",30,30000);
	   System.out.println("Temporary Employee details");
	   System.out.println("Employee Name==="+ob1.empname);
	   System.out.println("Employee Id==="+ob1.empID);
	   System.out.println("Leaves==="+ob1.total_leave);
	   ob1.claculate_balance_leaves();
	   ob1.avail_leave(20, (char)0);
	   ob1.calculate_salary();
	   System.out.println("..........................................................");
	   Employee ob2=new TemporaryEmp(30,"Kelvin",20,20000);
	   System.out.println("Temporary Employee details");
	   System.out.println("Employee Name==="+ob2.empname);
	   System.out.println("Employee Id==="+ob2.empID);
	   System.out.println("Leaves==="+ob2.total_leave);
	   ob2.claculate_balance_leaves();
	   ob2.avail_leave(20, (char)0);
	   ob2.calculate_salary();
	   
	   
	   
	  
	   
	    
	}

}
