package com.elroy.app.qmanager.service;

import java.util.List;

import com.elroy.app.qmanager.domain.Quote;

public interface QuoteService {

	void createQuote(Quote quote);
	List<Quote> getQuotes();
	Quote getQuote(Long id);
	void updateQuote(Quote quote);
	
}
