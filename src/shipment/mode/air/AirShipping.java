package shipment.mode.air;

public abstract class AirShipping {

    public abstract String getMode();

    public abstract String getDeliveryTime();

    public static void printShippingStages() {
        System.out.println("- Receiving package at the origin office");
        System.out.println("- Labeling package for shipping");
        System.out.println("- Putting package in a plane");
        System.out.println("- Flying to destination");
        System.out.println("- Delivering to the destination office");
        System.out.println("- Receiving package at destination office");
    }
}