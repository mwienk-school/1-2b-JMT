<%@ include file="/WEB-INF/header.jsp" %>

<h2>Cash dispensing - Login</h2>

<p>Enter your card credentials:</p>

<form method="post" action="/cashdispensing/login">
<table>
	<tr>
		<th>CardNumber:</th>
		<td><input type="text" name="cardnumber" /></td>
	</tr>
	<tr>
		<th>PIN:</th>
		<td><input type="password" name="pin" /></td>
	</tr>
</table>

<p><input type="submit" value="Login" /></p>
</form>

<br /><br />

<p>&laquo; <a href="/">Back to the main screen</a></p>

<%@ include file="/WEB-INF/footer.jsp" %>