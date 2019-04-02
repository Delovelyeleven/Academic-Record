package reflect;

public class ClassDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class c1 = int.class;
		Class c2 = String.class;//String类的类类型  String类的字节码
		Class c3 = double.class;
		Class c4 = Double.class;
		Class c5 = void.class;
		System.out.println(c1.getName());
		System.out.println(c2.getName());
		System.out.println(c2.getSimpleName());
		System.out.println(c5.getName());
		
	}

}
