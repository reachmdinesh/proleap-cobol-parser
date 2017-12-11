/*
 * Copyright (C) 2017, Ulrich Wolffgang <ulrich.wolffgang@proleap.io>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the MIT license. See the LICENSE file for details.
 */

package io.proleap.cobol.asg.metamodel.valuestmt.arithmetic;

import java.util.List;

import io.proleap.cobol.Cobol85Parser.MultDivContext;
import io.proleap.cobol.Cobol85Parser.PowersContext;
import io.proleap.cobol.asg.metamodel.valuestmt.ValueStmt;

public interface MultDivs extends ValueStmt {

	MultDiv addMultDiv(MultDivContext ctx);

	Powers addPowers(PowersContext ctx);

	List<MultDiv> getMultDivs();

	Powers getPowers();

}
