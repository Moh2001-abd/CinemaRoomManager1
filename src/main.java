import java.util.Scanner;

public class main {

    // initialize the seats objects
    static Seats[][] seats = new Seats[7][8];

    public static void main(String[] args) {
        for(int i = 0; i < 7; i++) {
            for (int j = 0; j < 8; j++) {
                seats[i][j] = new Seats(false, i + 1);
            }
        }

        while (true){

            System.out.println("1.To show the seats menu.");
            System.out.println("2.To Book a seat.");
            System.out.println("3.To show the total profit.");
            System.out.println("4.To show the seat prices.");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    displaySeats();
                    break;
                case 2:
                    displaySeats();
                    System.out.println("Enter the row and column number of the seat you want to book");
                    int row = sc.nextInt();
                    int column = sc.nextInt();
                    if (seats[row-1][column-1].getStatus() == false){
                        System.out.println("Seat Price is: "+seats[row-1][column-1].getPrice() + "$" +
                                "\nDo you want to book this seat? (yes/no)");
                        String answer = sc.next();
                        if (answer.equals("yes")){
                            seats[row-1][column-1].bookSeat();
                            System.out.println("Seat is booked successfully");
                        }
                        if (answer.equals("no")){
                            System.out.println("Seat booking has been canceled!");
                        }
                    }
                    else {
                        System.out.println("Seat is already booked");
                    }
                    break;
                case 3:
                    System.out.println("Total profit is: "+Seats.totalProfit);
                    break;
                case 4:
                    showPrices();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    // this method for printing simulation of the cinema seats
    public static void displaySeats(){
        System.out.println("  1 2 3 4 5 6 7 8 ");
        for (int i = 0; i < 7; i++) {
            System.out.print(i+1+" ");
            for (int j = 0; j < 8; j++) {
                if (seats[i][j].getStatus() == false ){
                    System.out.print("S ");
                }
                else {
                    System.out.print("B ");
                }
            }
            System.out.println();
        }
    }

    //show the seat's prices
    public static void showPrices(){
        for (int i = 0; i < 7; i++) {
            System.out.print(i+1+" ");
            for (int j = 0; j < 8; j++) {

                System.out.print(seats[i][j].getPrice()+"$  ");

            }
            System.out.println();
        }
    }
}