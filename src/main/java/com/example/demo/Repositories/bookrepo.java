package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.book;

public interface bookrepo extends JpaRepository<book,Integer>{

}
