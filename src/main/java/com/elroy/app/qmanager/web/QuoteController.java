package com.elroy.app.qmanager.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.elroy.app.qmanager.domain.Quote;
import com.elroy.app.qmanager.service.QuoteService;

@EnableAutoConfiguration
@Controller
public class QuoteController {

	@Autowired
	@Qualifier("jpaQuoteService")
	private QuoteService quoteService;
	
	@GetMapping("/")
	public String index() {
//		Quote quote = new Quote("Naan ar?", "Ramana Maharishi");
//		quoteService.createQuote(quote);
//		return "Welcome to Quote Manager!";
		return "index";
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
}
