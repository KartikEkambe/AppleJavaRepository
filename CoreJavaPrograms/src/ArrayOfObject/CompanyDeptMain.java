package ArrayOfObject;

import java.util.Arrays;
import java.util.Scanner;

public class CompanyDeptMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

//		Department dept[]=new Department[3];
		
//		dept[0]=new Department(101, "HR", 100);
//		dept[1]=new Department(102, "Dev", 150);
//		dept[2]=new Department(103, "Marketing", 50);
//		
//		Company c=new Company(1000, "TCS", dept);
//		System.out.println(c);
		
		
		Company comp[]=new Company[1];
		
		for(int i=0;i<comp.length;i++) {
			Department dept[]=new Department[3];
			System.out.println("Enter company id,company name");
			int cid=sc.nextInt();
			String cname=sc.next();
			
			for(int j=0;j<dept.length;j++) {
				System.out.println("Enter department id,name, employee number");
				int did=sc.nextInt();
				String dname=sc.next();
				int empNo=sc.nextInt();
//				dept[j]=new Department(did,dname,empNo);
				
				Department d=new Department();
				d.setId(did);
				d.setName(dname);
				d.setEmployeeNo(empNo);
				dept[j]=d;
			}
			Company c=new Company();
			c.setId(cid);
			c.setName(cname);
			c.setDept(dept);
			comp[i]=c;
//			comp[i]=new Company(cid, cname, dept);
		}
		
		
		for(Company c:comp) {
			System.out.println(c.getId()+" "+c.getName()+" "+c.getDept());
		}

	}

}
