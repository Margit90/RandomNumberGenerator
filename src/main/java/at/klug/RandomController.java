package at.klug;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


public class RandomController {

    @GET
    @Path("/write/{message}")
    @Produces(MediaType.TEXT_PLAIN)
    public static void main( String args[] ) {
        int min = 500;
        int max = 600;

        //Generate random int value from 50 to 100
        System.out.println("Random value in int from "+min+" to "+max+ ":");
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(random_int);
    }


}
