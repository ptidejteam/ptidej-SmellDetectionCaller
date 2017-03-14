/*******************************************************************************
 * Copyright (c) 2001-2014 Yann-GaÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â«l GuÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â©hÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â©neuc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors:
 *     Yann-GaÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â«l GuÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â©hÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â©neuc and others, see in file; API and its implementation
 ******************************************************************************/
package util.io;

import java.io.IOException;
import java.io.Writer;

/**
 * @author 	Yann-GaÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â«l GuÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â©hÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â©neuc
 */
public class NullWriter extends Writer {
	public void close() throws IOException {
	}
	public void flush() throws IOException {
	}
	public void write(final char[] cbuf, final int off, final int len)
			throws IOException {
	}
}
