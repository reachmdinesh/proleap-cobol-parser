/*
 * Copyright (C) 2017, Ulrich Wolffgang <ulrich.wolffgang@proleap.io>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the MIT license. See the LICENSE file for details.
 */

package io.proleap.cobol.asg.metamodel.procedure.inspect;

import java.util.List;

import io.proleap.cobol.Cobol85Parser.InspectReplacingAllLeadingsContext;
import io.proleap.cobol.Cobol85Parser.InspectReplacingCharactersContext;
import io.proleap.cobol.asg.metamodel.CobolDivisionElement;

public interface Replacing extends CobolDivisionElement {

	ReplacingAllLeadings addAllLeadings(InspectReplacingAllLeadingsContext ctx);

	ReplacingCharacters addCharacters(InspectReplacingCharactersContext ctx);

	List<ReplacingAllLeadings> getAllLeadings();

	List<ReplacingCharacters> getCharacters();
}
