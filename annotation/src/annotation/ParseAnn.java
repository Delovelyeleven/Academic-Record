package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ParseAnn {

	public static void main(String[] args) {
		try {
			// 1.使用类加载器加载类
			Class c = Class.forName("annotation.Child");
			// 2.找到类上面的注解
			Boolean isExist = c.isAnnotationPresent(Description.class);
			if (isExist) {
				//3.拿到注解实例
				Description d = (Description) c.getAnnotation(Description.class);
				System.out.println(d.value());
			}
			//4.找到方法上的注解
			Method[] ms = c.getMethods();
			for (Method method : ms) {
				Boolean isMExist =method.isAnnotationPresent(Description.class);
				if (isMExist) {
					Description d = (Description) method.getAnnotation(Description.class);
					System.out.println(d.value());
				}
			}
			//另一种解析方式
			for (Method method : ms) {
				Annotation[] as = method.getAnnotations();
				for (Annotation a : as) {
					if (a instanceof Description) {
						Description description = (Description)a;
						System.out.println(description.value());
					}
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
