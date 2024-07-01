package org.mm.controller;

import java.util.List;

import org.mm.dto.MarksheetDto;
import org.mm.service.MarksheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/marksheet")
public class MarksheetController 
{
	@Autowired
	private MarksheetService marksheetService;
	
	@PostMapping(value = "")
	public ResponseEntity<MarksheetDto> save(@RequestBody MarksheetDto dto)
	{
		MarksheetDto result = marksheetService.save(dto);
		return new ResponseEntity<MarksheetDto>(result, HttpStatus.CREATED);
	}
	
	@GetMapping(value = "")
	public ResponseEntity<List<MarksheetDto>> findAll()
	{
		List<MarksheetDto> result = marksheetService.findAll();
		return new ResponseEntity<List<MarksheetDto>>(result, HttpStatus.OK);
	}
}
