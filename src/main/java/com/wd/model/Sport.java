package com.wd.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Sport implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  private String id;
  private String key;
  private String name;
  private List<League> leagues;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<League> getLeagues() {
    return leagues;
  }

  public void setLeagues(List<League> leagues) {
    this.leagues = leagues;
  }
}
