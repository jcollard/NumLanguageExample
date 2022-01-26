package lang.parser;

import java.util.List;
import java.util.Scanner;

public abstract class Parser {
	
	private final Scanner scanner;
	
	public Parser(Scanner scanner, List<String> tokens) {
		this.scanner = scanner;
	}
	
	public abstract ParseResult parseNext();
	
}
