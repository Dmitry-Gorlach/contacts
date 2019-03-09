package com.itechart.stlab.contacts.dao;

import com.itechart.stlab.contacts.model.*;
import com.itechart.stlab.contacts.exception.*;

public interface ContactDao extends CrudDao<Contact> {

     void addAttachment() throws DaoException;


}
