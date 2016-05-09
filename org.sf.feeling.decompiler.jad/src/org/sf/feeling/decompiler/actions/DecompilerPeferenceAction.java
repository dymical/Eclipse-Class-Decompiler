/*******************************************************************************
 * Copyright (c) 2016 Chen Chao(cnfree2000@hotmail.com).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Chen Chao  - initial API and implementation
 *******************************************************************************/

package org.sf.feeling.decompiler.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.dialogs.PreferencesUtil;
import org.sf.feeling.decompiler.i18n.Messages;

public class DecompilerPeferenceAction extends Action {
	public DecompilerPeferenceAction() {
		super(
				Messages.getString("JavaDecompilerActionBarContributor.Action.Preferences"));
	}

	public void run() {
		PreferencesUtil
				.createPreferenceDialogOn(
						Display.getDefault().getActiveShell(),
						"net.sf.feeling.decompiler.Main",
						new String[] {
								"net.sf.feeling.decompiler.Main",
								"org.sf.feeling.decompiler.ui.preferences.jad.Formatting",
								"org.sf.feeling.decompiler.ui.preferences.jad.Directives",
								"org.sf.feeling.decompiler.ui.preferences.jad.Misc" },
						null).open();
	}

	public boolean isEnabled() {
		return true;
	}
}