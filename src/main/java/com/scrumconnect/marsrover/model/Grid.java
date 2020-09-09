package com.scrumconnect.marsrover.model;

import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Data
@ToString
public class Grid {

    private List<Cell> cellList;
    private int x;
    private int y;

    public Grid(int x, int y) {
        this.x = x;
        this.y = y;
        initCells();
    }

    public void initCells() {
        cellList = new ArrayList<>();
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {
                cellList.add(new Cell(new Point(i, j)));
            }
        }
    }

    public  void loadRover(Rover rover) {
        Optional<Cell> cellOptional = findCell(rover);
        if (cellOptional == null) return;
        Cell cell = cellOptional.get();
        cell.setRover(rover);
    }
    public  void emptyRover(Rover rover) {
        Optional<Cell> cellOptional = findCell(rover);
        if (cellOptional == null) return;
        Cell cell = cellOptional.get();
        cell.setRover(null);
    }

    private Optional<Cell> findCell(Rover rover) {
        Position position = rover.getPosition();
        Optional<Cell> cellOptional = this.getCellList().stream().
                filter(p -> p.getPoint().equals(position.getPoint())).findFirst();
        if (!cellOptional.isPresent()) {
            return null;
        }
        return cellOptional;
    }

}
