package gafat.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public class WeddingRepositoryImpl implements WeddingRepository {
	public List<String> getCountryNameList()
	{
		List<String> countryNameList=new ArrayList<>();
		countryNameList.add("USA");
		countryNameList.add("Ethiopia");
		countryNameList.add("Italy");
		return countryNameList;
	}

}
