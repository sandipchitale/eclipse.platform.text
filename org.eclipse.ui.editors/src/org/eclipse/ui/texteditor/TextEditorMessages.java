/*******************************************************************************
 * Copyright (c) 2000, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.ui.texteditor;

import java.util.MissingResourceException;
import java.util.ResourceBundle;


/**
 * Helper class to get NLSed messages.
 */
class TextEditorMessages {

	private static final String RESOURCE_BUNDLE= "org.eclipse.ui.texteditor.TextEditorMessages"; //$NON-NLS-1$

	private static ResourceBundle fgResourceBundle= ResourceBundle.getBundle(RESOURCE_BUNDLE);

	private TextEditorMessages() {
	}

	/**
	 * Gets a string from the resource bundle.
	 * 
	 * @param key the string used to get the bundle value, must not be <code>null</code>
	 * @return the string from the resource bundle
	 */
	public static String getString(String key) {
		try {
			return fgResourceBundle.getString(key);
		} catch (MissingResourceException e) {
			return "!" + key + "!";//$NON-NLS-2$ //$NON-NLS-1$
		}
	}
	
	/**
	 * Returns a resource bundle.
	 * 
	 * @return the resource bundle
	 */
	public static ResourceBundle getResourceBundle() {
		return fgResourceBundle;
	}
}
