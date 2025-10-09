package Org.Utl.Idgs.Login.security;

import java.util.Collections;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import Org.Utl.Idgs.Login.model.Usuario;
import Org.Utl.Idgs.Login.repository.UsuarioRepository;

@Service
public class DbUserDetailsService implements UserDetailsService {

    private final UsuarioRepository usuarioRepository;

    public DbUserDetailsService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findByNombreUsuario(username)
            .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado: " + username));

        // Sin roles/permisos adicionales; se pueden agregar GrantedAuthority si los hay
        return User.withUsername(usuario.getNombreUsuario())
                .password(usuario.getContrasena())
                .authorities(Collections.emptyList())
                .build();
    }
}
