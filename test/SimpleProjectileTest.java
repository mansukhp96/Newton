import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleProjectileTest {

  private SimpleProjectile sp;

  @Before
  public void setUp() {

    sp = new SimpleProjectile(2.0f, -1.0f, 1.00f, 0);

  }

  @Test
  public void testTimeOne() {
    assertEquals("At time 1.00: position is (3.00,6.09)", sp.getState(1f));
  }

  @Test
  public void testTimeZero() {
    assertEquals("At time 0.00: position is (2.00,1.00)", sp.getState(0.00f));
  }

  @Test
  public void testTimeNeg() {
    assertEquals("At time -2.00: position is (2.00,1.00)", sp.getState(-2.0f));
  }

  @Test
  public void testTimeMax() {
    assertEquals("At time 2.04: position is (4.04,1.00)", sp.getState(2.04f));
  }

  @Test
  public void testFixedAfterHit() {
    assertEquals("At time 10.00: position is (4.04,1.00)", sp.getState(10f));
  }

  @Test
  public void testNegXMaxTime() {
    assertEquals("At time 10.00: position is (0.04,1.00)", sp.getState(10f));
  }

  @Test
  public void testNegYMaxTime() {
    assertEquals("At time 10.00: position is (4.04,-1.00)", sp.getState(10f));
  }

  @Test
  public void testNegXVelocityMaxTime() {
    assertEquals("At time 10.00: position is (-0.04,1.00)", sp.getState(10f));
  }
}