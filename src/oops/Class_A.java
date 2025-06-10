package oops;

public class Class_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scotty s=new Scotty();
		s.drive(50);
		//anonyomous function
		Cycle b=new Cycle()
			{
			public void drive( int speed) {
				System.out.println("Driving Shift "+speed);
			}
		};
		b.drive(70);
		//lamda expresion with anonyomous function
		Cycle b1= (speed)-> {
			System.out.println("Driving palsure "+speed);
		
	};
	b1.drive(80);
	// we can remove curly brecess{} becoz we write the code in single line
	//arguments ,arrow token,body
		Cycle b2=(int speed)->{
			
			System.out.println(" Driving royalEf");
			System.out.println("Cycle is driving very smothely at speed :" +speed);
			if(speed>100)
				System.out.println("rash driving");
			else{
				System.out.println("slow driving");
			}
		};
		b2.drive(90);
		
		
	}

}
// traditional way of interface implementation
class Scotty implements Cycle{
@Override
	public void drive( int s) {
		System.out.println("Driving Scotty "+ s);
	}
}
// we change varible name but we cant change varible data type

@FunctionalInterface
interface Cycle{
	public void drive(int speed);
}


// if we use zero argument 
//we use speed s parameter arrgument we create
// we can use multipul paramer arrugument 
// we can use return key word 
//if we give in single argument we dont write () symbols
// data type also not mandatary 