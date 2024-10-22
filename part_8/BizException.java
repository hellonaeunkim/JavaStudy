package part_8;

public class BizException extends RuntimeException {
	
	public BizException(String msg) {
		super(msg);
	}
	
	public BizException(Exception ex) {
        super(ex);
	}

}

/*
 * Custom Exception
 1. The purpose is to inform more specifically about possible exceptions in business logic
 */
