package lama.postgres.ast;

import lama.postgres.PostgresSchema.PostgresDataType;

public class PostgresPostfixText extends PostgresExpression {
	
	private final PostgresExpression expr;
	private final String text;
	private PostgresConstant expectedValue;
	private PostgresDataType type;

	public PostgresPostfixText(PostgresExpression expr, String text, PostgresConstant expectedValue, PostgresDataType type) {
		this.expr = expr;
		this.text = text;
		this.expectedValue = expectedValue;
		this.type = type;
	}
	
	public PostgresExpression getExpr() {
		return expr;
	}
	
	public String getText() {
		return text;
	}

	@Override
	public PostgresConstant getExpectedValue() {
		return expectedValue;
	}

	@Override
	public PostgresDataType getExpressionType() {
		return type;
	}
}