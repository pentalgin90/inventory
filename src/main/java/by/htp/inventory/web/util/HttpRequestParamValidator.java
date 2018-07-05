package by.htp.inventory.web.util;



public class HttpRequestParamValidator {

private HttpRequestParamValidator() {
		
	}

	public static void validateRequestParamNotNull(String ... str) {
		
		for(String s: str) {
			if(s==null) {
				throw new ValidateNullParamException("Empty parametr");
			}
		}
	}
	
}
