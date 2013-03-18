package jmt.bank.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public abstract class SecureContent extends Composite {
	public SecureContent(Widget widget) {
		initWidget(widget);
	}
	
	public abstract String getLoginType ();
	
	public abstract VerticalPanel getLoginPanel (final Widget page, final boolean clear);
}
