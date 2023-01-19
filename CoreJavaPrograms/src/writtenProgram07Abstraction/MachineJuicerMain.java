package writtenProgram07Abstraction;

public class MachineJuicerMain {

	public static void main(String[] args) {
		Juicer01 j=new Juicer01();
		j.crush();
		j.filter();
		j.rotate();
		
		System.out.println("----------------------*************----------------------");
		Machine01 m=new Juicer01();
		m.crush();
		m.rotate();
		

	}

}
