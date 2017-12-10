<div id="carousel-quote" class="carousel slide" data-ride="carousel">
	
	<!-- Indicators -->
	<ol class="carousel-indicators">
		<li data-target="#carousel-quote" data-slide-to="0" class="active"></li>
	    <li data-target="#carousel-quote" data-slide-to="1"></li>
	    <li data-target="#carousel-quote" data-slide-to="2"></li>
	</ol>

	<!-- Wrapper for slides -->
  	<div class="carousel-inner" role="listbox">
  		<c:forEach items="${quotes}" var="quote" varStatus="loop">
  			<div class="item" id="item-${loop.count}">
	    		<img class="first-slide" src="<c:url value="/resources/images/20161116_181814.jpg"/>"  style ="height:350px; width:100%" alt="First slide">
	      		<div class="carousel-caption">
	        		<h3>${quote.text}</h3>
					<p>${quote.author}</p>
	      		</div>
	    	</div>
  		</c:forEach>
  	</div>	<!-- Wrapper for slides END -->
  	
  	<!-- Controls -->
  	<a class="left carousel-control" href="#carousel-quote" role="button" data-slide="prev">
    	<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    	<span class="sr-only">Previous</span>
  	</a>
  	<a class="right carousel-control" href="#carousel-quote" role="button" data-slide="next">
    	<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    	<span class="sr-only">Next</span>
  	</a>
  	
</div>

<script>
	$(document).ready(function() {
		$("#item-1").addClass("active");
	}); 
</script> 