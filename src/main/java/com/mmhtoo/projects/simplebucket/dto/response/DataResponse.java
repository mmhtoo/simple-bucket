package com.mmhtoo.projects.simplebucket.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class DataResponse<T> {

  private String responseDescription;

  private Date timestamp;

  private Integer status;

  private T data;

}
