package part_8;

public class BizService {
	public void bizMethod(int i) throws BizException{
		System.out.println("Biz Start");
		
		if(i < 0)
			throw new BizException("매개변수 i는 0 이상이여야 합니다.");
		
		System.out.println("Biz End");
	}

}
