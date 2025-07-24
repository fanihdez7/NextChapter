package dev.nextchapter.api.dto;

import lombok.Data;


@Data
public class WorksDTO {
    private String key;
  private String title;
  private String authorKey;
  private String subtitle;
  private String description;
  private String notes;
}
