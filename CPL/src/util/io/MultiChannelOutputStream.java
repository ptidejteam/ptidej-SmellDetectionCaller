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
import java.io.OutputStream;
import java.io.PrintWriter;

/**
 * @author Yann-GaÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â«l GuÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â©hÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â©neuc
 * @since  2007/08/19
 */
public class MultiChannelOutputStream extends OutputStream {
	private final OutputStream firstStream;
	private final OutputStream secondStream;

	public MultiChannelOutputStream(
		final OutputStream theFirstOutputStream,
		final OutputStream theSecondOutputStream) {

		this.firstStream = theFirstOutputStream;
		this.secondStream = theSecondOutputStream;
	}
	public MultiChannelOutputStream(
		final PrintWriter theFirstOutputStream,
		final OutputStream theSecondOutputStream) {

		this.firstStream = new WriterOutputStream(theFirstOutputStream);
		this.secondStream = theSecondOutputStream;
	}
	public void write(final int b) throws IOException {
		this.firstStream.write(b);
		this.secondStream.write(b);
	}
}
