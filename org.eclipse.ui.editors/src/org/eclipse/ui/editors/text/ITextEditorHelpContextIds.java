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
package org.eclipse.ui.editors.text;

import org.eclipse.ui.ide.IDEActionFactory;
import org.eclipse.ui.texteditor.IAbstractTextEditorHelpContextIds;
import org.eclipse.ui.texteditor.ITextEditorActionConstants;


/**
 * Help context IDs for the text editor.
 * <p>
 * This interface contains constants only; it is not intended to be implemented.</p>
 */
public interface ITextEditorHelpContextIds extends IAbstractTextEditorHelpContextIds {
	
	/**
	 * Id for the text editor preference page.
	 * Value: <code>"org.eclipse.ui.text_editor_preference_page_context"</code>.
	 */
	public static final String TEXT_EDITOR_PREFERENCE_PAGE= PREFIX + "text_editor_preference_page_context"; //$NON-NLS-1$

	/**
	 * Id for the text editor.
	 * Value: <code>"org.eclipse.ui.text_editor_context"</code>.
	 */
	public static final String TEXT_EDITOR= PREFIX + "text_editor_context"; //$NON-NLS-1$
	
	/**
	 * Help context id for the "Add Bookmark" action.
	 * Value: <code>"org.eclipse.ui.bookmark_action_context"</code>
	 * @since 3.0
	 */
	public static final String BOOKMARK_ACTION= PREFIX + IDEActionFactory.BOOKMARK.getId() + ACTION_POSTFIX;

	/**
	 * Help context id for the Add Task action.
	 * Value: <code>"org.eclipse.ui.addTask_action_context"</code>
	 * @since 3.0
	 */
	public static final String ADD_TASK_ACTION= PREFIX + IDEActionFactory.ADD_TASK.getId() + ACTION_POSTFIX;

	/**
	 * Help context id for the "Change Encoding..." action.
	 * Value: <code>"org.eclipse.ui.ChangeEncoding_action_context"</code>
	 * @since 3.1
	 */
	public static final String CHANGE_ENCODING= PREFIX + ITextEditorActionConstants.CHANGE_ENCODING  + ACTION_POSTFIX;;
}
