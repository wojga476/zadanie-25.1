package pl.javastart.springdata;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeRepository extends JpaRepository<Home, Long> {
}
