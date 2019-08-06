import java.util.ArrayList;
public class Run
{
    public static void main(String[] args)
    {
        ArrayList<Building>buildings=new ArrayList<Building>();

        Location l1=new Location();
        Building b1=new Building("House# 855",250,15,l1);

        l1.setLocation(33.5,42);
        b1.setBuildingLocation(l1);
        Location l2=new Location();
        Building b2=new Building("House# 297",400,20,l2);

        l2.setLocation(34,44);
        b2.setBuildingLocation(l2);

        buildings.add(b1);
        buildings.add(b2);

        for(Building a:buildings)
        {
            if(a.getRegisterationStatus()==true)
                System.out.println(a.getName()+" is registered.");
            else
                System.out.println(a.getName()+"is not registered.");
        }
        System.out.println("Total Buildings: "+b1.getTotalBuildings());
    }
}

