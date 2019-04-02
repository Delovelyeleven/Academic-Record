package reflect;

import java.lang.reflect.Method;

public class MethodDemo1 {

	public static void main(String[] args) {
		// 获取print（int,int）方法
		A a1 = new A();
		Class c = a1.getClass();
		try {
			Method msMethods = c.getMethod("print",new Class[] {int.class,int.class});
			//方法没有返回值返回null，有具体返回值返回具体的返回值
			Object object = msMethods.invoke(a1,new Object[]{10,20});
			
			
		} catch (Exception  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
class A{
	public void print(int a,int b) {
		System.out.println(a+b);
	}
	public void print(String a,String b) {
		System.out.println(a.toUpperCase() + "," + b.toUpperCase());
	}
}