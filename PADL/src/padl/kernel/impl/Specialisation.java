/*******************************************************************************
 * Copyright (c) 2001-2014 Yann-GaÃƒÂ«l GuÃƒÂ©hÃƒÂ©neuc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors:
 *     Yann-GaÃƒÂ«l GuÃƒÂ©hÃƒÂ©neuc and others, see in file; API and its implementation
 ******************************************************************************/
package padl.kernel.impl;

import padl.kernel.IElementMarker;
import padl.kernel.IFirstClassEntity;
import padl.kernel.ISpecialisation;

/**
 * @author Yann-GaÃƒÂ«l GuÃƒÂ©hÃƒÂ©neuc
 * @since  2004/08/15
 */
class Specialisation extends Relationship implements IElementMarker,
		ISpecialisation {

	private static final long serialVersionUID = 6079936772391699905L;

	public Specialisation(
		final char[] anID,
		final IFirstClassEntity aTargetEntity) {

		super(anID);
		this.setTargetEntity(aTargetEntity);
	}
}
