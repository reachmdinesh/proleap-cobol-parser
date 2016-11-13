/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.cobol.parser.metamodel.valuestmt.impl;

import io.proleap.cobol.Cobol85Parser.IntegerLiteralContext;
import io.proleap.cobol.parser.metamodel.CobolDivision;
import io.proleap.cobol.parser.metamodel.IntegerLiteral;
import io.proleap.cobol.parser.metamodel.ProgramUnit;
import io.proleap.cobol.parser.metamodel.valuestmt.IntegerLiteralValueStmt;

public class IntegerLiteralValueStmtImpl extends ValueStmtImpl implements IntegerLiteralValueStmt {

	protected IntegerLiteral integerLiteral;

	public IntegerLiteralValueStmtImpl(final ProgramUnit programUnit, final CobolDivision scope,
			final IntegerLiteralContext ctx) {
		super(programUnit, scope, ctx);
	}

	@Override
	public IntegerLiteral getLiteral() {
		return integerLiteral;
	}

	@Override
	public IntegerLiteral getValue() {
		return integerLiteral;
	}

	@Override
	public void setIntegerLiteral(final IntegerLiteral integerLiteral) {
		this.integerLiteral = integerLiteral;
	}

	@Override
	public String toString() {
		return integerLiteral.toString();
	}
}