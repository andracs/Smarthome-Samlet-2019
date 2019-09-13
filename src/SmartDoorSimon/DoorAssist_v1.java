package SmartDoorSimon;

public class DoorAssist_v1 {
    int distance; //afstand i cm
    int timeToClose; //sekunder det tager at lukke døren. Så hvor hurtigt den smækker i
    boolean isClosed; //check om dør er lukket
    String name; //navn af døren, som er forbundet i systemet

    //constructor tager 4 argumenter
    public DoorAssist_v1(String name, int distance, int timeToClose, boolean isClosed){
        this.name = name;
        this.distance = distance;
        this.timeToClose = timeToClose;
        this.isClosed = isClosed;
    }

    public String getName(){
        return name;
    }

    //lukker døren hvis den er åben
    void close(){
        if(!isClosed && distance>0){
            System.out.println("----------------------------------------------------------------------------");
            System.out.println(name+" Door Status: closed = "+isClosed+". Distance from closed condition: "+distance);
            System.out.println("now closing door");
            distance = 0;
            isClosed = true;
            System.out.println(name+" Door Status: closed = "+isClosed+". Distance from closed condition: "+distance);
        }
    }

    public static void main(String[] args) {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Welcome to Door Assist 1.1! This app can close all the doors within the list.");
        DoorAssist_v1 da1 = new DoorAssist_v1("DA1",10, 5, false);//opretter DA med construtor, hvor døren er åben
        DoorAssist_v1 da2 = new DoorAssist_v1("DA2",0, 5, true);//opretter DA med construtor, hvor døren er lukket
        DoorAssist_v1 da3 = new DoorAssist_v1("DA3",5, 5, false);//opretter DA med construtor, hvor døren er åben
        DoorAssist_v1[] arr = new DoorAssist_v1[3]; //opretter array med døre, som er forbundet til appen. der er 3 ledige pladser {0,1,2}
        arr[0] = da1; //tilføjer en dør på plads 0 i array "arr".
        arr[1] = da2;
        arr[2] = da3;
        for (int i=0; i<arr.length; i++){ //for alle DoorAssister i arr køre close()
            if (!arr[i].isClosed) {
                arr[i].close();
            } else {
                System.out.println("----------------------------------------------------------------------------");
                System.out.println("Door: "+ arr[i].getName() +" is already closed");
            }
        }
        System.out.println("----------------------------------------------------------------------------");
    }
}
