/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.cobol.parser.metamodel.environment.inputoutput.iocontrol;

import java.util.List;

import io.proleap.cobol.parser.metamodel.CobolDivisionElement;
import io.proleap.cobol.parser.metamodel.valuestmt.ValueStmt;

public interface SameClause extends CobolDivisionElement {

	enum Form {
		Record, Sort, SortMerge
	}

	void addFileNameValueStmt(ValueStmt fileNameValueStmt);

	List<ValueStmt> getFileNameValueStmts();

	Form getForm();

	void setForm(Form form);
}