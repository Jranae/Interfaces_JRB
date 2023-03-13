
public class Application {
	enum Status {NOT_STARTED, IN_PROCESS, COMPLETE}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RationalNumber r1 = new RationalNumber(1,2);
		RationalNumber r2 = new RationalNumber(1,2);
		System.out.println(r1.compareTo(r2));
		System.out.println("-----------------------------------------");



		
		Task t1 = new Task("Task 1");
		Task t2 = new Task("Task 2");
		System.out.println("Task Name:" + t1.getName());
		t1.setPriority(5);
		System.out.println("Task1 Priority:" + t1.getPriority());
		t1.setStatus(t1.s.IN_PROCESS);
		System.out.println("Status: " + t1.getStatus());
		
		System.out.println("Task Name:" + t2.getName());
		t2.setPriority(10);
		System.out.println("Task2 Priority:" + t2.getPriority());
		t2.setStatus(t2.s.NOT_STARTED);
		System.out.println("Status: " + t2.getStatus());
		System.out.println("Comparing t1 to t2: " + t1.compareTo(t2));
		if (t1.compareTo(t2)==0) {
			System.out.println("SAME PRIORITY");;
		}
		if(t1.compareTo(t2)==-1) {
			System.out.println("T1 HAS LESS PRIORITY");;
		}	
		if(t1.compareTo(t2)==1) {
			System.out.println("T2 HAS HIGHER PRIORITY");
		}
		
		System.out.println("------------------------------");
		Process p1 = new Process();
		p1.setProcessID("4657");
		System.out.println("ProcessID:" + p1.getProcessID());
		p1.setPriority(5);
		System.out.println("Process Priority:" + p1.getPriority());
		System.out.println("------------------------------");
		System.out.println("toString:" + t1.toString());
		System.out.println("toString:" + t2.toString());
		System.out.println("toSting:" + p1.toString());
		System.out.println("------------------------------");
		
	}
}
