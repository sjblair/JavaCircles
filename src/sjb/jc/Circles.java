package sjb.jc;

import processing.core.*;

import java.util.ArrayList;

public class Circles extends PApplet {

    PImage image;
    boolean dark = true;
    ArrayList<Circle> circles;
    Averager averager;

    public static String img;
    public static String saveName;

    public void setup() {
        image = loadImage(img);
        image.resize(600, 0);
        size(image.width, image.height);

        ellipseMode(CENTER);
        noStroke();
        smooth();

        reset();
    }

    void reset() {
        circles = new ArrayList();
        averager = new Averager(20);
        background(dark ? 0 : 255);
    }

    public void draw() {
        for (int i = 0; i < 10; i++) {
            drawRandomCircle();
            if (averager.average() > 100) {
                //save("7.dark.png");
                //reset();
                noLoop();
                save(saveName);
                println("Done!");
                break;
            }
        }
    }

    void drawRandomCircle() {
        Circle circ;
        int tries = 0;
        do {
            int x = floor(random(width));
            int y = floor(random(height));

            int c = image.get(x, y);
            float val = brightness(c);

            tries++;
            float circleSize = dark ?
                    map(val, 255, 0, 1, 60) :
                    map(val, 0, 255, 1, 60);
            circ = new Circle(x, y, c, circleSize);
        }
        while (overlaps (circ));

        averager.record(tries);

        circles.add(circ);
        circ.draw();
    }

    boolean overlaps(Circle c) {
        for (Circle other : circles) {
            if (c.overlaps(other)) {
                return true;
            }
        }
        return false;
    }

    class Circle {
        int x;
        int y;
        int c;
        float diameter;

        Circle(int x, int y, int c, float diameter) {
            this.x = x;
            this.y = y;
            this.c = c;
            this.diameter = diameter;
        }

        boolean overlaps(Circle other) {
            return dist(x, y, other.x, other.y) < max(diameter, other.diameter);
        }

        void draw() {
            fill(c);
            ellipse(x, y, diameter, diameter);
        }
    }

    class Averager {
        float[] values;
        int index = 0;
        Averager(int length) {
            values = new float[length];
        }

        void record(float value) {
            values[index] = value;
            index = (index + 1) % values.length;
        }

        float average() {
            float sum = 0;
            for (float val : values) {
                sum += val;
            }
            return sum / values.length;
        }
    }


}
