package org.launchcode.techjobs.persistent.models.data;

//import org.launchcode.javawebdevtechjobsauthentication.models.User;

import org.launchcode.techjobs.persistent.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface UserRepository extends CrudRepository {
    User findByUsername(String username);
}