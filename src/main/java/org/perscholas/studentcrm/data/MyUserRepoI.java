package org.perscholas.studentcrm.data;

import jakarta.transaction.Transactional;
import org.perscholas.studentcrm.model.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository @Transactional(rollbackOn = Exception.class)
public interface MyUserRepoI extends JpaRepository<MyUser, Integer> {

    Optional<MyUser> findByEmailAllIgnoreCase(String email);

    List<MyUser> findByLastNameAllIgnoreCase(String lastName);

    List<MyUser> findByAddressesStateAllIgnoreCase(String state);

}
