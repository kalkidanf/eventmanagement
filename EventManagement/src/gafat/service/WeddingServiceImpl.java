package gafat.service;

import gafat.repository.WeddingRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class WeddingServiceImpl implements WeddingService {
	
	@Autowired 
	WeddingRepository weddinRepository;
	
	
	public List<String> getCountryNameList()
	{
		List<String> countryNameList=new ArrayList();
		countryNameList=weddinRepository.getCountryNameList();
		return countryNameList;		
	}

}
