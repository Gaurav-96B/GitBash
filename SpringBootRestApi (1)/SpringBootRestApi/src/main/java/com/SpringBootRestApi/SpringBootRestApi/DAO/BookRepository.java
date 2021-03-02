package com.SpringBootRestApi.SpringBootRestApi.DAO;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.SpringBootRestApi.SpringBootRestApi.Model.Book;

public interface BookRepository extends CrudRepository<Book,Integer>{
	@Modifying 
	@Transactional
	@Query(value ="insert into Users (id,title,author) values (:id, :title,:author)",nativeQuery = true)
	public void saveSpecific(@Param("id") int id,@Param("title") String title,@Param("author") String author);

}
