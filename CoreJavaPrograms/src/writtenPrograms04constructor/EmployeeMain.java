package writtenPrograms04constructor;

public class EmployeeMain {

	public static void main(String[] args) {
	
		Employee e=new Employee();
		e.setEmp_id(101);
		e.setName("Vaibhav");
		e.setSal(25000);
		System.out.println(e.getEmp_id()+" "+e.getName()+ " "+e.getSal());
		
		System.out.println("\n--------------*******************---------------\n");
		Employee e2=new Employee(102, "Sumit", 22000);
		
		System.out.println(e2.getEmp_id()+" "+e2.getName()+ " "+e2.getSal());
	}

}
