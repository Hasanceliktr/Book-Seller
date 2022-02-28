package com.hasanceliktr.springbootbookseller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hasanceliktr.springbootbookseller.model.Book;

public interface IBookRepository extends JpaRepository<Book, Long>
{
}
