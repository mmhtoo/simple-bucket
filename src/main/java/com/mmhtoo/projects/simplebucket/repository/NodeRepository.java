package com.mmhtoo.projects.simplebucket.repository;

import com.mmhtoo.projects.simplebucket.entity.NodeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeRepository extends JpaRepository<NodeEntity,String> {
}
