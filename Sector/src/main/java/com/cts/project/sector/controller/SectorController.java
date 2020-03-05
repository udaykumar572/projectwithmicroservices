package com.cts.project.sector.controller;


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

import com.cts.project.sector.dao.SectorRepository;
import com.cts.project.sector.pojo.Sector;

@CrossOrigin(origins = "http://localhost:4200")

@RestController



@RequestMapping("/CompanySectors")



public class SectorController {



 @Autowired



 private SectorRepository sectorRepository;



 @GetMapping("/getAllSectors")



 public Iterable<Sector> getAllSectors() {



 return sectorRepository.findAll();



 }



 @PostMapping("/saveSector")



 public Sector saveSector(@RequestBody Sector sector) {



 System.out.println(sector);



 sectorRepository.save(sector);



 return sector;



 }



 @PutMapping("/updateSector/{sectorid}")



 public Sector updateSector(@RequestBody Sector sector, @PathVariable("sectorid") Integer sectorid) {



 sector.setSectorid(sectorid);



 System.out.println(sector);



 sectorRepository.save(sector);



 return sector;



 }



 @DeleteMapping("/deleteSector/{sectorid}")



 public Boolean deleteCompany(@PathVariable("sectorid") Integer sectorid) {



 System.out.println(sectorid);



 Optional<Sector> sector = sectorRepository.findById(sectorid);



 sectorRepository.delete(sector.get());



 return true;



 }



 @GetMapping("/findOneInAll4/{sectorid}")



 public Sector findoneinall(@PathVariable("sectorid") Integer sectorid) {



 Optional<Sector> sector = sectorRepository.findById(sectorid);



 return sector.get();



 }



}

