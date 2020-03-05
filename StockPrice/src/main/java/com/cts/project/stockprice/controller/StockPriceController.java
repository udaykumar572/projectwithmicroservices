package com.cts.project.stockprice.controller;

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

import com.cts.project.stockprice.dao.StockPriceRepository;
import com.cts.project.stockprice.pojo.StockPrice;
@CrossOrigin(origins="http://localhost:4200") 
@RequestMapping("/stockprice")


@RestController
public class StockPriceController 
{
	@Autowired
	private StockPriceRepository stockpriceRepository;
	@RequestMapping("/getAllstockprices")
	public Iterable<StockPrice> getAllstockprices() {
		return stockpriceRepository.findAll();
	}
	@PostMapping("/saveStockPrice")
	public StockPrice saveStockPrice(@RequestBody StockPrice stockprice)
	{
		System.out.println(stockprice);
		stockpriceRepository.save(stockprice);
		return stockprice;	
	}
	@PutMapping("/updateStockPrice/{companycode}")
	public StockPrice updateStockPrice(@RequestBody StockPrice stockprice, @PathVariable("companycode") String companycode)
	{
		stockprice.setCompanycode(companycode);
		System.out.println(stockprice);
		stockpriceRepository.save(stockprice);
		return stockprice;	
	}

	@DeleteMapping("/deleteStockprice/{companycode}")

	public Boolean deleteStockprice( @PathVariable("companycode") String companycode) {



		 System.out.println(companycode);

		 stockpriceRepository.deleteById(companycode);

		 return true;

		 }


	 @GetMapping("/findOneInAll/{companycode}")

	 public StockPrice findoneinall(@PathVariable("companycode") String companycode) {



	 Optional<StockPrice> stockprice = stockpriceRepository.findById(companycode);

	 return stockprice.get();



	 }
}
