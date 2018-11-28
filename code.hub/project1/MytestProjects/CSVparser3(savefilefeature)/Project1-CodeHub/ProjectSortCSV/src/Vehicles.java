public class Vehicles  {

    String ownerName;
    String plateNumber;
    static int x;

    public Vehicles(String ownerName, String plateNumber) {
        this.ownerName = ownerName;
        this.plateNumber = plateNumber;
        System.out.println(++x);

    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public int Compare(Vehicles d, Vehicles d1) {
        return d.getPlateNumber().compareTo(d1.getPlateNumber());
    }


}



