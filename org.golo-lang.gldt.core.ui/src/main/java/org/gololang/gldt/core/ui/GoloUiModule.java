/*
 * generated by Xtext
 */
package org.gololang.gldt.core.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.IXtextEditorCallback;
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;
import org.gololang.gldt.core.ui.editor.syntaxcoloring.GoloTokenToAttributeIdMapper;

/**
 * Use this class to register components to be used within the IDE.
 */
public class GoloUiModule extends org.gololang.gldt.core.ui.AbstractGoloUiModule {
	public GoloUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	/**
	 * Suppress the Add Xtext nature dialog
	 */
	public Class<? extends IXtextEditorCallback> bindIXtextEditorCallback() {
		return IXtextEditorCallback.NullImpl.class;
	}

	public Class<? extends AbstractAntlrTokenToAttributeIdMapper> bindTokenToAttributeMapper() {
		return GoloTokenToAttributeIdMapper.class;
	}
}
