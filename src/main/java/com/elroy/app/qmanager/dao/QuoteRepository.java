package com.elroy.app.qmanager.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elroy.app.qmanager.domain.Quote;

public interface QuoteRepository extends JpaRepository<Quote, Long> {
	List<Quote> findByAuthor(String author);
	List<Quote> findByText(String text);
	
}
