package lang;

public class IntegerExample {

	public static void main(String[] args) {
		
		IExpression expr = new SubtractionExpression(
				new AdditionExpression(
						new IntegerValue(8), 
						new AdditionExpression(new IntegerValue(3), new IntegerValue(-5))),
				new IntegerValue(9));
		System.out.println(expr.toRaw());
		System.out.println(expr.eval().toRaw());
	}

}
