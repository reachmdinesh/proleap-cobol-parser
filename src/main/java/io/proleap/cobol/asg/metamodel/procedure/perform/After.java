/*
 * Copyright (C) 2017, Ulrich Wolffgang <ulrich.wolffgang@proleap.io>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the MIT license. See the LICENSE file for details.
 */

package io.proleap.cobol.asg.metamodel.procedure.perform;

import io.proleap.cobol.Cobol85Parser.PerformVaryingPhraseContext;
import io.proleap.cobol.asg.metamodel.CobolDivisionElement;

public interface After extends CobolDivisionElement {

	VaryingPhrase addVaryingPhrase(PerformVaryingPhraseContext ctx);

	VaryingPhrase getVaryingPhrase();

}
