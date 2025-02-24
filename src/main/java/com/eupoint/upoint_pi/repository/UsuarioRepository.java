package com.eupoint.upoint_pi.repository;

import com.eupoint.upoint_pi.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
