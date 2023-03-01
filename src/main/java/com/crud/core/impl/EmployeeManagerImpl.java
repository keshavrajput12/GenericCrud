package com.crud.core.impl;

import com.crud.core.EmployeeManager;
import com.crud.db.EmployeeDAO;
import com.crud.providers.DAOProvider;

import java.util.List;

public class EmployeeManagerImpl implements EmployeeManager {

    private final static EmployeeManagerImpl INSTANCE=new EmployeeManagerImpl();
    private EmployeeManager employeeManager;
    private EmployeeDAO employeeDAO;

    private EmployeeManagerImpl(){
        employeeManager= EmployeeManagerImpl.getInstance();
        employeeDAO= DAOProvider.getInstance().getEmployeeDAO();
    }

    public static EmployeeManagerImpl getInstance() {
        return INSTANCE;
    }
//    @Override
//    public List<EmployeeDTO> getAllEmployees() {
//        return employeeDAO.getEmployees();
//    }
//
//    @Override
//    public EmployeeDTO getEmployeeById(long id) {
//        return employeeDAO.getEmployeeById(id);
//    }
//
//    @Override
//    public void createEmployee(EmployeeDTO user) {
//        employeeDAO.createEmployee(user);
//
//    }
//
//    @Override
//    public void updateEmployee(EmployeeDTO user) {
//        employeeDAO.createEmployee(user);
//
//    }
//
//    @Override
//    public void deleteEmployee(long id) {
//        employeeDAO.deleteEmployee(id);
//    }

}
