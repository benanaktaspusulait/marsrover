package com.scrumconnect.marsrover.action;

import com.scrumconnect.marsrover.model.Direction;
import com.scrumconnect.marsrover.model.Point;
import com.scrumconnect.marsrover.model.Position;
import com.scrumconnect.marsrover.model.Rover;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MoveForward {

    public static Position move(Rover rover) {

        Position position = rover.getPosition();
        Point point = position.getPoint();
        Direction direction = position.getDirection();
        int x = point.getX();
        int y = point.getY();

        switch (direction) {
            case EAST:
                return new Position(new Point(x + 1, y), direction);
            case WEST:
                return new Position(new Point(x - 1, y), direction);
            case NORTH:
                return new Position(new Point(x, y + 1), direction);
            case SOUTH:
                return new Position(new Point(x, y - 1), direction);
            default:
                throw new IllegalStateException("Unknown Direction");
        }
    }
}
