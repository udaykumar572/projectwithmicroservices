package com.cts.project.ipos.controller;

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

import com.cts.project.ipos.dao.IposRepository;
import com.cts.project.ipos.pojo.Ipos;


@CrossOrigin(origins="http://localhost:4200") 
@RequestMapping("/ipos")

@RestController
public class IposController 
{
	@Autowired
	private IposRepository iposRepository;
	@RequestMapping("/getAllipos")
	public Iterable<Ipos> getAllipos() {
		return iposRepository.findAll();
	}
	@PostMapping("/saveIpos")
	public Ipos saveIpos(@RequestBody Ipos ipos)
	{
		System.out.println(ipos);
		iposRepository.save(ipos);
		return ipos;	
	}
	@PutMapping("/updateIpos/{id}")
	public Ipos updateIpos(@RequestBody Ipos ipos, @PathVariable("id") Integer id)
	{
		ipos.setId(id);
		System.out.println(ipos);
		iposRepository.save(ipos);
		return ipos;	
	}
	@DeleteMapping("/deleteIpos/{id}")

	public Boolean deleteIpos( @PathVariable("id") Integer id) {



		 System.out.println(id);

		 iposRepository.deleteById(id);

		 return true;

		 }



	 @GetMapping("/findOneInAll3/{id}")

	 public Ipos findoneinall(@PathVariable("id") Integer id) {



	 Optional<Ipos> ipos = iposRepository.findById(id);

	 return ipos.get();



	 }
}
