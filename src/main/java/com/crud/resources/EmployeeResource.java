package com.crud.resources;

import com.crud.core.EmployeeManager;
import com.crud.core.impl.EmployeeManagerImpl;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/employees")
public class EmployeeResource {
//    private EmployeeManager employeeManager=EmployeeManagerImpl.getInstance();
//    @GET
//    @Consumes(MediaType.APPLICATION_JSON)
//    public List<EmployeeDTO> getAllUsers() {
//        return employeeManager.getAllEmployees();
//    }
//
//    @GET
//    @Path("/{id}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public EmployeeDTO getUserById(@PathParam("id") long id) {
//        return employeeManager.getEmployeeById(id);
//    }
//
//    @POST
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    public void createUser(EmployeeDTO employeeDTO) {
//        employeeManager.createEmployee(employeeDTO);
//    }
//
//    @PUT
//    @Path("/{id}")
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    public void updateUser(@PathParam("id") long id, EmployeeDTO employeeDTO) {
//        employeeManager.updateEmployee(employeeDTO);
//    }
//
//    @DELETE
//    @Path("/{id}")
//    public void deleteUser(@PathParam("id") long id) {
//        employeeManager.deleteEmployee(id);
//    }
}
