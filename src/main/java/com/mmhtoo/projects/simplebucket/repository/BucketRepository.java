package com.mmhtoo.projects.simplebucket.repository;

import com.mmhtoo.projects.simplebucket.entity.BucketEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BucketRepository extends JpaRepository<BucketEntity,String> {
}
