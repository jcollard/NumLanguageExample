package lang;

public class IntegerValue extends IValue implements IExpression {
	
	private final int value;
	
	public IntegerValue(int value) {
		this.value = value;
	}

	@Override
	public int asInteger() {
		return this.value;
	}

	public String toRaw() {
		return "" + this.value;
	}

	@Override
	public IValue eval() {
		return this;
	}
	
}
