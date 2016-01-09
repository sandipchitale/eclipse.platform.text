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

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * This implements the refresh Overview view keybinding.
 *
 * @author Sandip Chitale
 */
public class RefreshOverviewViewHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow activeWorkbenchWindow= HandlerUtil.getActiveWorkbenchWindow(event);
		IWorkbenchPage activePage= activeWorkbenchWindow.getActivePage();
		if (activePage != null) {
			IViewPart view= activePage.findView(OverviewView.ID);
			if (view instanceof OverviewView) {
				OverviewView overviewView= (OverviewView) view;
				overviewView.refreshOverviewView();
			}
		}
		return null;
	}

}
