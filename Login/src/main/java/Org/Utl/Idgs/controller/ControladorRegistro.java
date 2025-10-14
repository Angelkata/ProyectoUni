package Org.Utl.Idgs.controller;
import Org.Utl.Idgs.Login.model.Usuario;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registro")
public class ControladorRegistro {

    @Autowired
    private Org.Utl.Idgs.Login.Service.UsuarioService usuarioService;

    @GetMapping
    public String mostrarFormulario(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "usuario";
    }

    @PostMapping
    public String registrarUsuario(@ModelAttribute("usuario") Usuario usuario) {
        usuarioService.registrar(usuario);
        return "redirect:/inicio-sesion?exito"; 
    }
}