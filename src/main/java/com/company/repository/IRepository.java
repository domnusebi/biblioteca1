package com.company.repository;

import java.util.List;
public interface IRepository<T>{
   public void save(T entity);
   public void delete(T entity);
   public T findById(int id);
   public List<T> findAll();
   public T update(T oldEntity, T newEntity);
}
