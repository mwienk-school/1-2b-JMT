<div id="reply"><% 
if (request.getAttribute("error") != null) {
	Exception e = (Exception) request.getAttribute("error");
	out.println("<div id=\"error\">" + e.getMessage() + "</div>");
}
%>
<% if(request.getAttribute("result") != null) {%> 
	<div id="result">${result}</div> 
<% } %>
</div>