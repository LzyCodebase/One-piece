	
class A {
	public String show(A obj) { return ("A and A"); }
	public String show(D obj) { return ("A and D"); }
}
class B extends A {
	public String show(B obj) { return ("B and B"); }
	public String show(A obj) { return ("B and A"); }//������д
}
class D{}

public class Test1{
	public static void main(String[] args){
		A a = new B();//��̬���룬a��ΪA���ͣ����÷����Ǵ�A����
		B b = new B();
		System.out.println(a.show(b/*B��������A���ͣ�������A�����ҵ�show1���ҵ�����д��������������*/));
		System.out.println(new B().show(new B()));

	}
}


