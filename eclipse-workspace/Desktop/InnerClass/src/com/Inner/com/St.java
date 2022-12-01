package com.Inner.com;
class Test4{
	static {
		System.out.println("Hello");
	}
	static {
		System.out.println("Hey");
	}
}
public class St {
//static {
//	System.out.println("Hello");
//}
public static void main(String[]args) {
	Test4 t2=new Test4();
	System.out.println("Main");
}
//static {
//	System.out.println("Hey");
//}
}
