/*
 * Copyright (C) 2017, Ulrich Wolffgang <ulrich.wolffgang@proleap.io>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the MIT license. See the LICENSE file for details.
 */

package io.proleap.cobol.asg.metamodel.procedure.subtract.impl;

import io.proleap.cobol.Cobol85Parser.SubtractMinuendCorrespondingContext;
import io.proleap.cobol.asg.metamodel.ProgramUnit;
import io.proleap.cobol.asg.metamodel.call.Call;
import io.proleap.cobol.asg.metamodel.impl.CobolDivisionElementImpl;
import io.proleap.cobol.asg.metamodel.procedure.subtract.MinuendCorresponding;

public class MinuendCorrespondingImpl extends CobolDivisionElementImpl implements MinuendCorresponding {

	protected final SubtractMinuendCorrespondingContext ctx;

	protected Call minuendCall;

	protected boolean rounded;

	public MinuendCorrespondingImpl(final ProgramUnit programUnit, final SubtractMinuendCorrespondingContext ctx) {
		super(programUnit, ctx);

		this.ctx = ctx;
	}

	@Override
	public Call getMinuendCall() {
		return minuendCall;
	}

	@Override
	public boolean isRounded() {
		return rounded;
	}

	@Override
	public void setMinuendCall(final Call minuendCall) {
		this.minuendCall = minuendCall;
	}

	@Override
	public void setRounded(final boolean rounded) {
		this.rounded = rounded;
	}

}
