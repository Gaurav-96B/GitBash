package com.SpringBootRestApi.SpringBootRestApi.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootRestApi.SpringBootRestApi.DAO.BookRepository;

@Service
public class BookService {
	@Autowired
	BookRepository br;
	public void saveData(int id,String title,String author)
	{
		br.saveSpecific(id, title, author);
	}

}
