package br.com.danilodps.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.danilodps.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	/* Para referência
	 * https://docs.spring.io/spring-data/jpa/docs/current-SNAPSHOT/reference/html/#reference 
	 */
	
	User findByEmail(String email);
}