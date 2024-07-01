package org.mm.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.mm.dao.MarksheetRepository;
import org.mm.dto.MarksheetDto;
import org.mm.entities.Marksheet;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarksheetService 
{
	@Autowired
	private MarksheetRepository marksheetRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public MarksheetDto save(MarksheetDto dto)
	{
		Marksheet m = marksheetRepository.save(convertToEntity(dto));
		return convertToDto(m);
	}
	
	public List<MarksheetDto> findAll()
	{
		List<Marksheet> li = marksheetRepository.findAll();
		
		List<MarksheetDto> liresult = li
										.stream()
										.map(this :: convertToDto)
										.collect(Collectors.toList());
		
		return liresult;
	}
	
	private MarksheetDto convertToDto(Marksheet marksheet)
	{
		MarksheetDto dto = modelMapper.map(marksheet, MarksheetDto.class);
		return dto;
	}
	
	private Marksheet convertToEntity(MarksheetDto dto)
	{
		Marksheet marksheet = modelMapper.map(dto, Marksheet.class);
		return marksheet;
	}
}
