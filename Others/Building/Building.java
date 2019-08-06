public class Building {
    private String Name;
    private int Height;
    private int numFloors;
    private Location buildingLocation;
    private static int totalBuilding;

    Building(String Name,int Height,int numFloors,Location buildingLocation)
    {
        this.buildingLocation=buildingLocation;
        this.Name=Name;
        this.Height=Height;
        this.numFloors=numFloors;
        buildingLocation.latitude=20.5;
        buildingLocation.longitude=50.0;
        ++totalBuilding;
    }
    static
    {
        totalBuilding=0;
    }

    public boolean getRegisterationStatus()
    {
        boolean status=true;
        if(Height<300&&numFloors<=20)
            return status;
        else if(Height>300&&numFloors>25&&numFloors<40)
            return status;
        else if(buildingLocation.latitude>30&&buildingLocation.latitude<35&&buildingLocation.longitude>40&&buildingLocation.longitude<45)
            return status;
        else
            status=false;
        return status;
    }


    public void setBuildingLocation(Location buildingLocation)
    {
        this.buildingLocation=buildingLocation;
    }


    public int getTotalBuildings()
    {
        return totalBuilding;
    }

    public String getName()
    {
        return Name;
    }
}
