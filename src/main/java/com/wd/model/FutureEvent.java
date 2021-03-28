package com.wd.model;

public class FutureEvent extends BaseEvent {
  private static final long serialVersionUID = 1L;
  private String eventName;

  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((eventName == null) ? 0 : eventName.hashCode());
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
    FutureEvent other = (FutureEvent) obj;
    if (eventName == null) {
      if (other.eventName != null)
        return false;
    } else if (!eventName.equals(other.eventName))
      return false;
    return true;
  }

}
