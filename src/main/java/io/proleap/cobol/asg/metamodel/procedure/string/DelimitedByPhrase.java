/*
 * Copyright (C) 2017, Ulrich Wolffgang <ulrich.wolffgang@proleap.io>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the MIT license. See the LICENSE file for details.
 */

package io.proleap.cobol.asg.metamodel.procedure.string;

import io.proleap.cobol.asg.metamodel.CobolDivisionElement;
import io.proleap.cobol.asg.metamodel.valuestmt.ValueStmt;

public interface DelimitedByPhrase extends CobolDivisionElement {

	enum DelimitedByType {
		CHARACTERS, SIZE
	}

	ValueStmt getCharactersValueStmt();

	DelimitedByType getDelimitedByType();

	void setCharactersValueStmt(ValueStmt charactersValueStmt);

	void setType(DelimitedByType delimitedByType);
}
