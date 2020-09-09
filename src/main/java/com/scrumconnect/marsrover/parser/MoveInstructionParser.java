package com.scrumconnect.marsrover.parser;

import com.scrumconnect.marsrover.model.Direction;
import com.scrumconnect.marsrover.model.Point;
import com.scrumconnect.marsrover.model.Position;

public class MoveInstructionParser {

    public static Position parsePosition(String positionString) {

        String[] positionArray = positionString.split(" ");
        int xCoordinate = Integer.parseInt(positionArray[0]);
        int yCoordinate = Integer.parseInt(positionArray[1]);
        Direction direction = Direction.get(positionArray[2]);
        return new Position(new Point(xCoordinate, yCoordinate), direction);
    }
}
