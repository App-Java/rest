package co.tiv.ws.rest.service;


import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import co.tiv.ws.rest.vo.VOUsuario;

@Path("/tiv")
public class ServiceLoginJR {

    @POST
    @Path("/validarUsuario")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public VOUsuario validaUsuario(VOUsuario usuario) {
        usuario.setUserValido(false);
        if (usuario.getUsuario().equals("java") && usuario.getPassword().equals("tiv")) {
            usuario.setUserValido(true);
        }
        usuario.setPassword("***************");
        return usuario;
    }
}
