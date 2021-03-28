package com.wd.model.bet;

public enum BetTypeEnum {
  SPREAD("Spread"), ML("ML"), OVER_UNDER("Over/Under"), PARLAY("Parlay"), TEASER("Teaser"), FUTURE("Future"),
  PROP("Prop");

  private String label;
  private boolean active;

  private BetTypeEnum(String label) {
    this.label = label;
    this.active = true;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public boolean isActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }
}
