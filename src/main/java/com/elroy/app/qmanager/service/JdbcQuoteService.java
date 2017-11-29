package com.elroy.app.qmanager.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elroy.app.qmanager.domain.Quote;

@Service
public class JdbcQuoteService implements QuoteService {

	@Autowired
	private DataSource dataSource;
	
	private final String SQL_INSERT = "INSERT INTO quotes(text, author) VALUES(?, ?);";

	
	public void createQuote(Quote quote) {
		try(Connection con = getDataSourceConnection(); PreparedStatement stmt = con.prepareStatement(SQL_INSERT);){
			stmt.setString(1, quote.getText());
			stmt.setString(2, quote.getAuthor());
			
			stmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Quote> getQuotes() {
		// TODO Auto-generated method stub
		return null;
	}

	public Quote getQuote(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateQuote(Quote quote) {
		// TODO Auto-generated method stub

	}

	private Connection getDataSourceConnection() throws SQLException {
		return dataSource.getConnection();
	}
}
