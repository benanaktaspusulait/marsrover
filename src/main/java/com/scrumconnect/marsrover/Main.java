package com.scrumconnect.marsrover;

import com.scrumconnect.marsrover.model.Grid;
import com.scrumconnect.marsrover.model.Rover;
import com.scrumconnect.marsrover.parser.GridInstructionParser;
import com.scrumconnect.marsrover.parser.MoveInstructionParser;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Scanner;

@Slf4j
public class Main {

    public static void main(String[] args) {
        ArrayList<Rover> rovers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Grid grid = GridInstructionParser.parseGrid(scanner.nextLine());
        while(scanner.hasNext()) {
            Rover rover = new Rover(grid, MoveInstructionParser.parsePosition(scanner.nextLine()));
            rovers.add(rover);
            rover.process(scanner.nextLine());
        }
        rovers.forEach(r -> System.out.println(r.getPosition()));
    }
}
