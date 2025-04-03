package Portafolio_Jason.Portafolio_Jason.dao;

import Portafolio_Jason.Portafolio_Jason.domain.Constante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConstanteDao 
        extends JpaRepository<Constante,Long> {
    
    public Constante findByAtributo(String stributo);
}
