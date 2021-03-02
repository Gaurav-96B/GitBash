package com.SpringBootRestApi.SpringBootRestApi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootRestApi.SpringBootRestApi.Service.BookService;

@RestController
public class BookController {
	@Autowired
	BookService bs;
	@PostMapping("/insert")
	public String insert(@RequestParam("id") int id,@RequestParam("title") String title,@RequestParam("author") String author)
	{
		bs.saveData(id,title,author);
		return "insert sucessfully";
	}
	

}
