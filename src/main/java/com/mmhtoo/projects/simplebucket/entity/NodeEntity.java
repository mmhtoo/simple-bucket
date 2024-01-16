package com.mmhtoo.projects.simplebucket.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

// node is either file or directory
@Entity
@Table( name = "nodes" )
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NodeEntity {

  @Id
  @GeneratedValue( strategy = GenerationType.UUID )
  private String id;

  private String name;

  @OneToOne
  private NodeEntity parentNode;

  private Boolean isDirectory;

  private Date createdAt;

  private Date updatedAt;

  // if true, won't be able to access
  // can't only be changed by owner user
  private Boolean isDisabled;

  // if true, will be accessible from public with bucket id
  private Boolean isPublic;

}
