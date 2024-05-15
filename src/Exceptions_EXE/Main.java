package Exceptions_EXE;
public class Main {
    public static void main(String[] args) throws HouseException, BuildingException {
        House[] houses = new House[2];
        try {
            houses[0] = new House(1000, 250, "adfasf", 5, "Ivan");
            houses[1] = new House(750, 150, "adfasf", 10, "Nati");
        } catch (BuildingException e) {
            throw new RuntimeException(e);
        } catch (HouseException e) {
            throw new RuntimeException(e);
        }

        for(House house : houses){
            System.out.println(house);
        }

        System.out.println("\n");
        House biggestHouse = House.mostBig(houses);
        System.out.println("The biggest house is " + biggestHouse);
    }
}
