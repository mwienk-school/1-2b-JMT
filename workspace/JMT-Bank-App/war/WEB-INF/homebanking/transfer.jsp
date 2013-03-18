<%@ include file="/WEB-INF/header.jsp" %>

<p><strong>Home Banking: transfer money from your account</strong></p>

<p>Use the form below to transfer money from your account to another account:</p>

<form action="/" id="transferForm">
<table>
	<tr>
		<th>Amount (&euro;):</th>
		<td>
			<input type="text" name="amount" class="numeric" size="7" /><span id="nanerror"></span>
			<p class="desc">Enter the amount that should be transferred.</p>
		</td>
	</tr>
	<tr>
		<th>To account number:</th>
		<td>
			<input type="text" name="account" />
			<p class="desc">Enter the account number of the other account to transfer the money to.</p>
		</td>
	</tr>
</table>

<p><input type="submit" value="Execute transfer" /></p>
</form>


<p>&laquo; <a href="/homebanking">Back to home banking menu</a></p>


<%@ include file="/WEB-INF/footer.jsp" %>

