package com.mmhtoo.projects.simplebucket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BucketRepository extends JpaRepository<BucketRepository,String> {
}
