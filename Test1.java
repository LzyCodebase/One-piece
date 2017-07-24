	
class A {
	public String show(A obj) { return ("A and A"); }
	public String show(D obj) { return ("A and D"); }
}
class B extends A {
	public String show(B obj) { return ("B and B"); }
	public String show(A obj) { return ("B and A"); }//方法重写
}
class D{}

public class Test1{
	public static void main(String[] args){
		A a = new B();//静态编译，a仍为A类型，调用方法是从A类找
		B b = new B();
		System.out.println(a.show(b/*B类型属于A类型，所以在A类中找到show1并找到其重写方法，最终运行*/));
		System.out.println(new B().show(new B()));

	}
}


