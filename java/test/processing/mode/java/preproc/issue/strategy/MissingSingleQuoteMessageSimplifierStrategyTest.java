package processing.mode.java.preproc.issue.strategy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import processing.mode.java.preproc.issue.IssueMessageSimplification;
import processing.mode.java.preproc.issue.strategy.MissingSingleQuoteMessageSimplifierStrategy;

import java.util.Optional;

public class MissingSingleQuoteMessageSimplifierStrategyTest {

  private processing.mode.java.preproc.issue.strategy.MissingSingleQuoteMessageSimplifierStrategy strategy;

  @Before
  public void setup() {
    strategy = new MissingSingleQuoteMessageSimplifierStrategy();
  }

  @Test
  public void testPresent() {
    Optional<IssueMessageSimplification> msg = strategy.simplify("char x = '");
    Assert.assertTrue(msg.isPresent());
  }

  @Test
  public void testNotPresent() {
    Optional<IssueMessageSimplification> msg = strategy.simplify("char x = '\\''");
    Assert.assertTrue(msg.isEmpty());
  }

}