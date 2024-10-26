package part_9;

public class Student {
	String name;
	String number;
	int birthYear;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Ann";
		s1.number = "1004";
		s1.birthYear = 1998;
		
		Student s2 = new Student();
		s2.name = "Ann";
		s2.number = "1004";
		s2.birthYear = 1998;
		
		if(s1.equals(s2))
			System.out.println("s1 == s2");
		else
			System.out.println("s1 != s2");
			
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}


/* Object Class

1. Object class acts as a root of the inheritance hierarchy in any Java Program. (모든 클래스의 최상위)
2. Every class in Java is directly or indirectly derived from the Object class.
3. Object class methods are available to all Java classes.
4. Object 클래스의 메서드 중 일부는 override 해서 사용할 수 있다.

 */