package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.javaapp.demoapplication.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(@Param("email") String email);
}
