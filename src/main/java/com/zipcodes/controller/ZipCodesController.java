package com.zipcodes.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("zipcode/api/")
public class ZipCodesController {

@GetMapping("/status")
public ResponseEntity<?> getMethodName() {
   return new ResponseEntity<>("API is running", HttpStatus.OK);
}

}
