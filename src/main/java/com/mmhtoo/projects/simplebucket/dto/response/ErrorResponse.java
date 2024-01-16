package com.mmhtoo.projects.simplebucket.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {

  private String responseDescription;

  private Date timestamp;

  private Integer status;

  private Map<String,String> errors;

}
