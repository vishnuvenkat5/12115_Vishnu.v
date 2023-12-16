import java.util.ArrayList;

public class CArrayListGendrics {

	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(10);
		list.add(12.34);
		list.add("Java");
		list.add(10);
		System.out.println(list);
		System.out.println(list.get(0));//10
		list.remove(1);//Remove 12.34
		
	System.out.println(list);
	System.out.println(list.size()); //3
	
	list.set(2, "Hello");
	System.out.println(list);
		

	}

