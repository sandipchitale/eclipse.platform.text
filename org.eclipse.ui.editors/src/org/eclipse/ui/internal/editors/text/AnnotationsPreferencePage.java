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

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;



/**
 * Annotations preference page.
 * <p>
 * Note: Must be public since it is referenced from plugin.xml
 * </p>
 * 
 * @since 3.0
 */
public class AnnotationsPreferencePage extends AbstractConfigurationBlockPreferencePage {

	/*
	 * @see org.eclipse.ui.internal.editors.text.AbstractConfigureationBlockPreferencePage#getHelpId()
	 */
	protected String getHelpId() {
		return null; // FIXME: Needs help context ID
	}

	/*
	 * @see org.eclipse.ui.internal.editors.text.AbstractConfigurationBlockPreferencePage#setDescription()
	 */
	protected void setDescription() {
		String description= TextEditorMessages.getString("AnnotationsConfigurationBlock.description"); //$NON-NLS-1$
		setDescription(description);
	}
	
	/*
	 * @see org.eclipse.jface.preference.PreferencePage#createDescriptionLabel(org.eclipse.swt.widgets.Composite)
	 */
	protected Label createDescriptionLabel(Composite parent) {
		return null;
	}
	
	/*
	 * @see org.eclipse.ui.internal.editors.text.AbstractConfigurationBlockPreferencePage#setPreferenceStore()
	 */
	protected void setPreferenceStore() {
		setPreferenceStore(EditorsPlugin.getDefault().getPreferenceStore());
	}

	/*
	 * @see org.eclipse.ui.internal.editors.text.AbstractConfigureationBlockPreferencePage#createConfigurationBlock(org.eclipse.ui.internal.editors.text.OverlayPreferenceStore)
	 */
	protected IPreferenceConfigurationBlock createConfigurationBlock(OverlayPreferenceStore overlayPreferenceStore) {
		return new AnnotationsConfigurationBlock(overlayPreferenceStore);
	}
}
