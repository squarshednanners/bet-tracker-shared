package com.wd.model.bet;

import java.io.Serializable;

public class BaseBet implements Serializable {
  private static final long serialVersionUID = 1L;
  private String source;
  private BetTypeEnum bet;
  private Double decimalLine;
  private Double usLine;

  public BaseBet() {

  }

  public BaseBet(String source, BetTypeEnum bet, Double decimalLine, Double usLine) {
    this.source = source;
    this.bet = bet;
    this.decimalLine = decimalLine;
    this.usLine = usLine;
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public BetTypeEnum getBet() {
    return bet;
  }

  public void setBet(BetTypeEnum bet) {
    this.bet = bet;
  }

  public Double getDecimalLine() {
    return decimalLine;
  }

  public void setDecimalLine(Double decimalLine) {
    this.decimalLine = decimalLine;
  }

  public Double getUsLine() {
    return usLine;
  }

  public void setUsLine(Double usLine) {
    this.usLine = usLine;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((bet == null) ? 0 : bet.hashCode());
    result = prime * result + ((source == null) ? 0 : source.hashCode());
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
    BaseBet other = (BaseBet) obj;
    if (bet != other.bet)
      return false;
    if (source == null) {
      if (other.source != null)
        return false;
    } else if (!source.equals(other.source))
      return false;
    return true;
  }

}
