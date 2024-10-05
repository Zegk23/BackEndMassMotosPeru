package com.massmotosperu.backend.Repositories;

import com.massmotosperu.backend.Models.SedeTiendaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SedeTiendaRepository extends JpaRepository<SedeTiendaModel, Integer> {
}
