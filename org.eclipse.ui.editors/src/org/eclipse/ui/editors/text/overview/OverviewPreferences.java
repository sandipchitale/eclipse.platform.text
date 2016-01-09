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

import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import org.eclipse.ui.internal.editors.text.EditorsPlugin;

/**
 * The preferences initializer for Overview
 *
 * @author Sandip Chitale
 *
 */
public class OverviewPreferences extends AbstractPreferenceInitializer {

	static final String MIN_OVERVIEW_FONT_SIZE= "MIN_OVERVIEW_FONT_SIZE"; //$NON-NLS-1$

	static final String OVERVIEW_FONT_SIZE= "OVERVIEW_FONT_SIZE"; //$NON-NLS-1$

	static final String MAX_OVERVIEW_FONT_SIZE= "MAX_OVERVIEW_FONT_SIZE"; //$NON-NLS-1$

	private static int defaultMinOverviewFontSize= 1;

	private static int defaultOverviewFontSize= defaultMinOverviewFontSize;

	private static int defaultMaxOverviewFontSize= 13;

	/**
	 * The constructor
	 */
	public OverviewPreferences() {
	}


	@Override
	public void initializeDefaultPreferences() {
		if (Platform.getOS().equals(Platform.OS_MACOSX)) {
			defaultMinOverviewFontSize= 4;
		}
		defaultOverviewFontSize= defaultMinOverviewFontSize;
		IPreferenceStore prefs= EditorsPlugin.getDefault().getPreferenceStore();
		prefs.setDefault(MIN_OVERVIEW_FONT_SIZE, defaultMinOverviewFontSize);
		prefs.setDefault(OVERVIEW_FONT_SIZE, defaultOverviewFontSize);
		prefs.setDefault(MAX_OVERVIEW_FONT_SIZE, defaultMaxOverviewFontSize);
	}

}
