package part_014;

import java.lang.reflect.Method;


public class AnnotationExamClass2 {

	public static void main(String[] args) {
		
		AnnotationExamClass annot = new AnnotationExamClass();
		
		try {
			Method method = annot.getClass().getDeclaredMethod("hello");
			
			if (method.isAnnotationPresent(AnnotationExam.class)) { // 특정 Annotatio이 method에 적용되어 있는지 알아낼 수 있음.
				for (int i = 0; i < 100; i ++) {
					annot.hello();
				}
			}else {
				annot.hello();
				
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		} 

	}

}

/*

* getClass() -> Object Class의 method, 해당 인스턴스를 만들 때 사용한 Class의 정보를 return

* getDeclaredMethod("hello") -> "hello"라는 이름의 method에 대한 정보를 구함.

* Annotation이 적용되어 있다면, "hello"를 100번 출력

*/