package jmt.bank.client;

import jmt.bank.client.cash.CashPanel;
import jmt.bank.client.cash.SecureContentCash;
import jmt.bank.client.homebanking.HomeBankingPanel;
import jmt.bank.client.homebanking.SecureContentHomeBanking;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class IndexPanel extends VerticalPanel {

	public IndexPanel() {
		ContentContainer.getInstance().setSubtitle("Welcome to SOABank!");

		this.add(new Label("Which application would you like to use?"));
		
		HorizontalPanel appPanel = new HorizontalPanel();
		
		final Button btnDispensing = new Button("Cash Dispensing");
		final Button btnHome = new Button("Home Banking");
		
		appPanel.add(btnDispensing);
		appPanel.add(btnHome);
		appPanel.setSpacing(10);
		
		this.add(appPanel);
		
		this.setSpacing(10);
		
		btnDispensing.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				loadCash();
			}
		});
		
		btnHome.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				loadHomeBanking();
			}
		});
	}
	
	public void loadHomeBanking () {
		ContentContainer.getInstance().setContent(new SecureContentHomeBanking(new HomeBankingPanel()), true);
	}
	
	public void loadCash () {
		ContentContainer.getInstance().setContent(new SecureContentCash(new CashPanel()), true);
	}

}
