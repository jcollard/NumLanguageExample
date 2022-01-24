package lang;

public class IntegerExample {

	public static void main(String[] args) {
		
		IExpression expr = new AdditionExpression(new IntegerValue(8), new AdditionExpression(new IntegerValue(3), new IntegerValue(-5)));
		System.out.println(expr.toRaw());
	}

}
