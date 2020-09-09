package com.scrumconnect.marsrover;

import com.scrumconnect.marsrover.model.Grid;
import com.scrumconnect.marsrover.model.Rover;
import com.scrumconnect.marsrover.parser.GridInstructionParser;
import com.scrumconnect.marsrover.parser.MoveInstructionParser;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

@Slf4j
public class Main {

    public static void main(String[] args) {
        ArrayList<Rover> rovers = new ArrayList<>();
        Grid grid = GridInstructionParser.parseGrid("5 5");
        Rover rover = new Rover(grid, MoveInstructionParser.parsePosition("1 2 N"));
        rovers.add(rover);
        rover.process("LMLMLMLMM");

        Rover rover2 = new Rover(grid, MoveInstructionParser.parsePosition("3 3 E"));
        rover2.process("MMRMMRMRRM");
        rovers.add(rover2);

        rovers.forEach(r -> System.out.println(r.getPosition()));
    }
}
