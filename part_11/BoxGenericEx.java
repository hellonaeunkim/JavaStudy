package part_11;

public class BoxGenericEx {

	public static void main(String[] args) {
		
		BoxGeneric<Object> box = new BoxGeneric<>();
		box.setObj(new Object());
		Object obj = box.getObj();
		
		BoxGeneric<String> box2 = new BoxGeneric<>();
		box2.setObj(3); // error
		box2.setObj("Hello");
		String str = box2.getObj();
		
		BoxGeneric<Integer> box3 = new BoxGeneric<>();
		box3.setObj(4);;
		int v2 = box3.getObj();

	}

}
