package com.brightLink.thymeleafCrudOnBikeDB.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.brightLink.thymeleafCrudOnBikeDB.entity.Bike;
import com.brightLink.thymeleafCrudOnBikeDB.repository.BikeRepository;



@Controller
public class BikeController {
	@Autowired
private BikeRepository repo;

//dispaly list of bike
@GetMapping("/")
public String getAllBike(Model model) {
	model.addAttribute("bikelist",repo.findAll()); // Fetch existing bikes
	model.addAttribute("bike", new Bike()); // Empty bike object for form
	return "index"; //  main page with the bike list and modal form
}


//////show new form for add new bike details
//@GetMapping("/showNewBikeForm")
//public String showNewBikeForm(Model model) {
//	//create model attribute to bind form data
//    Bike bike =new Bike();
//	model.addAttribute("bike",bike);
//	return "new_bike";
//}


//save new added bike in database
@PostMapping("/saveBike")
public String saveBike(@ModelAttribute("bike") Bike bike) {
	//save employee to database
	this.repo.save(bike);
	return "redirect:/";
}

////Update
//@GetMapping("/showFormForUpdate/{id}")
//public String showFormForUpdate(@PathVariable (value= "id") int id, Model model) {
//	//get bike form the service
//	Optional<Bike> bike=repo.findById(id);
//	//set bike as a model attribute to pre-populate the form
//	model.addAttribute("bike",bike);
//	return "update_bike";
//}


@GetMapping("/getBike/{id}")
@ResponseBody
public Bike getBike(@PathVariable("id") int id) {
    return repo.findById(id).orElse(null);
}



//Delete
@GetMapping("/deleteBike/{id}")
public String deleteBike(@PathVariable (value="id") int id) {
	this.repo.deleteById(id);
	return "redirect:/";
}


}


