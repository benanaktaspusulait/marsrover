package com.scrumconnect.marsrover.model;

import com.scrumconnect.marsrover.action.MoveForward;
import com.scrumconnect.marsrover.action.RotateLeft;
import com.scrumconnect.marsrover.action.RotateRight;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Rover {

    private Grid grid;
    private Position position;

    public Rover(Grid grid, Position position) {
        this.grid = grid;
        this.position = position;
        grid.loadRover(this);
    }

    public void rotateLeft() {
        this.position = RotateLeft.rotate(this);
    }

    public void rotateRight() {
        this.position = RotateRight.rotate(this);
    }

    public void moveForward() {
        Position position = MoveForward.move(this);
        grid.emptyRover(this);
        this.position = position;
    }

    public void process(String instructions) {
        instructions.chars().mapToObj(c -> (char) c).forEach(this::process);
    }

    private void process(Character instruction) {
        switch (instruction) {
            case 'R':
                rotateRight();
                break;
            case 'L':
                rotateLeft();
                break;
            case 'M':
                moveForward();
                break;
        }
    }

}
