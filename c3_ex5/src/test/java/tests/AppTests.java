package tests;

import config.ProjectConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import beans.Fighter;
import beans.SportsPromotion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {ProjectConfig.class})
public class AppTests {

  @Autowired
  private ApplicationContext context;

  @Test
  @DisplayName("Test that a Fighter instance named Superlek has been added to the Spring context")
  public void testSuperlekIsInTheSpringContext() {
    Fighter p = context.getBean("fighter1", Fighter.class);

    assertEquals("Superlek", p.getName());
  }

  @Test
  @DisplayName("Test that a Fighter instance named Rodtang has been added to the Spring context")
  public void testRodtangIsInTheSpringContext() {
    Fighter p = context.getBean("fighter2", Fighter.class);

    assertEquals("Rodtang", p.getName());
  }

  @Test
  @DisplayName("Test that a SportsPropmotion instance has been added to the Spring context")
  public void testONEChampIsInTheSpringContext() {
    SportsPromotion p = context.getBean(SportsPromotion.class);

    assertEquals("ONE Championship", p.getName());
  }

  @Test
  @DisplayName("Test that the Sports Promotion instance in the Spring context" +
          "owns the Fighter instance named Rodtang from the Spring context")
  public void testONEownsRodtang() {
    SportsPromotion p = context.getBean(SportsPromotion.class);

    assertNotNull(p.getFighter());
    assertEquals("Rodtang", p.getFighter().getName());
  }
}
