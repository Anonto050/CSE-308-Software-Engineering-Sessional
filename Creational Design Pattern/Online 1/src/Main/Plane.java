package Main;

import Engine.Engines;
import Wing.Wing;

public interface Plane {
   Engines getEngine();
   Wing getWing();
   void print();
}
