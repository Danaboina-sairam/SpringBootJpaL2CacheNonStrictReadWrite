package com.SpringBootJpaL2CacheNonStrictReadWrite.repository;

import com.SpringBootJpaL2CacheNonStrictReadWrite.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails,Long> {

}
