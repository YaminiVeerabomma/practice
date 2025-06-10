package oops;

public class Copy_con {
	String  name;
	Double price;
	Copy_con(String name,Double price){
		this.name=name;
		this.price=price;
	}

	Copy_con(Copy_con obj2){
		this.name=obj2.name;
		this.price=obj2.price;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Copy_con cc=new Copy_con("hello",55.0);
		System.out.println(cc.name+" "+cc.price);
		Copy_con cc1=new Copy_con(cc);
		System.out.println(cc1.name+" "+cc1.price);
	}

}
//Used to copy the values from one object to another.