package com.scrumconnect.marsrover.model;

public enum Direction {

    EAST, WEST, NORTH, SOUTH;

    public static Direction get(String directionSign) {
        switch (directionSign) {
            case "E":
                return EAST;
            case "W":
                return WEST;
            case "N":
                return NORTH;
            case "S":
                return SOUTH;
            default:
                throw new IllegalStateException("Unknown Direction Sign");
        }
    }
    public static String toString(Direction direction){

        switch (direction) {
            case EAST:
                return "E";
            case WEST:
                return "W";
            case NORTH:
                return "N";
            case SOUTH:
                return "S";
            default:
                throw new IllegalStateException("Unknown Direction Sign");
        }
    }


}
