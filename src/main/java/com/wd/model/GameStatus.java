package com.wd.model;

import java.io.Serializable;
import java.util.SortedMap;

public class GameStatus implements Serializable {
  private static final long serialVersionUID = 1L;
  private String status;
  private GameStatusEnum progress;
  private Double homeScore;
  private SortedMap<Integer, Double> homeScoreBreakdown;
  private Double awayScore;
  private SortedMap<Integer, Double> awayScoreBreakdown;
  private String clock;

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public GameStatusEnum getProgress() {
    return progress;
  }

  public void setProgress(GameStatusEnum progress) {
    this.progress = progress;
  }

  public Double getHomeScore() {
    return homeScore;
  }

  public void setHomeScore(Double homeScore) {
    this.homeScore = homeScore;
  }

  public SortedMap<Integer, Double> getHomeScoreBreakdown() {
    return homeScoreBreakdown;
  }

  public void setHomeScoreBreakdown(SortedMap<Integer, Double> homeScoreBreakdown) {
    this.homeScoreBreakdown = homeScoreBreakdown;
  }

  public Double getAwayScore() {
    return awayScore;
  }

  public void setAwayScore(Double awayScore) {
    this.awayScore = awayScore;
  }

  public SortedMap<Integer, Double> getAwayScoreBreakdown() {
    return awayScoreBreakdown;
  }

  public void setAwayScoreBreakdown(SortedMap<Integer, Double> awayScoreBreakdown) {
    this.awayScoreBreakdown = awayScoreBreakdown;
  }

  public String getClock() {
    return clock;
  }

  public void setClock(String clock) {
    this.clock = clock;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((awayScore == null) ? 0 : awayScore.hashCode());
    result = prime * result + ((clock == null) ? 0 : clock.hashCode());
    result = prime * result + ((homeScore == null) ? 0 : homeScore.hashCode());
    result = prime * result + ((progress == null) ? 0 : progress.hashCode());
    result = prime * result + ((status == null) ? 0 : status.hashCode());
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
    GameStatus other = (GameStatus) obj;
    if (awayScore == null) {
      if (other.awayScore != null)
        return false;
    } else if (!awayScore.equals(other.awayScore))
      return false;
    if (clock == null) {
      if (other.clock != null)
        return false;
    } else if (!clock.equals(other.clock))
      return false;
    if (homeScore == null) {
      if (other.homeScore != null)
        return false;
    } else if (!homeScore.equals(other.homeScore))
      return false;
    if (progress != other.progress)
      return false;
    if (status == null) {
      if (other.status != null)
        return false;
    } else if (!status.equals(other.status))
      return false;
    return true;
  }

}
