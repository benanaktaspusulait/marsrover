package com.scrumconnect.marsrover.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Position {

    private Point point;
    private Direction direction;

    @Override
    public String toString() {
        return point + " " + Direction.toString(direction);
    }
}
