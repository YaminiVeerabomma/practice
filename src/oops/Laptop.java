package oops;

public interface Laptop {
	public void copy();
	 
	public void paste();
	 
	public void cut();
	
	public void keyboard();
	//after 7 v use default and static 
	default void security()
	{
		commonCode();
		System.out.println("implement scurity");
	}
	static void audio() {
		commonCode();
		System.out.println(" audio for code ");
	}
	//after 8  v use private  
	// why use private means duplication tym we use private access modifier
	//above default and static is use the code so we provide static along with private
	
	private static  void commonCode() {
		System.out.println("common code");
	}
}
