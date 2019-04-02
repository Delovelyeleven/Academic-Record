package reflect;

import java.lang.reflect.Method;

public class MethodDemo1 {

	public static void main(String[] args) {
		// ��ȡprint��int,int������
		A a1 = new A();
		Class c = a1.getClass();
		try {
			Method msMethods = c.getMethod("print",new Class[] {int.class,int.class});
			//����û�з���ֵ����null���о��巵��ֵ���ؾ���ķ���ֵ
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