package com.bakehouse.service.BakeHouse.source.implement;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.bakehouse.service.BakeHouse.source.api.ServiceAPIJM;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import jakarta.validation.ConstraintViolationException;

public abstract class ServiceImplement<T, ID extends Serializable> implements ServiceAPIJM<T, ID> {

	private List<T> returnList;

	@Override
	public T saveBean(T entity) throws ConstraintViolationException {
		return this.getRepository().insert(entity);
	}

	@Override
	public T updateBean(T entity) throws ConstraintViolationException {
		return getDao().save(entity);
	}

	@Override
	public void deleteBean(ID id) {
		getDao().deleteById(id);
	}

	@Override
	public T getBean(ID id) {

		Optional<T> obj = getDao().findById(id);

		if (obj.isPresent()) {
			return obj.get();
		}
		return null;
	}

	@Override
	public List<T> getAllDocuments() {
		returnList = new ArrayList<>();
		this.getDao().findAll().forEach(obj -> returnList.add(obj));
		return returnList;
	}

	@Override
	public List<T> toCombo() {

		return this.getAllDocuments();
	}

	public abstract CrudRepository<T, ID> getDao();

	public abstract MongoRepository<T, ID> getRepository();

}
