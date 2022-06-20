package com.sbi.orm;

public interface CarRepository {
	void  insertCar(Car carObj);
	void  updateCar(Car carObj);
	void  deleteCar (int carId);
	void  selectCar(int carId);
	
	List<Car>selectAllCars();
	
	
	
}
