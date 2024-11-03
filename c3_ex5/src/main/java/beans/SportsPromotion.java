package beans;

import org.springframework.stereotype.Component;

@Component
public class SportsPromotion {

  private String name = "ONE Championship";

  private final Fighter fighter;

  public SportsPromotion(Fighter fighter2) {
    this.fighter = fighter2;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Fighter getFighter() {
    return fighter;
  }

}
