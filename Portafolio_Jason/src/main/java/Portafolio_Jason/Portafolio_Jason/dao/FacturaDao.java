package Portafolio_Jason.Portafolio_Jason.dao;

import Portafolio_Jason.Portafolio_Jason.domain.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaDao extends JpaRepository <Factura,Long> {
     
}