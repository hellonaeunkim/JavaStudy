package part_11;

public class BoxGeneric<E> { //BoxGeneric class가 가상 클래스 E를 사용하겠다는 의미.
	
	private E obj; // field
		
	public void setObj(E obj) { // field의 값을 설정하는 method
		this.obj = obj;
	}
	
	public E getObj() { // object의 값을 반환하는 method
		return obj;
	}

}
