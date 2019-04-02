package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassUtil {
	/*
	 ** 打印类的信息,包括类的成员函数,成员变量
	 */

	public static void printClassMessage(Object obj) {
		//要获取类的信息,首先要获取类的类类型
		Class c = obj.getClass();//传递的是那个子类对象，c就是该子类的类类型
		//获取类的名称
		System.out.println("类"+c.getName());
		//获取方法的信息
		Method[] ms = c.getMethods();
		for (int i = 0; i < ms.length; i++) {
			Class returnType = ms[i].getReturnType();
			System.out.print(returnType.getName()+" ");
			System.out.println(ms[i].getName());
			Class[] paramTypes = ms[i].getParameterTypes();
			System.out.print("(");
			for(Class class1 : paramTypes) {
				System.out.print(class1.getName() + ",");
			}
			System.out.println(")");
		}
		//获取成员变量的信息
		Field[] fs = c.getDeclaredFields();
		for (Field field : fs) {
			//得到成员变量的类型的类类型
			Class fieldType = field.getType(); 
			String typeName = fieldType.getName();
			//得到成员变量的名称
			String fieldName = field.getName();
			System.out.println(typeName + " " + fieldName);
		}
	}
	/*
	 * 打印构造函数的信息
	 */
	public static void printConMessage(Object obj) {
		Class c = obj.getClass();
		Constructor[] cs = c.getDeclaredConstructors();
		for (Constructor constructor : cs) {
			System.out.print(constructor.getName()+"(");
			Class[] paramTypes = constructor.getParameterTypes();
			for (Constructor constructor2 : cs) {
				System.out.print(constructor2.getName()+",");
			}
			System.out.println(")");
		}
	}
	
}
