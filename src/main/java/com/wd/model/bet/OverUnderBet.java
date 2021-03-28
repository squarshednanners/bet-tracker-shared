package com.wd.model.bet;

public class OverUnderBet extends BaseBet {

  private static final long serialVersionUID = 1L;
  private Double points;
  private OverUnderTypeEnum overUnder;

  public OverUnderBet() {

  }

  public OverUnderBet(String source, Double decimalLine, Double usLine, Double points, OverUnderTypeEnum overUnder) {
    super(source, BetTypeEnum.OVER_UNDER, decimalLine, usLine);
    this.points = points;
    this.overUnder = overUnder;
  }

  public Double getPoints() {
    return points;
  }

  public void setPoints(Double points) {
    this.points = points;
  }

  public OverUnderTypeEnum getOverUnder() {
    return overUnder;
  }

  public void setOverUnder(OverUnderTypeEnum overUnder) {
    this.overUnder = overUnder;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((overUnder == null) ? 0 : overUnder.hashCode());
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
    OverUnderBet other = (OverUnderBet) obj;
    if (overUnder != other.overUnder)
      return false;
    return true;
  }

}
