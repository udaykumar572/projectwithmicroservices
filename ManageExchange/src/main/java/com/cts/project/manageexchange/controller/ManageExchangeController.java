package com.cts.project.manageexchange.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.project.manageexchange.dao.ManageExchangeRepository;
import com.cts.project.manageexchange.pojo.ManageExchange;
@CrossOrigin(origins="http://localhost:4200") 
@RequestMapping("/exchange")


@RestController
public class ManageExchangeController 
{
	@Autowired
	private ManageExchangeRepository manageExchangeRepository;
	@RequestMapping("/getAllexchanges")
	public Iterable<ManageExchange> getAllexchangess() {
		return manageExchangeRepository.findAll();
	}
	@PostMapping("/saveManageExchange")
	public ManageExchange saveManageExchange(@RequestBody ManageExchange exchange)
	{
		System.out.println(exchange);
		manageExchangeRepository.save(exchange);
		return exchange;	
	}
	@PutMapping("/updateManageExchange/{id}")
	public ManageExchange updateManageExchange(@RequestBody ManageExchange exchange, @PathVariable("id") int id)
	{
		exchange.setId(id);
		System.out.println(exchange);
		manageExchangeRepository.save(exchange);
		return exchange;	
	}
	@DeleteMapping("/deleteManageExchange/{id}")

	public Boolean deleteManageExchange( @PathVariable("id") int id) {



		 System.out.println(id);

		 manageExchangeRepository.deleteById(id);

		 return true;

		 }


	 @GetMapping("/findOneInAll4/{id}")

	 public ManageExchange findoneinall(@PathVariable("id") int id) {



	 Optional<ManageExchange> exchange = manageExchangeRepository.findById(id);

	 return exchange.get();



	 }
}
