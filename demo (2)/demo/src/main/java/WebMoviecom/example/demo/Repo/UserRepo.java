package WebMoviecom.example.demo.Repo;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import WebMoviecom.example.demo.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{
//	@Query("SELECT u FROM User u where ROUND(DATEDIFF(CURDATE(), u.birth) / 365, 0) > :x")
//	Page<User> searchByAge(@Param("x")int x,Pageable pageable);
}
