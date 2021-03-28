package com.wd.model.bet;

public class Bet extends BaseBet {
  private static final long serialVersionUID = 1L;
  private TeamBetTypeEnum team;

  public Bet() {

  }

  public Bet(String source, BetTypeEnum bet, TeamBetTypeEnum team, Double decimalLine, Double usLine) {
    super(source, bet, decimalLine, usLine);
    this.team = team;
  }

  public TeamBetTypeEnum getTeam() {
    return team;
  }

  public void setTeam(TeamBetTypeEnum team) {
    this.team = team;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((team == null) ? 0 : team.hashCode());
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
    Bet other = (Bet) obj;
    if (team != other.team)
      return false;
    return true;
  }

}
