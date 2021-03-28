package com.wd.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class GameEvent extends BaseEvent {
  private static final long serialVersionUID = 1L;

  private String homeTeamId;
  private Integer homeTeamRank;
  private String awayTeamId;
  private Integer awayTeamRank;
  private GameStatus gameStatus;

  public String getHomeTeamId() {
    return homeTeamId;
  }

  public void setHomeTeamId(String homeTeamId) {
    this.homeTeamId = homeTeamId;
  }

  public Integer getHomeTeamRank() {
    return homeTeamRank;
  }

  public void setHomeTeamRank(Integer homeTeamRank) {
    this.homeTeamRank = homeTeamRank;
  }

  public String getAwayTeamId() {
    return awayTeamId;
  }

  public void setAwayTeamId(String awayTeamId) {
    this.awayTeamId = awayTeamId;
  }

  public Integer getAwayTeamRank() {
    return awayTeamRank;
  }

  public void setAwayTeamRank(Integer awayTeamRank) {
    this.awayTeamRank = awayTeamRank;
  }

  public GameStatus getGameStatus() {
    return gameStatus;
  }

  public void setGameStatus(GameStatus gameStatus) {
    this.gameStatus = gameStatus;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((awayTeamId == null) ? 0 : awayTeamId.hashCode());
    result = prime * result + ((awayTeamRank == null) ? 0 : awayTeamRank.hashCode());
    result = prime * result + ((gameStatus == null) ? 0 : gameStatus.hashCode());
    result = prime * result + ((homeTeamId == null) ? 0 : homeTeamId.hashCode());
    result = prime * result + ((homeTeamRank == null) ? 0 : homeTeamRank.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!super.equals(obj))
      return false;
    if (getClass() != obj.getClass())
      return false;
    GameEvent other = (GameEvent) obj;
    if (awayTeamId == null) {
      if (other.awayTeamId != null)
        return false;
    } else if (!awayTeamId.equals(other.awayTeamId))
      return false;
    if (awayTeamRank == null) {
      if (other.awayTeamRank != null)
        return false;
    } else if (!awayTeamRank.equals(other.awayTeamRank))
      return false;
    if (gameStatus == null) {
      if (other.gameStatus != null)
        return false;
    } else if (!gameStatus.equals(other.gameStatus))
      return false;
    if (homeTeamId == null) {
      if (other.homeTeamId != null)
        return false;
    } else if (!homeTeamId.equals(other.homeTeamId))
      return false;
    if (homeTeamRank == null) {
      if (other.homeTeamRank != null)
        return false;
    } else if (!homeTeamRank.equals(other.homeTeamRank))
      return false;
    return true;
  }

}
