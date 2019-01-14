# PDP_Newton


A particle is a small rigid body that obeys Newton’s laws of motion. It has an initial state, and it is possible to compute its state at a given time by applying Newton’s laws. The  Particle interface provided to you summarizes the operations expected from this particle. Please generate Javadoc for it to read its comments.

At time t, Newton’s laws of motion state that the displacement of this particle (from its position at time 0) is given by:
??=????+12????2
where

?? is the displacement.

?? is the velocity of the particle at time ??=0.

?? is the acceleration.

To apply this equation in 2D we apply it separately for each dimension.

Write a class named SimpleProjectile that implements the Particle interface. This class will represent a simple Newtonian particle. It has an initial position (x,y) and an initial velocity (vx,vy). Implement the required methods, keeping in mind the following constraints specific to this implementation:

This particle is only under the influence of gravity. That is, it is under a vertical acceleration of 9.81??/??2.

For any negative time, it stays at its initial position.

The initial y-coordinate of its position is treated as the ground level. Therefore when gravity pulls the particle to this level, the particle “rests” at its new position on the ground for all subsequent times. For example, if a particle started at (0,0) with an initial vertical velocity of 10m/s, then it will fall to the ground at time t=2.0387s to the position of (0,0) and will stay there for all subsequent times.

In addition this class should have a single constructor that takes x and y coordinates of its initial position and the x and y components of its initial velocity, in that order.

Write tests for this implementation. Submit your work as Lab 1 on the handins server, and work through any style errors and failed tests.