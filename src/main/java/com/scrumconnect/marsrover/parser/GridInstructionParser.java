package com.scrumconnect.marsrover.parser;

import com.scrumconnect.marsrover.model.Grid;

public class GridInstructionParser {

    public static Grid parseGrid(String instruction) {
        String[] coordinates = instruction.split(" ");
        return new Grid(Integer.parseInt(coordinates[0]), Integer.parseInt(coordinates[1]));
    }

}
