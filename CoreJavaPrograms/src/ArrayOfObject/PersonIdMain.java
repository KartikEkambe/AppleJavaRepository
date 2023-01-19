package ArrayOfObject;

import java.util.Scanner;

import writtenPrograms06Inheritance.IdProof;

public class PersonIdMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person per[] = new Person[2];
		for (int i = 0; i < per.length; i++) {
			IDProof idp[] = new IDProof[2];
			System.out.println("Enter Person id,name,address");
			int pid = sc.nextInt();
			String pname = sc.next();
			String address = sc.next();

			for (int j = 0; j < idp.length; j++) {
				System.out.println("Enter Idproof name,validity");
				String idName = sc.next();
				int validity = sc.nextInt();
				IDProof id = new IDProof();
				id.setName(idName);
				id.setValidity(validity);
				idp[j] = id;
			}

			Person p = new Person();
			p.setId(pid);
			p.setName(pname);
			p.setAddress(address);
			p.setIdProof(idp);

			per[i] = p;

		}

		for (Person p : per) {
			for (IDProof id : p.idProof) {
				if(id.getName().equalsIgnoreCase("Pancard")) {
				System.out.println(p.getId() + " " + p.getName() + " " + p.getAddress() + " " + id.getName() + " "
						+ id.getValidity());
				}
			}
		}

//		for (Person p : per) {
//
//			for (IDProof id : p.idProof) {
//				if (id.getName().equalsIgnoreCase("pan card")) {
//					System.out.println(p.getId() + " " + p.getName() + " " + p.getAddress() + " " + id.getName() + " "
//							+ id.getValidity());
//				}
//			}
//		}

//		IDProof[] idProof1 = new IDProof[2];
//
//		IDProof id1 = new IDProof();
//		id1.setName("Adhaar card");
//		id1.setValidity(2024);
//
//		IDProof id2 = new IDProof();
//		id2.setName("Pan card");
//		id2.setValidity(2030);
//
//		idProof1[0] = id1;
//		idProof1[1] = id2;
//
//		IDProof[] idProof2 = new IDProof[2];
//		IDProof id3 = new IDProof();
//		id3.setName("Voter Id");
//		id3.setValidity(2028);
//
//		IDProof id4 = new IDProof();
//		id4.setName("Pan card");
//		id4.setValidity(2040);
//
//		idProof2[0] = id3;
//		idProof2[1] = id4;
//
//		IDProof[] idProof3 = new IDProof[2];
//
//		IDProof id5 = new IDProof();
//		id5.setName("Driving License");
//		id5.setValidity(2026);
//
//		IDProof id6 = new IDProof();
//		id6.setName("Adhar Card ");
//		id6.setValidity(2026);
//
//		idProof3[0] = id5;
//		idProof3[1] = id6;
//
//		Person[] person = new Person[3];
//		Person p1 = new Person();
//		p1.setId(101);
//		p1.setName("Kartik");
//		p1.setAddress("Pune");
//		p1.setIdProof(idProof1);
//
//		Person p2 = new Person();
//		p2.setId(102);
//		p2.setName("Vaibhav");
//		p2.setAddress("Latur");
//		p2.setIdProof(idProof2);
//
//		Person p3 = new Person();
//		p3.setId(103);
//		p3.setName("Shreyash");
//		p3.setAddress("Nanded");
//		p3.setIdProof(idProof3);
//
//		person[0] = p1;
//		person[1] = p2;
//		person[2] = p3;
//		
//		
//		
//		
//	
//		
//		
//		
//		
//		
//
//		for (Person p : person) {
//
//			for (IDProof id : p.idProof) {
//				if (id.getName().equalsIgnoreCase("pan card")) {
//					System.out.println(p.getId() + " " + p.getName() + " " + p.getAddress() + " " + id.getName() + " "
//							+ id.getValidity());
//				}
//			}
//		}

	}

}
