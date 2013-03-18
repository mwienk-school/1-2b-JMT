<%@ include file="/WEB-INF/header.jsp" %>

<p><strong>Cash dispensing - home</strong></p>

<p>You are logged in as ${client.userName}. Your account number is ${client.accountId}.</p>

<p>What would you like to do:</p>

<p>&raquo; <a href="/cashdispensing/withdraw">Withdraw money</a></p>

<p>&raquo; <a href="/cashdispensing/deposit">Deposit money</a></p>

<p>&raquo; <a href="/" id="checkCashBalance">Check account balance</a></p>

<p>&raquo; <a href="/cashdispensing/logout" onclick="return confirm('Are you sure you want to end your current session?');">End current session</a></p>

<%@ include file="/WEB-INF/footer.jsp" %>

