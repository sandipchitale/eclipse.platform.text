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
package org.eclipse.ui.internal.editors.text;

/**
 * Not yet for public use. API under construction.
 * 
 * @since 3.1
 */
public class ConvertLineDelimitersToMacOS9 extends ConvertLineDelimitersAction {

	public ConvertLineDelimitersToMacOS9(){
		super("\r", TextEditorMessages.getString("ConvertLineDelimitersToMacOS9.label")); //$NON-NLS-1$ //$NON-NLS-2$
	}
}
