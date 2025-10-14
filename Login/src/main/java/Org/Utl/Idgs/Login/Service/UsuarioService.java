package Org.Utl.Idgs.Login.Service;

import Org.Utl.Idgs.Login.model.Usuario;
import Org.Utl.Idgs.Login.repository.dao.UsuarioDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioDao usuarioDao;

    public void registrar(Usuario usuario) {
        usuarioDao.save(usuario);
    }
}