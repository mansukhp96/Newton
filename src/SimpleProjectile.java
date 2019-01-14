public class SimpleProjectile implements Particle {

  public float x;
  public float y;
  public float ay = 9.81f;
  public float ax = 0f;
  public float vx;
  public float vy;

  /**
   * Constructs a SimpleProjectile object and initializes it to x, y, vx and vy.
   *
   * @param x  Axis X Coordinate
   * @param y  Axis Y Coordinate
   * @param vx velocity along x-axis
   * @param vy velocity along y-axis
   */

  //default constructor taking 4 params
  public SimpleProjectile(float x, float y, float vx, float vy) {
    this.x = x;
    this.y = y;
    this.vx = vx;
    this.vy = vy;
  }

  @Override
  public String getState(float time) { //x component and y component displacement

    float timeNew = 0; //to fix the time change in the string

    if (time > 0) { // when time is positive
      float ny = y + (vy * time) + (0.5f * -ay * (time * time)); // Y- component calc.
      if (ny <= y) { //After hitting ground to fix x and y
        timeNew = time;
        ny = y;
        time = (2 * vy / ay); // Time to hit the ground.
        float nx = x + (vx * time) + (0.5f * -ax * (time * time)); // X - when already hit ground.
      }

      float nx = x + (vx * time) + (0.5f * -ax * (time * time)); // X - component calc.

      if (timeNew != 0) { //print timeNew in string in stop x case
        String str =
                String.format(
                        "At time " + "%.2f" + ": position is (" + "%.2f" + "," + "%.2f" + ")",
                        timeNew, nx, ny);
        return str;
      } else if (timeNew == 0) { //print time from interface in case of all other cases
        String str =
                String.format(
                        "At time " + "%.2f" + ": position is (" + "%.2f" + "," + "%.2f" + ")",
                        time, nx, ny);
        return str;
      }
    } else if (time <= 0) { //for negative time

      float nx = x;
      float ny = y;

      String str =
              String.format(
                      "At time " + "%.2f" + ": position is (" + "%.2f" + "," + "%.2f" + ")",
                      time, nx, ny);
      return str;
    }
    return toString(); //return the final string
  }
}