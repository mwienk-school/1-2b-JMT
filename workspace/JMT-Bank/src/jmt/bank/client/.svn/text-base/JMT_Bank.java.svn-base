package jmt.bank.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class JMT_Bank implements EntryPoint {
	/**
	 * Create a remote service proxy to talk to the server-side Greeting
	 * service.
	 */
	private static final BankServiceAsync bankService = GWT.create(BankService.class);

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		ContentContainer.getInstance().setContent(new IndexPanel(), true);
	}
	
	/**
	 * returns the bankService asynchronous server
	 * @return
	 */
	public static BankServiceAsync getBankService() {
		return bankService;
	}
}
