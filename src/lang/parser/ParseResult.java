package lang.parser;

public interface ParseResult {
	
	public ParseResult(String token, Parser nextParser) {
		
	}
	
	public String getToken() {
		return null;
	}
	
	public Parser getNextParser() {
		return null;
	}

}
