package oops;

public class This_4 {
	void m(This_4 obj) {
		System.out.println("hello");
	}
	void n() {
		m(this);
	}

	public static void main(String[] args) {
		This_4  t=new This_4 ();
		t.n();
		
	}

}
