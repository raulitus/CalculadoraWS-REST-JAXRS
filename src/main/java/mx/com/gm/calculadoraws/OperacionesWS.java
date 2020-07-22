/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.calculadoraws;

import java.math.BigDecimal;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Link;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import static mx.com.gm.calculadoraws.operaciones.Operaciones.suma;

@Path("/operaciones")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class OperacionesWS {

    //@Context
    //UriInfo uriInfo;
    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    @Path("/suma")//hace referencia al path /operaciones/suma

    public Response suma(@QueryParam("num1") int num1, @QueryParam("num2") int num2) {
        int resultado;
        resultado = num1 + num2;
        System.out.println("El resultado de" + num1 + "+" + num2 + "=" + resultado);
        //Link link = Link.fromUri(uriInfo.getBaseUri()).rel("uri").build();
        // configurations.setLink(link);
        return Response.ok(resultado, MediaType.APPLICATION_JSON).build();
    }

    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    @Path("/resta")//hace referencia al path /operaciones/resta

    public Response resta(@QueryParam("num1") int num1, @QueryParam("num2") int num2) {
        int resultado;
        resultado = num1 - num2;
        System.out.println("El resultado de" + num1 + "-" + num2 + "=" + resultado);
        //Link link = Link.fromUri(uriInfo.getBaseUri()).rel("uri").build();
        // configurations.setLink(link);
        return Response.ok(resultado, MediaType.APPLICATION_JSON).build();
    }

    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    @Path("/multiplicacion")//hace referencia al path /operaciones/multiplicacion

    public Response multiplicacion(@QueryParam("num1") double num1, @QueryParam("num2") double num2) {

        //double resultado;
        //resultado = num1 * num2;
        BigDecimal resultado = new BigDecimal(num1 * num2);
        System.out.println("El resultado de" + num1 + "*" + num2 + "=" + resultado);
        //Link link = Link.fromUri(uriInfo.getBaseUri()).rel("uri").build();
        // configurations.setLink(link);
        return Response.ok(resultado, MediaType.APPLICATION_JSON).build();
    }

    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    @Path("/division")//hace referencia al path /operaciones/division
    public Response division(@QueryParam("num1") double num1, @QueryParam("num2") double num2) {
            
        double resultado =num1/num2;
        System.out.println("El resultado de" + num1 + "/" + num2 + "=" + resultado);
        //Link link = Link.fromUri(uriInfo.getBaseUri()).rel("uri").build();
        // configurations.setLink(link);
        return Response.ok(resultado, MediaType.APPLICATION_JSON).build();
    }

    //METODO FACTORIAL//
    public static double fact(double numero) {
        double resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    @Path("/factorial")//hace referencia al path /operaciones/factorial
    public Response factorial(@QueryParam("num1") double num1) {
        BigDecimal resultado;
        resultado = new BigDecimal(fact(num1));
        System.out.println("El factorial de" + num1 + "!=" + resultado);
        return Response.ok(resultado, MediaType.APPLICATION_JSON).build();
    }
}
