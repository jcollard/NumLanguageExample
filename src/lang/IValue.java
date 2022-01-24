package lang;

public abstract class IValue {

	public int asInteger() {
		throw new IllegalStateException("This value is not an integer.");
	}
	
	public abstract String toRaw();
	
}
