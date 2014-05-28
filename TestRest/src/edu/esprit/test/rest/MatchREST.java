package edu.esprit.test.rest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.decorator.Delegate;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;


@Path("championnat")
public class MatchREST {

	static List<Match> matchs = new ArrayList<Match>();
	@POST
	@Path("/creer")
	@Consumes("application/xml")
	public String creermatch(Match match)
	{
		if(matchs.add(match))
		 return ("match ajoute avec succée");
	
		return ("impossible d'ajouter le match");


	}
	@GET
	@Path("/matchs")
	@Produces("application/xml")
	public List<Match> matchs()
	{
		
		System.out.println("size lissssssssssssssssssssssst");
		System.out.println(matchs.size());
		return matchs;
		
	}
	@GET
	@Path("/matchs/{date}")
	@Produces("application/json")
	public  Match matchs(@PathParam("date") String date) {
		Match match = null;
		for(Match M:matchs){
			if (M.getDate().equals(date)){
				match=M;
			}
		}
		return match;
	}
	@DELETE
	@Path("/match")
	public  String supprimermatch(@QueryParam("id") int id) {
		Iterator<Match> it=matchs.iterator();
		while(it.hasNext()){
			if(it.next().getId()==id){
				it.remove();
				return "match supprimé";
			}
			
		}
		return "impossible de supprimé";
		}
	
}
