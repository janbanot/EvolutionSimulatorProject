package agh.cs.oop;

//TO DO: descriptions and comments in the way shown below
// /**
// * Description
// */

public class World {

    public static void main(String[] args) {
        String[] arguments = {"f", "b", "r", "l", "f", "f", "r", "r", "f", "f", "f", "f", "f", "f", "f", "f"};

        MoveDirection[] directions = new OptionsParser().parse(arguments);
        RectangularMap map = new RectangularMap(10, 5);
        Vector2d[] positions = { new Vector2d(2,2), new Vector2d(3,4) };
        IEngine engine = new SimulationEngine(directions, map, positions);
        engine.run();

//        System.out.println(animal.toString());
//        String[] moveDirections = {"r", "f", "f", "f"};
//        MoveDirection[] moveSequence = OptionsParser.parse(moveDirections);
//        for (MoveDirection move : moveSequence) {
//            animal.move(move, map);
//        }
//        System.out.println(animal.toString());
        System.out.println(map.toString());
    }
}