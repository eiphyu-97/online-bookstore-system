package com.proj.bs.service;

import java.util.List;

import com.proj.bs.model.Book;

public interface BookService {
	
	public List<Book> retrieveAll();
	public Book retrieveById(long id);
	public void save(Book book);
	public void delete(long id);

}
