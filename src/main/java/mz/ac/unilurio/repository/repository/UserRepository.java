package mz.ac.unilurio.repository.repository;

import mz.ac.unilurio.repository.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User,Long> {
    User findByUsername(String username);
}
