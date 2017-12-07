package com.elroy.app.qmanager.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.elroy.app.qmanager.domain.Quote;
import com.elroy.app.qmanager.form.QuoteForm;
import com.elroy.app.qmanager.service.QuoteService;

@Controller
@RequestMapping("/quotes")
public class QuoteController {

	private static final String DOMAIN_NAME = "quote";
	
	@Autowired
	@Qualifier("jpaQuoteService")
	private QuoteService quoteService;
		
	@GetMapping("/")
	public ModelAndView list() {
		ModelAndView mv = new ModelAndView(ControllerUtils.listView(DOMAIN_NAME));
		mv.addObject("quotes", quoteService.getQuotes());
		return mv;
	}
	
	@GetMapping("/new")
	public String newForm(Model model) {
		model.addAttribute("quote", new QuoteForm());
		return ControllerUtils.newView(DOMAIN_NAME);
	}
	
	@PostMapping("/new")
	public String newSubmit(@Valid QuoteForm quoteForm, BindingResult result) {
		
		if(result.hasErrors()) {
			return ControllerUtils.newView(DOMAIN_NAME);
		}
		
		Quote quote = quoteForm.toQuote();
		quoteService.createQuote(quote);
		
		return "redirect:/quotes/";
	}
}
