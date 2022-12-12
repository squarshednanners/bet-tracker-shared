package com.wd.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

import com.wd.model.bet.BaseBet;

public class BaseEvent implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private String id;
  private String linkSource;
  private String linkId;
  private List<EventLink> links = new ArrayList<>();
  private EventTypeEnum type;
  private String sport;
  private Long time;
  private List<BaseBet> bets = new ArrayList<>();

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getLinkSource() {
    return linkSource;
  }

  public void setLinkSource(String linkSource) {
    this.linkSource = linkSource;
  }

  public String getLinkId() {
    return linkId;
  }

  public void setLinkId(String linkId) {
    this.linkId = linkId;
  }

  public List<EventLink> getLinks() {
    return links;
  }

  public void setLinks(List<EventLink> links) {
    this.links = links;
  }

  public EventTypeEnum getType() {
    return type;
  }

  public void setType(EventTypeEnum type) {
    this.type = type;
  }

  public String getSport() {
    return sport;
  }

  public void setSport(String sport) {
    this.sport = sport;
  }

  public Long getTime() {
    return time;
  }

  public void setTime(Long time) {
    this.time = time;
  }

  public List<BaseBet> getBets() {
    return bets;
  }

  public void setBets(List<BaseBet> bets) {
    this.bets = bets;
  }

  public void addBet(BaseBet bet) {
    this.bets.add(bet);
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    result = prime * result + ((linkId == null) ? 0 : linkId.hashCode());
    result = prime * result + ((linkSource == null) ? 0 : linkSource.hashCode());
    result = prime * result + ((sport == null) ? 0 : sport.hashCode());
    result = prime * result + ((time == null) ? 0 : time.hashCode());
    result = prime * result + ((type == null) ? 0 : type.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    BaseEvent other = (BaseEvent) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    if (linkId == null) {
      if (other.linkId != null)
        return false;
    } else if (!linkId.equals(other.linkId))
      return false;
    if (linkSource == null) {
      if (other.linkSource != null)
        return false;
    } else if (!linkSource.equals(other.linkSource))
      return false;
    if (sport == null) {
      if (other.sport != null)
        return false;
    } else if (!sport.equals(other.sport))
      return false;
    if (time == null) {
      if (other.time != null)
        return false;
    } else if (!time.equals(other.time))
      return false;
    if (type != other.type)
      return false;
    return true;
  }

}
