/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.cobol.parser.metamodel.procedure.returnstmt.impl;

import io.proleap.cobol.Cobol85Parser.ReturnIntoContext;
import io.proleap.cobol.parser.metamodel.ProgramUnit;
import io.proleap.cobol.parser.metamodel.call.Call;
import io.proleap.cobol.parser.metamodel.impl.CobolDivisionElementImpl;
import io.proleap.cobol.parser.metamodel.procedure.returnstmt.Into;

public class IntoImpl extends CobolDivisionElementImpl implements Into {

	protected final ReturnIntoContext ctx;

	protected Call intoCall;

	public IntoImpl(final ProgramUnit programUnit, final ReturnIntoContext ctx) {
		super(programUnit, ctx);

		this.ctx = ctx;
	}

	@Override
	public Call getIntoCall() {
		return intoCall;
	}

	@Override
	public void setIntoCall(final Call intoCall) {
		this.intoCall = intoCall;
	}

}
