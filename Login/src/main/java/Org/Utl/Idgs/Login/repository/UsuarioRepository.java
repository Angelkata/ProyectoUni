package Org.Utl.Idgs.Login.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import Org.Utl.Idgs.Login.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findByNombreUsuario(String nombreUsuario);
}
