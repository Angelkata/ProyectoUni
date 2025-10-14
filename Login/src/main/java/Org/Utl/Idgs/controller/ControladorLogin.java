package Org.Utl.Idgs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorLogin {

    @GetMapping("/inicio-sesion")
    public String inicioSesion() {
        return "inicio-sesion";
    }

    @GetMapping("/principal")
    public String principal() {
        return "principal";
    }


        @GetMapping("/Usuario")
    public String Usuario() {
        return "Usuario";
    }
}