package com.epam.olympiad.transportation.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/csv")
public class CsvController {


  @RequestMapping(method = RequestMethod.POST, value = "/import/")
  @ApiOperation("Imports a CSV file into the database. The file should be retrieved by its absolute path from the resources.")
  @CrossOrigin
  public ResponseEntity<String> uploadCSVData() {
    //TODO: finish the endpoint implementation
    throw new UnsupportedOperationException();
  }
}
