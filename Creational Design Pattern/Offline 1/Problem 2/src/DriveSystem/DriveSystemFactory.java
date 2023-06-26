package DriveSystem;

public class DriveSystemFactory {
    DriveSystem driveSystem;

    public DriveSystemFactory(){}

    public DriveSystem getDriveSystem(String opt){

        if(opt.equalsIgnoreCase("Rear wheel"))
            driveSystem = new Rear_wheel();
        else if(opt.equalsIgnoreCase("All wheel"))
            driveSystem = new All_wheel();
        return driveSystem;
    }

}
