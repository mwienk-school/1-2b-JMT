<p><strong>Current WSDL url: </strong> ${currentWsdlUrl}</p>

<form action="/set-soap-server" method="post">
<p>
	<strong>Set new WSDL url: </strong>
	<input type="text" size="60" name="new-wsdl-url" /> <input type="submit" value="Set new URL" />
</p>

</form>

<% if(request.getAttribute("error") != null && request.getAttribute("error").equals("invalid")) {%> 
	<p style="color: red">The WSDL URL you entered is not a valid SOAP service!</p>
<% } %> 

<p><a href="/">&laquo; Back to application</a></p>