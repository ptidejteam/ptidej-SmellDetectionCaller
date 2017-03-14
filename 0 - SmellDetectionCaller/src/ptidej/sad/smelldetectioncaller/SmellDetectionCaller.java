/*******************************************************************************
 * Copyright (c) 2001-2014 Yann-Gaël Guéhéneuc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors:
 *     Yann-Gaël Guéhéneuc and others, see in file; API and its implementation
 ******************************************************************************/
package ptidej.sad.smelldetectioncaller;

public class SmellDetectionCaller {
	public static void main(final String[] args) {
		SmellDetectionHelper.analyseCodeLevelModelFromJavaClassFiles("../0 - SmellDetectionCaller/bin/",
				"SmellDetectionCaller Itself", "rsc/");
	}
}
