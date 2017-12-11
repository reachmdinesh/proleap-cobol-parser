/*
 * Copyright (C) 2017, Ulrich Wolffgang <ulrich.wolffgang@proleap.io>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the MIT license. See the LICENSE file for details.
 */

package io.proleap.cobol.asg.metamodel.valuestmt.relation;

import io.proleap.cobol.Cobol85Parser.RelationalOperatorContext;
import io.proleap.cobol.asg.metamodel.valuestmt.ValueStmt;

public interface ComparisonStmt extends ValueStmt {

	RelationalOperator addOperator(final RelationalOperatorContext ctx);

	RelationalOperator getOperator();
}
