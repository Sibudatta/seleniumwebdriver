package seleniumbasic;
class parent{
	
  String name="SIbu";

	void a() {

		System.out.println("parent class");

	}
}
class child extends parent{
	int number=20;

	void b() {
		System.out.println("child class");
	}
}
public class Typecast {

	public static void main(String[] args) {


		/*parent obj=new child();
		System.out.println(obj.name);//parent we can access
		System.out.println(obj.number);//can not access bcs ref variable is parent
		obj.a();//parent we can access
		obj.b();//can not access bcs ref variable is parent*/
		
		parent p=new parent();
		child childobj=(child)p;
		childobj.a();
		childobj.b();
		//in the run time we will get type casting exception
		
	}}
