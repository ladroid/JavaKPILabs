public class Task extends House {
    private Integer numberFloors;
    private Integer houseSquare;
    private String rooms;
    private Integer roomSquare;
    private String material;
    private String colorWalls;

    @Override
    public void setNumberFloors(Integer numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public void setHouseSquare(Integer houseSquare) {
        this.houseSquare = houseSquare;
    }

    @Override
    public void setRooms(String rooms) {
        this.rooms = rooms;
    }

    @Override
    public void setRoomSquare(Integer roomSquare) {
        this.roomSquare = roomSquare;
    }

    @Override
    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void setColorWalls(String colorWalls) {
        this.colorWalls = colorWalls;
    }

    @Override
    public Integer getNumberFloors() {
        return numberFloors;
    }

    @Override
    public Integer getHouseSquare() {
        return houseSquare;
    }

    @Override
    public String getRooms() {
        return rooms;
    }

    @Override
    public Integer getRoomSquare() {
        return roomSquare;
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public String getColorWalls() {
        return colorWalls;
    }
}
