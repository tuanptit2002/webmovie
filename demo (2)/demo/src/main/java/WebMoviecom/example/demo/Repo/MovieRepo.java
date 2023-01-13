package WebMoviecom.example.demo.Repo;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import WebMoviecom.example.demo.entity.Movie;

public interface MovieRepo extends JpaRepository<Movie, Integer>{
//	@Query("SELECT n form Movice n where n.name lke :x")
//	Page<Movie> searchByName(@Param("x")String x,Pageable pageable);
}
