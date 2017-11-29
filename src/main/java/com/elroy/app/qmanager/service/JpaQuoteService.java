package com.elroy.app.qmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elroy.app.qmanager.dao.QuoteRepository;
import com.elroy.app.qmanager.domain.Quote;

@Service
class JpaQuoteService implements QuoteService {

	@Autowired
	private QuoteRepository repo;
	
	@Override
	public void createQuote(Quote quote) {
		repo.save(quote);
	}

	@Override
	public List<Quote> getQuotes() {
		return repo.findAll();
	}

	@Override
	public Quote getQuote(Long id) {
		return repo.findOne(id);
	}

	@Override
	public void updateQuote(Quote quote) {
		repo.save(quote);

	}

}
