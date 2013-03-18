package jmt.bank.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class ContentContainer {
	private static ContentContainer content;
	
	protected ContentContainer() {}
	
	public static ContentContainer getInstance() {
		if(content == null) content = new ContentContainer();
		return content;
	}
	
	public void setContent(final Widget page) {
		setContent(page, false);
	}
	
	public void setContent(final Widget page, final boolean clear) {
		if(clear) RootPanel.get("content").clear();
		if(page instanceof SecureContent) {
			final SecureContent securePage = (SecureContent) page;
			JMT_Bank.getBankService().isAuthenticated(securePage.getLoginType(), new AsyncCallback<Void>() {
				@Override
				public void onFailure(Throwable caught) {
					VerticalPanel loginPanel = securePage.getLoginPanel(page, clear);
					RootPanel.get("content").add(loginPanel);				
				}

				@Override
				public void onSuccess(Void result) {
					RootPanel.get("content").add(page);
				}
			});
		} else {
			//No secure page
			RootPanel.get("content").add(page);
		}
	}
	
	/**
	 * Set the subtitle on the page
	 * @param subtitle
	 */
	public void setSubtitle(String subtitle) {
		RootPanel.get("subtitle").clear();
		RootPanel.get("subtitle").add(new Label(subtitle));
	}
	
	

}
