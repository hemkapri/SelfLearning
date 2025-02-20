package com.learning.Learning.repo;

import com.learning.Learning.entity.UserE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserE,Long> {

}
