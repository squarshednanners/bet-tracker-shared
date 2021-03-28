package com.wd.model.bet;

public class FutureBet extends BaseBet {
  private static final long serialVersionUID = 1L;

  private String teamId;

  public FutureBet() {

  }

  public FutureBet(String source, Double decimalLine, Double usLine, String teamId) {
    super(source, BetTypeEnum.FUTURE, decimalLine, usLine);
    this.teamId = teamId;
  }

  public String getTeamId() {
    return teamId;
  }

  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((teamId == null) ? 0 : teamId.hashCode());
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
    FutureBet other = (FutureBet) obj;
    if (teamId == null) {
      if (other.teamId != null)
        return false;
    } else if (!teamId.equals(other.teamId))
      return false;
    return true;
  }
}
