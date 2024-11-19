package com.proj.bs.service.impl;

import java.util.List;

import com.proj.bs.model.Book;
import com.proj.bs.repositories.BookRepository;
import com.proj.bs.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookRepository bookRepository;

	@Override
	public List<Book> retrieveAll() {
		return bookRepository.findAll();
	}

}
