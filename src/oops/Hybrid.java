package oops;
class grandfather{
	void ShowG() {
		System.out.println("grandfather");
	}
}
class father extends grandfather{
	void ShowF() {
		System.out.println("father");	
	}
}
class son extends father{
	void showS() {
		System.out.println("son");		
	}
}
class doughter extends father{
	void showD() {
		System.out.println("doughter");		
	}
}

public class Hybrid {

	public static void main(String[] args) {
		// TODO Auto-generated method 
doughter d=new doughter();
d.showD();
d.ShowF();
d.ShowG();
son s=new son();
s.showS();
s.ShowF();
s.ShowG();

	}

}
