/*******************************************************************************
 * Copyright (c) 2000, 2015 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.ui.editors.text.overview;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.IParameterValues;

/**
 * This returns possible values for Font Size change parameter.
 *
 * @author chitas
 *
 */
public class FontSizeParameterValues implements IParameterValues {
	static final String DECREASE= "decrease"; //$NON-NLS-1$
	static final String INCREASE= "increase"; //$NON-NLS-1$
	
	static Map<String, String> valuesMap = new HashMap<>();
	
	static {
		valuesMap.put(DECREASE, DECREASE);
		valuesMap.put(INCREASE, INCREASE);
	}

	@Override
	public Map getParameterValues() {
		return valuesMap;
	}

}
