package com.springboot.fresher.repository;

import com.springboot.fresher.entity.feed.FeedEntity;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedRepository extends JpaRepository<@NonNull FeedEntity, @NonNull Long> {

}
