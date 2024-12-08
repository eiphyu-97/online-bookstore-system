package com.proj.bs.service.impl;

import java.util.List;

import com.proj.bs.model.Book;
import com.proj.bs.repositories.BookRepository;
import com.proj.bs.service.BookService;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
	
	private final BookRepository bookRepository;

	@Override
	public List<Book> retrieveAll() {
		return bookRepository.findAll();
	}

	@Override
	public Book retrieveById(long id) {
		return bookRepository.findById(id).get();
	}

	@Override
	public void save(Book book) {
		bookRepository.save(book);
	}

	@Override
	public void delete(long id) {
		bookRepository.deleteById(id);
	}

	

}
