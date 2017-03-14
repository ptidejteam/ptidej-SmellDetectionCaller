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

import padl.kernel.IGhost;

/**
 * @version	0.1
 * @author 	Yann-GaÃƒÂ«l GuÃƒÂ©hÃƒÂ©neuc
 */
// Yann 2013/07/17: Accesses!
// Must be public for subclasses in other projects
public class Ghost extends AbstractInterface implements IGhost {
	private static final long serialVersionUID = 846486124851984956L;
	public Ghost(final char[] anID, final char[] aName) {
		super(anID, aName);
	}
	public String toString() {
		final StringBuffer codeEq = new StringBuffer();
		codeEq.append(super.constituentToString());
		codeEq.append(" ghost ");
		codeEq.append(this.getName());
		codeEq.append(';');
		return codeEq.toString();
	}
}
