package com.example.demo.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Excel;
import com.example.demo.model.ExcelDTO;
import com.example.demo.service.ExcelService;

@CrossOrigin
@RestController
@RequestMapping(value="api/home")
public class ExcelController {
	
	@Autowired
	ExcelService excelService;
	
	@PostMapping(value="/save")
	public Excel salvaExcel(@RequestBody Excel excel) {
	return excelService.saveExcel(excel);
	}
	
	@GetMapping(value="/{id}")
	public Excel findExcelById(@PathVariable("id") Integer id) {
		return excelService.findByIdExcel(id);
	}
	
	@GetMapping("")
	public List<Excel> findAll(){
		return excelService.findAllExcel();
	}
	
	@GetMapping(value="/dto/{id}")
	public ExcelDTO findExcelByIdDto(@PathVariable("id") Integer id) {
		return excelService.findByIdExcelDto(id);
	}
	
	@GetMapping(value="/dto")
	public List<ExcelDTO> findAllDto(){
		return excelService.findAllExcelDto();
	}

}
