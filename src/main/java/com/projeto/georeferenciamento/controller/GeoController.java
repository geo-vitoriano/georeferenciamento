package com.projeto.georeferenciamento.controller;


import com.projeto.georeferenciamento.repository.GeoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("geografia")
public class GeoController {

   @Autowired
   private GeoRepository repository;




}
