package gafat.controller;

import gafat.service.WeddingService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WeddingController {
	
@Autowired
WeddingService weddingService;
	@RequestMapping(value = {"/","/wedding"})
    public String weddingEventRegistration(Model model) {
		List<String> countrys=new ArrayList();
		countrys=weddingService.getCountryNameList();
		model.addAttribute("countrys",countrys);
		return "wedding";
	}
 @RequestMapping(value={"/weddingR"})
 public String registerWedding()
 
 {
	 return "wedding";
 }
}
