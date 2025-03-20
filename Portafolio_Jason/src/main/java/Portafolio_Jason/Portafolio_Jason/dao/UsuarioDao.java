package Portafolio_Jason.Portafolio_Jason.dao;

import Portafolio_Jason.Portafolio_Jason.domain.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository<Usuario, Long> {

    Usuario findByUsername(String username);

}