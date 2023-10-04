package com.rest;





import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;







@Path("/json/service")

public class JSONService {



	@GET

	@Path("/get")

	@Produces("application/json")





	public Product getApplication() {



		Product p=new Product();



		p.setName("shi");



		p.setId(180);



		return p;



}


//
//	@POST
//
//	@Path("/post")
//
//	@Consumes("application/json")
//
//
//
//	public void postApplication(Product p)
//
//
//
//	{
//
//
//
//		System.out.println(p.getName()+" "+p.getId());
//
//
//
//	}
//


}







package com.rest;



public class Product {



	public String getName() {



		return name;



	}



	public void setName(String name) {



		this.name = name;



	}



	public int getId() {



		return id;



	}



	public void setId(int id) {



		this.id = id;



	}



	String name;



	int id;



}
