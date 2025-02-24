package com.eupoint.upoint_pi.repository;

import com.eupoint.upoint_pi.entities.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}
