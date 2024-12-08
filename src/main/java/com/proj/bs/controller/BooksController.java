package com.proj.bs.controller;

import com.proj.bs.dto.BookDto;
import com.proj.bs.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BooksController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/books")
	public String showAll(Model model) {
		model.addAttribute("books",bookService.retrieveAll());
		return "books";
	}
	
	
	@RequestMapping("/admin/books/add")
	public String addBook(BookDto bookDto , Model model) {
		System.out.println("Book dto = "+bookDto);
		if(bookDto.getAuthor() == null) {
			return "add-book";
		}
		bookService.save(bookDto._toConvertBookEntity());
		return "redirect:/books";
	}
	

}
