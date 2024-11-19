package com.proj.bs.controller;

import com.proj.bs.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BooksController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/books")
	public String showAll(Model model) {
		model.addAttribute("books",bookService.retrieveAll());
		return "books";
	}
	
	

}
