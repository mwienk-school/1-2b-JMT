package jmt.bank.client.cash;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.FocusEvent;
import com.google.gwt.event.dom.client.FocusHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

import jmt.bank.client.ContentContainer;
import jmt.bank.client.IndexPanel;
import jmt.bank.client.JMT_Bank;
import jmt.bank.client.SecureContent;
import jmt.bank.shared.AuthenticationException;

public class SecureContentCash extends SecureContent {

	public SecureContentCash(Widget widget) {
		super(widget);
	}

	public String getLoginType() {
		return "cash";
	}

	public VerticalPanel getLoginPanel(final Widget page, final boolean clear) {
		final Label headerLabel = new Label("Please enter your credentials:");
		Grid grid = new Grid(2, 2);
		grid.addStyleName("form");

		final Button sendButton = new Button("Login");
		final Button cancelButton = new Button("Cancel");
		final TextBox nameField = new TextBox();
		final TextBox passField = new PasswordTextBox();
		final Label errorLabel = new Label();
		
		grid.setWidget(0,  0, new Label("Bank Card ID: "));
		grid.setWidget(0, 1, nameField);
		grid.setWidget(1, 0, new Label("PIN Code: "));
		grid.setWidget(1, 1, passField);

		//Style the button
		sendButton.addStyleName("sendButton");
		
		//Create a panel for the form
		VerticalPanel panel = new VerticalPanel();
		panel.setSpacing(10);

		// Add the elements to the panel
		panel.add(headerLabel);
		panel.add(grid);
		panel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		
		// add buttons
		HorizontalPanel buttonsPanel = new HorizontalPanel();
		buttonsPanel.setSpacing(10);
		buttonsPanel.add(sendButton);
		buttonsPanel.add(cancelButton);
		
		panel.add(buttonsPanel);
		
		panel.add(errorLabel);

		// Focus the cursor on the name field when the app loads
		nameField.setFocus(true);
		nameField.selectAll();

		// Create the popup dialog box
		final DialogBox dialogBox = new DialogBox();
		dialogBox.setText("Login failed");
		dialogBox.setAnimationEnabled(true);
		final Button closeButton = new Button("Close");
		
		// We can set the id of a widget by accessing its Element
		closeButton.getElement().setId("closeButton");
		final HTML serverResponseLabel = new HTML();
		VerticalPanel dialogVPanel = new VerticalPanel();
		dialogVPanel.addStyleName("dialogVPanel");
		dialogVPanel.add(new HTML("<br><b>Server replied:</b>"));
		dialogVPanel.add(serverResponseLabel);
		dialogVPanel.setHorizontalAlignment(VerticalPanel.ALIGN_RIGHT);
		dialogVPanel.add(closeButton);
		dialogBox.setWidget(dialogVPanel);
		
		// Clear username and password box on focus
		nameField.addFocusHandler(new FocusHandler() {
			public void onFocus(FocusEvent event) {
				if(nameField.getText().equals("Bank Card ID")) {
					nameField.setText("");
					passField.setText("");
				}
			}
		});
		
		cancelButton.addClickHandler(new ClickHandler () {
			public void onClick(ClickEvent event) {
				ContentContainer.getInstance().setContent(new IndexPanel(), true);
			}
		});

		// Add a handler to close the DialogBox
		closeButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				dialogBox.hide();
				sendButton.setEnabled(true);
				sendButton.setFocus(true);
			}
		});
		
		// Create a handler for the sendButton and nameField
		class MyHandler implements ClickHandler, KeyUpHandler {
			/**
			 * Fired when the user clicks on the sendButton.
			 */
			public void onClick(ClickEvent event) {
				clientLogin();
			}

			/**
			 * Fired when the user types in the nameField.
			 */
			public void onKeyUp(KeyUpEvent event) {
				if (event.getNativeKeyCode() == KeyCodes.KEY_ENTER) {
					clientLogin();
				}
			}

			/**
			 * Send the name from the nameField to the server and wait for a
			 * response.
			 * 
			 * @throws AuthenticationException
			 */
			private void clientLogin() {
				// First, we validate the input.
				errorLabel.setText("");
				String usernameToServer = nameField.getText();
				String passwordToServer = passField.getText();

				// Then, we send the input to the server.
				sendButton.setEnabled(false);
				serverResponseLabel.setText("");

				JMT_Bank.getBankService().authenticateCard(usernameToServer,
						passwordToServer, new AsyncCallback<Void>() {

							@Override
							public void onFailure(Throwable caught) {
								dialogBox
										.setText("Remote Procedure Call - Failure");
								serverResponseLabel
										.addStyleName("serverResponseLabelError");
								serverResponseLabel.setHTML(caught.getMessage());
								dialogBox.center();
								closeButton.setFocus(true);
							}

							@Override
							public void onSuccess(Void result) {
								ContentContainer.getInstance().setContent(page, clear);
							}
						}
				);
			}
		}
		
		// Add a handler to send the name to the server
		MyHandler handler = new MyHandler();
		sendButton.addClickHandler(handler);
		nameField.addKeyUpHandler(handler);
		panel.setStylePrimaryName("login");
		return panel;
	}

}
