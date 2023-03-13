
public class Task implements Priority {
	enum Status {NOT_STARTED, IN_PROCESS, COMPLETE}
	String name;
	int priority;
	Status s;

public Task(String name) {
	this.name = name;
}
public String getName() {
	return name;
}
public int getPriority() {
	return priority;
}
public void setPriority(int priority) {
	this.priority = priority;
}
public Status getStatus() {
	return s;
	
}
public void setStatus(Status s) {
	this.s = s;
}
public int compareTo(Task t) {
	if (this.priority<t.priority) {
		return -1;
	}
	if(this.priority>t.priority) {
		return 1;
	}	
		return 0;
	}

public String toString() {
	return "Task [name=" + name + ", priority=" + priority + ", s=" + s + ", getName()=" + getName()
			+ ", getPriority()=" + getPriority() + ", getStatus()=" + getStatus() + "]";
}

}


