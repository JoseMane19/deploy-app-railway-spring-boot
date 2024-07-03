package com.bakehouse.service.BakeHouse.source.api;

import java.io.Serializable;
import java.util.List;

import jakarta.validation.ConstraintViolationException;

public interface ServiceAPIJM <T, ID extends Serializable>{
    
    public T saveBean(T entity) throws ConstraintViolationException;

	public T updateBean(T entity);
	
	public void deleteBean(ID id);
	
	public T getBean(ID id);
	
	public List<T> getAllDocuments();

	public List<T> toCombo();

}