package com.example.day5.repository;




import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day5.model.Book;



public interface BookRepo extends JpaRepository<Book, Integer>{

}

