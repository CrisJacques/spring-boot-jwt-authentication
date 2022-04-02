package com.cristhiane.springbootauthenticationjwtMySQL.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cristhiane.springbootauthenticationjwtMySQL.models.ERole;
import com.cristhiane.springbootauthenticationjwtMySQL.models.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
