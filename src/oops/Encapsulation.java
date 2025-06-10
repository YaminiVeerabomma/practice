package oops;

 class Person {
 private  String name;
 private  String surname;
 private String address;
 private int age;
 public  String city;
 public  void setName(String name)
 {
 this.name=name;
 }
 public String getName()
 {
	 return name;
 }
 public  void setSurName(String surname)
 {
	 this.surname=name;
 }
 public String getSurName()
 {
	 return surname;
 }
 public void setAddress(String address)
 {
 this.address=address;
 }
 public String getAdress()
 {
	 return address;
 }
 public  void setAge(int age)
 {
 this.age=age;
 }
 public int getAge()
 {
	 return age;
 }

}
public class Encapsulation{
	public static void main(String[] args) {
		Person p1=new Person();
		p1.setName("yamini");
		p1.setSurName("veera");
		p1.setAddress("ndr");
		p1.setAge(24);
		p1.city="hly";
		//p1.name="uu";
		Person p2=new Person();
		p2.setName("sravani");
		p2.setSurName("xxx");
		p2.setAddress("mlg");
		p2.setAge(22);
		System.out.println(p1.getName());
		System.out.println(p2.getName());
		System.out.println(p1.getAge());
		System.out.println(p2.getAge());
		System.out.println(p1.city);
	}
}