package tasks;

public class House {
    private Integer numberFloors;
    private Integer houseSquare;
    private String rooms;
    private Integer roomSquare;
    private String material;
    private String colorWalls;

    public void setNumberFloors(Integer numberFloors) {
        this.numberFloors = numberFloors;
    }

    public void setHouseSquare(Integer houseSquare) {
        this.houseSquare = houseSquare;
    }

    public void setRooms(String rooms) {
        this.rooms = rooms;
    }

    public void setRoomSquare(Integer roomSquare) {
        this.roomSquare = roomSquare;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColorWalls(String colorWalls) {
        this.colorWalls = colorWalls;
    }

    public Integer getNumberFloors() {
        return numberFloors;
    }

    public Integer getHouseSquare() {
        return houseSquare;
    }

    public String getRooms() {
        return rooms;
    }

    public Integer getRoomSquare() {
        return roomSquare;
    }

    public String getMaterial() {
        return material;
    }

    public String getColorWalls() {
        return colorWalls;
    }
}
