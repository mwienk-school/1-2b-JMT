package jmt.bank.client.cash;

import jmt.bank.client.ContentContainer;
import jmt.bank.client.IndexPanel;
import jmt.bank.client.JMT_Bank;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class CashPanel extends VerticalPanel {

	public CashPanel() {
		this.buildUI();
	}
	
	private void buildUI () {
		this.setSpacing(10);
		
		ContentContainer.getInstance().setSubtitle("Cash Dispensing");
		
		this.add(new Label("Which would you like to do?"));
		
		HorizontalPanel appPanel = new HorizontalPanel();
		appPanel.setSpacing(10);
		
		final Button btnWithdraw = new Button("Withdraw cash");
		final Button btnDeposit = new Button("Deposit cash");
		final Button btnCheckBalance = new Button("Check account balance");
		final Button btnLogout = new Button("Logout");
		
		appPanel.add(btnWithdraw);
		appPanel.add(btnDeposit);
		appPanel.add(btnCheckBalance);
		appPanel.add(btnLogout);
		
		this.add(appPanel);
		
		btnLogout.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				doLogout();
			}
		});
	}
	
	private void doLogout () {
		// do logout
		JMT_Bank.getBankService().logout("cash", new AsyncCallback<Void>() {
			@Override
			public void onFailure(Throwable caught) {
				
			}

			@Override
			public void onSuccess(Void result) {
				// todo: show some sort of message?
				
			}
		});
		
		// show index
		ContentContainer.getInstance().setContent(new IndexPanel(), true);
	}

}
