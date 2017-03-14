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
package util.repository;

import util.io.NamedInputStream;

/**
 * @author Yann-GaÃƒÂ«l GuÃƒÂ©hÃƒÂ©neuc
 * @since  2004/07/21
 * 
 * It must be possible to seamlessly deal with the
 * files of the meta-model, either from disk or from
 * a jar file (for the Eclipse plug-in). From now on,
 * all meta-model file are first stored into a unique
 * instance of FileRepository, then the other repositories
 * (constituents, patterns, visitors) use this instance
 * to find the files they need.
 */
public interface IFileRepository {
	NamedInputStream[] getFiles() throws FileAccessException;
}
