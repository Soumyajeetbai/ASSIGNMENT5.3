
public abstract class Employee {
int empID;
String empname;
int total_leave;
double salary;
Employee(int id,String name,int total,double sal){
	empID=id;
	empname=name;
	total_leave=total;
	salary=sal;
	
}
public abstract void  claculate_balance_leaves();
public abstract boolean avail_leave(int no_of_leaves,char type_of_leave);
public abstract void calculate_salary();
	
	public static void main(String[] args) {
		

	}

}
