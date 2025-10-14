package Org.Utl.Idgs.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InMemoryUsuarioStore {

    private static final List<Usuario> USERS = Collections.synchronizedList(new ArrayList<>());

    public static void save(Usuario u) {
        USERS.add(u);
    }

    public static List<Usuario> findAll() {
        return new ArrayList<>(USERS);
    }
}
