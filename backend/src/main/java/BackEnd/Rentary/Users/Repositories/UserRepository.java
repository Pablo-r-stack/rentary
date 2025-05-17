package BackEnd.Rentary.Users.Repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import BackEnd.Rentary.Users.Entities.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
    Page<User> findAllUserByIsActiveTrue(Pageable pageable);
    Optional<User> findByVerificationToken(String token);

}
