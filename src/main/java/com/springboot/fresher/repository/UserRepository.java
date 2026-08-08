package com.springboot.fresher.repository;

import com.springboot.fresher.entity.user.UserEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>, JpaSpecificationExecutor<UserEntity> {

    /**
     * find userName and userEmail
     */
    UserEntity findByUserNameAndUserEmail(String userName, String userEmail);

    /**
     * find userName
     */
    UserEntity findByUserName(String userName);

    /**
     * WHERE userName LIKE %?
     */
    List<UserEntity> findByUserNameStartingWith(String userEmail);

    /**
     * WHERE userName LIKE ?%
     */
    List<UserEntity> findByUserNameEndingWith(String userEmail);

    /**
     * WHERE id < 1
     */
    List<UserEntity> findByIdLessThan(Long id);

    /**
     * RAW JPQL
     */
    @Query("SELECT u FROM UserEntity u WHERE u.id = (SELECT MAX(p.id) FROM UserEntity p)")
    UserEntity findMaxIdUser();

    @Query("SELECT u FROM UserEntity u WHERE u.userName = ?1 AND u.userEmail = ?2")
    List<UserEntity> getUserEntityBy(String userName, String userEmail);

    @Query("SELECT u FROM UserEntity u WHERE u.userName = :userName AND u.userEmail = :userEmail")
    List<UserEntity> getUserEntityTwoBy(@Param("userNam") String userName, @Param("userEmail") String userEmail);

    /**
     * UPDATE & DELETE
     */
    @Modifying
    @Query("UPDATE UserEntity u SET u.userName = :userName")
    @Transactional
    int updateUserName(@Param("userNam") String userName);

    /**
     * Native query
     */
    @Query(value = "SELECT COUNT(id) FROM users", nativeQuery = true)
    long getTotalUser();

    /**
     * Pageable
     */
    Page<UserEntity> findByUserName(String userName, Pageable pageable);
}
