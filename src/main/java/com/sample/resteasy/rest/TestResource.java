package com.sample.resteasy.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.sample.resteasy.pojo.City;

/**
 * RestEndpoint
 * 
 * @author manjunathshetty
 */

@Path("sample")
public class TestResource {

	/**
	 * Sample rest endpoint with simple String/text as return type
	 * 
	 * @return {@link String}
	 */
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String helloWorld() {
		return "Hello World!";
	}

	/**
	 * Sample Rest endpoint with JSON as the return type
	 * 
	 * @return {@link Response}
	 */
	@GET
	@Path("city")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getWithJSONObject() {
		City city = new City();
		city.setName("Bengaluru");
		city.setKnownFor("IT");

		return Response.status(Status.OK).entity(city).build();
	}

	/**
	 * Sample rest endpoint of type POST request
	 * 
	 * @param {@link
	 * 			City}
	 * @return {@link Response}
	 */
	@POST
	@Path("city")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response postJsonObject(City city) {
		System.out.println("Got city request with " + city.toString());
		return Response.ok().build();
	}

}
