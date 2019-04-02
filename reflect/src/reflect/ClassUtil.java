package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassUtil {
	/*
	 ** ��ӡ�����Ϣ,������ĳ�Ա����,��Ա����
	 */

	public static void printClassMessage(Object obj) {
		//Ҫ��ȡ�����Ϣ,����Ҫ��ȡ���������
		Class c = obj.getClass();//���ݵ����Ǹ��������c���Ǹ������������
		//��ȡ�������
		System.out.println("��"+c.getName());
		//��ȡ��������Ϣ
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
		//��ȡ��Ա��������Ϣ
		Field[] fs = c.getDeclaredFields();
		for (Field field : fs) {
			//�õ���Ա���������͵�������
			Class fieldType = field.getType(); 
			String typeName = fieldType.getName();
			//�õ���Ա����������
			String fieldName = field.getName();
			System.out.println(typeName + " " + fieldName);
		}
	}
	/*
	 * ��ӡ���캯������Ϣ
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
