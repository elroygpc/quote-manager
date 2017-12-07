<%@include file="../header.jsp" %>

<div class="container-fluid">
<h3>New Quote</h3>
<form:form method="POST" modelAttribute="quote">
	<div class="form-group">
		<form:label path="text">Text</form:label>
		<form:input type="text" class="form-control" path="text" placeholder="Quote text"/>
	</div> 
	<div class="form-group">
		<form:label path="author">Author</form:label>
		<form:input type="text" class="form-control" path="author" placeholder="Quote author"/>
	</div> 
	<button type="submit" class="btn btn-default">Submit</button>
</form:form>
</div>

<%@include file="../footer.jsp" %>