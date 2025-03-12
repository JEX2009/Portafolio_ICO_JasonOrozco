package Portafolio_Jason.Portafolio_Jason.dao;

import Portafolio_Jason.Portafolio_Jason.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao extends JpaRepository <Producto, Long> {
    
}