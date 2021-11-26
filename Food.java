package astrobleme.logic;

import javafx.scene.paint.Color;

/**
 * A simple class to represent food that takes up only one square.
 *
 * @author Slava Grishin
 * @version 26.11.2021
 */
public class Food {
    public static final Color COLOR = Color.ROSYBROWN;

    private Point point;

    Food(Point point) {
        this.point = point;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }
}