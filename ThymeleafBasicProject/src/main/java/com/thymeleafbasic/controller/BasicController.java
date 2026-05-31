package com.thymeleafbasic.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.thymeleafbasic.model.Car;
import com.thymeleafbasic.model.Songs;

@Controller
public class BasicController {
	
	@GetMapping("/Welcome")
	public String welcomePage(Model model)
	{
		String msg="Welcome Malik!";
		model.addAttribute("message",msg);
		return "Welcome";
	}
	@GetMapping("/gaadi")
	public String carPage(Model model)
	{
		Car c1=new Car(1,"Defender","Land Rover","White",40000000);
		Car c2=new Car(2,"Nano","Tata","Yellow",100000);
		Car c3=new Car(3,"Omni","Maruti Suzuki","Red",500000);
		Car c4=new Car(4,"Safari","Tata","Green",2500000);
		Car c5=new Car(5,"Seltos","Kia","Black",2000000);
		Car c6=new Car(6,"Creta","Hyundai","Grey",1800000);
		

		
		List<Car> listcar=Arrays.asList(c1,c2,c3,c4,c5,c6);
		model.addAttribute("allCars",listcar);
		return "Showroom";
	}
	
	@GetMapping("/songs")
	public String SongPage(Model model)
	{
		Songs s1 = new Songs(1, "Arijit Song", "Aashiqui 2", "Arijit Singh");
		Songs s2 = new Songs(2, "Love Anthem", "Kabir Singh", "Sachet Tandon");
		Songs s3 = new Songs(3, "Romantic", "Yeh Jawaani Hai Deewani", "Arijit Singh");
		Songs s4 = new Songs(4, "Melody Hit", "Bajirao Mastani", "Shreya Ghoshal");
		Songs s5 = new Songs(5, "Classic", "Dil Se", "A. R. Rahman");

				
				
		List<Songs> listsong=Arrays.asList(s1,s2,s3,s4,s5);
		model.addAttribute("allSongs",listsong);
		return "DataSong";
	}

	

}
