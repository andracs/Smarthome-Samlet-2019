package Laila2;

public class Doorlock {

    String user;
    String user0;
    String user1 = "250158";
    String user2 = "495002";
    String user3 = "825709";

    public boolean validate(String doorLockUser, String doorLockPass, String temp) {
        boolean access = false;

        // hvordan tjekker jeg om inputbruger matcher variabelbruger? Svar fundet på w3schools
        switch(doorLockUser) {
            case "user0":
                this.user = temp;
                break;
            case "user1":
                this.user = user1;
                break;
            case "user2":
                this.user = user2;
                break;
            case "user3":
                this.user = user3;
                break;
        }

        if (user.equals(doorLockPass)){
            access = true;
        }
        return access;
    }

}
