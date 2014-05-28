package com.esprit.ToDOList;




	import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;







	@Path("todo")
	public class ToDoListRest {

		static List<tache> taches=new ArrayList<tache>();
		
		@POST
		@Path("/add")
		@Consumes("application/xml")
		public String ajoutertache(tache t)
		{
			if (taches.add(t))
				return("votre tache est ajouté avec succés ");
			return("impossible d'ajouté ");
			}


		@GET
		@Path("/affiche")
		@Produces("application/xml")
		public List<tache> taches()
		{
			
			System.out.println("size lissssssssssssssssssssssst");
			System.out.println(taches.size());
			return taches;
			
		}
		
		
		@GET
		@Path("/search/{priorite}")
		@Produces("application/json")
		public  tache taches(@PathParam("priorite") String priorite) {
			tache tache = null;
			for(tache t:taches){
				if (t.getPriorite().equals(priorite)){
					tache =t;
				}
			}
			return tache;
		}
		
		@DELETE
		@Path("/delete")
		public  String supprimertache(@QueryParam("titre") String titre) {
			Iterator<tache> it=taches.iterator();
			while(it.hasNext()){
				if(it.next().getTitre()==titre){
					it.remove();
					return "tache supprimé";
				}
				
			}
			return "impossible de supprimé";
			}
		
	}

		
		


	