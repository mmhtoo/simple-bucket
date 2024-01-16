package com.mmhtoo.projects.simplebucket.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table( name = "buckets" )
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BucketEntity {

  @Id
  @GeneratedValue( strategy = GenerationType.UUID )
  private String id;

  private String name;

  private String description;

  private LocalDateTime createdAt;

  private LocalDateTime updatedAt;

  // if true, won't be able to access
  // can't only be changed by owner user
  private Boolean isDisabled;

  // if true, will be accessible from public with bucket id
  private Boolean isPublic;

}
