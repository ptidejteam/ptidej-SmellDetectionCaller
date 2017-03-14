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
package util.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

/**
 * @author Yann-GaÃƒÂ«l GuÃƒÂ©hÃƒÂ©neuc
 * @since  2004/04/21
 */
public interface DOMVisitor {
	void close(final Document aDocument);
	void close(final Node aNode);
	void open(final Document aDocument);
	void open(final Node aNode);
}
