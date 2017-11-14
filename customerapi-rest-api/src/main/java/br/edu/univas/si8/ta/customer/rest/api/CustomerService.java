package br.edu.univas.si8.ta.customer.rest.api;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/customerapi")
public interface CustomerService {
	
	@GET
	@Path("/customers")
	@Produces(MediaType.APPLICATION_JSON)
	String[] listCustomersNames();
	
	@GET
	@Path("/customer/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	String getCustomerById(@PathParam("id") int id);
	
	@POST
	@Path("/customer")
	@Produces(MediaType.APPLICATION_JSON)
	String saveNewCustomer(@FormParam("name") String name, @FormParam("email") String email);
	
}
