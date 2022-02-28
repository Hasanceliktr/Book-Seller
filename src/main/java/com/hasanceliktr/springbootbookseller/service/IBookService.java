package com.hasanceliktr.springbootbookseller.service;

import java.util.List;

import com.hasanceliktr.springbootbookseller.model.Book;

public interface IBookService
{

	Book saveBook(Book book);

	void deleteBook(Long id);

	List<Book> findAllBooks();

}
