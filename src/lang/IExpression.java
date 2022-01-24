package lang;

public interface IExpression {

	/**
	 * Evaluates this expression
	 * @return
	 */
	public IValue eval();
	
	public String toRaw();
	
}
