package com.proj.bs.dto;

import com.proj.bs.model.Book;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BookDto {

	private Long id;
	private String title;
	private String author;
	private Double price;
	private String category;
	private Integer stock;
	private String description;
	
	public Book _toConvertBookEntity() {
		Book book = new Book();
		book.setId(this.id);
		book.setTitle(this.title);
		book.setAuthor(author);
		book.setPrice(this.price);
		book.setCategory(this.category);
		book.setStock(this.stock);
		book.setDescription(this.description);
		return book;
	}

}
