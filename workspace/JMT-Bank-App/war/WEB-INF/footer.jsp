</div>

<div id="footer">
	Created by Dennis Pallett &amp; Mark Wienk
</div>

</div>
<script type="text/javascript">
$("#withdrawForm").submit(function(event) {
	event.preventDefault();
	
	var amount = $(this).find('input[name="amount"]').val();
	
	if($.isNumeric(amount)) {
		$("#nanerror").empty();
		$.post("/cashdispensing/withdraw", { amount: amount },
			function(data) {
					$("#notification").html($(data).html());	
   			}
		);
	} else {
		$("#nanerror").text("Amount must be a numeric value.");
	}
});

$("#depositForm").submit(function(event) {
	event.preventDefault();
	var amount = $(this).find('input[name="amount"]').val();
	
	if($.isNumeric(amount)) {
		$("#nanerror").empty();
		$.post("/cashdispensing/deposit", { amount: amount },
			function(data) {
					$("#notification").html($(data).html());	
   			}
		);
	} else {
		$("#nanerror").text("Amount must be a numeric value.");
	}
});
$("#checkCashBalance").click(function(event) {
	event.preventDefault();
	
	$.get("/cashdispensing/check-balance",
		function(data) {
				$("#notification").html($(data).html());	
   		}
	);
});
$("#checkHomeBalance").click(function(event) {
	event.preventDefault();
	
	$.get("/homebanking/check-balance",
		function(data) {
				$("#notification").html($(data).html());	
   		}
	);
});

$("#transferForm").submit(function(event) {
	event.preventDefault();
	var amount = $(this).find('input[name="amount"]').val();
	var target = $(this).find('input[name="account"]').val();
	
	if($.isNumeric(amount)) {
		$("#nanerror").empty();
		$.post("/homebanking/transfer", { amount: amount, account: target },
			function(data) {
					$("#notification").html($(data).html());	
	   		}
		);
	} else {
		$("#nanerror").text("Amount must be a numeric value.");
	}
});

</script>
</body>
</html>