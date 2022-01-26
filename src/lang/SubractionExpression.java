package lang;

public class SubractionExpression implements IExpression {

	private final IExpression expr0, expr1;
	
	public SubractionExpression(IExpression expr0, IExpression expr1) {
		this.expr0 = expr0;
		this.expr1 = expr1;
	}

	@Override
	public IValue eval() {
		return new IntegerValue(this.expr0.eval().asInteger() - this.expr1.eval().asInteger());
	}

	@Override
	public String toRaw() {
		return "(" + expr0.toRaw() + " - " + expr1.toRaw() + ")";
	}
}
