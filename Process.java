
public class Process implements Priority{
	String processID;
	int priority;

public Process() {
	
}
public String getProcessID() {
	return processID;
}
public void setProcessID(String p) {
	this.processID = p ;
}

public int getPriority() {
	return priority;
}

public void setPriority(int priority) {
	this.priority = priority;
}
@Override
public String toString() {
	return "Process [processID=" + processID + ", priority=" + priority + ", getProcessID()=" + getProcessID()
			+ ", getPriority()=" + getPriority() + "]";
}

}


