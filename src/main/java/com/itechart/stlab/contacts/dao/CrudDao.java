package com.itechart.stlab.contacts.dao;

import com.itechart.stlab.contacts.entity.*;
import com.itechart.stlab.contacts.exception.*;

import java.util.*;
public interface CrudDao <T extends Entity>{

    void create (T entity) throws DaoException;
     void read (T entity) throws DaoException;
     void update (T entity) throws DaoException;
     void delete (T entity) throws DaoException;
     Optional<T> getById(int id) throws DaoException;

}

