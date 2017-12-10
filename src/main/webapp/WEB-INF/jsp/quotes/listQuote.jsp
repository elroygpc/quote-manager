<%@include file="../header.jsp" %>

<div class="container-fluid">

	<%@include file="carouselQuote.jsp" %>
	
	<h3>Quotes</h3>
	<div class="table-responsive">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Text</th>
					<th>Author</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${quotes}" var="quote">
    				<tr>
						<td>${quote.text}</td>
						<td>${quote.author}</td>
						<td>
							<!-- Single button -->
							<div class="btn-group">
								<button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
									Action <span class="caret"></span>
								</button>
							  	<ul class="dropdown-menu">
								    <li><a href="#">Edit</a></li>
								    <li><a class="delete-quote" data-quote-id="${quote.id}"  href="<c:url value="/quotes/${quote.id}/delete"/>">Delete</a></li>
							  	</ul>
							</div>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div><!-- table-responsive -->
</div><!-- /.container -->
    
    
<script>
	$(document).ready(function() {
		$(".delete-quote").click(function(event) {
			event.preventDefault();
			
			console.log("Delete clicked");
			var quoteId = $(this).data("quote-id");
			console.log("Quote ID = " + quoteId);
		})
	}); 
</script>   
<%@include file="../footer.jsp" %>