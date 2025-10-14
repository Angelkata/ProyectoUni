package Org.Utl.Idgs.Login.repository.dao;

import java.util.Optional;

import Org.Utl.Idgs.Login.model.Usuario;

public interface UsuarioDao {
    Usuario save(Usuario usuario);
    Optional<Usuario> findByNombreUsuario(String nombreUsuario);
}
