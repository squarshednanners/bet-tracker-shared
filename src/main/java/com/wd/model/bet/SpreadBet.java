package com.wd.model.bet;

public class SpreadBet extends Bet {

  private static final long serialVersionUID = 1L;
  private Double spread;

  public SpreadBet() {

  }

  public SpreadBet(String source, TeamBetTypeEnum team, Double decimalLine, Double usLine, Double spread) {
    super(source, BetTypeEnum.SPREAD, team, decimalLine, usLine);
    this.spread = spread;
  }

  public Double getSpread() {
    return spread;
  }

  public void setSpread(Double spread) {
    this.spread = spread;
  }

}
