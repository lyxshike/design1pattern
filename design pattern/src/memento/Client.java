package memento;

public class Client {
	public static void main(String[] args) {
		Emp emp = new Emp("alvin",38,1000);
		System.out.println(emp);
		
		CareTaker ct = new CareTaker();
		ct.setEmpMemento(emp.memento());
		
		emp.setAge(123);
		emp.setName("alisa");
		emp.setSalary(1234);
		
		System.out.println(emp);
		
		emp.recovery(ct.getEmpMemento());
		
		System.out.print(emp);
	}
}
