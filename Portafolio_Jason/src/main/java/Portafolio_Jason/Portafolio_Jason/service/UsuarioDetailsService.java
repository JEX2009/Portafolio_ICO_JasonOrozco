package Portafolio_Jason.Portafolio_Jason.service;

import org.springframework.security.core.userdetails.*;

public interface UsuarioDetailsService {

    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

}