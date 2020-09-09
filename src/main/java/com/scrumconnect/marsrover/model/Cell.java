package com.scrumconnect.marsrover.model;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@ToString
@RequiredArgsConstructor
public class Cell {
    private @NonNull Point point;
    private Rover rover;

}
