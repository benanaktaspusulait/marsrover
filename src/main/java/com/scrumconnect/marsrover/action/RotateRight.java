package com.scrumconnect.marsrover.action;

import com.scrumconnect.marsrover.model.Direction;
import com.scrumconnect.marsrover.model.Point;
import com.scrumconnect.marsrover.model.Position;
import com.scrumconnect.marsrover.model.Rover;

public class RotateRight {

    public static Position rotate(Rover rover) {

        Position position = rover.getPosition();
        Direction direction = position.getDirection();
        Point point = position.getPoint();
        int x = point.getX();
        int y = point.getY();

        switch (direction) {
            case EAST:
                return new Position(new Point(x, y), Direction.SOUTH);
            case WEST:
                return new Position(new Point(x, y), Direction.NORTH);
            case NORTH:
                return new Position(new Point(x, y), Direction.EAST);
            case SOUTH:
                return new Position(new Point(x, y), Direction.WEST);
        }
        return null;
    }
}
