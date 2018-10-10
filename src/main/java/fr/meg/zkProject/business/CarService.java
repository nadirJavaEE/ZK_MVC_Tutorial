package fr.meg.zkProject.business;

import java.util.List;

import fr.meg.zkProject.model.Car;

public interface CarService {
	
	public List<Car> findAll();
    
    public List<Car> search(String keyword);

}
