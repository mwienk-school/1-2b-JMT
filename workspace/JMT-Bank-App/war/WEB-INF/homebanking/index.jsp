<%@ include file="/WEB-INF/header.jsp" %>

<p><strong>Home Banking</strong></p>

<p>You are logged in as ${client.userName}. Your account number is ${client.accountId}.</p>

<p>What would you like to do:</p>

<p>&raquo; <a href="/homebanking/transfer">Transfer money</a></p>

<p>&raquo; <a href="/" id="checkHomeBalance">Check account balance</a></p>

<p>&raquo; <a href="/homebanking/logout" onclick="return confirm('Are you sure you want to end your current session?');">End current session</a></p>

<%@ include file="/WEB-INF/footer.jsp" %>

