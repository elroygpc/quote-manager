<%@include file="../header.jsp" %>

<div class="container-fluid">
	<h3>Quotes</h3>
	<div class="table-responsive">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Text</th>
					<th>Author</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${quotes}" var="quote">
    				<tr>
						<td>${quote.text}</td>
						<td>${quote.author}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div><!-- table-responsive -->
	
</div><!-- /.container -->
    
<%@include file="../footer.jsp" %>