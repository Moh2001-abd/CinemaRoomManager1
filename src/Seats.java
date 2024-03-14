public class Seats {

    public static int totalProfit = 0;
    private int price;
    private boolean bookstatus;
    // seatRow is the row number of the seat in the cinema room
    //it is important set the price of the seat based on the nearness to the screen
    private int seatRow;

    public Seats(boolean bookstatus, int seatRow) {
        this.bookstatus = bookstatus;
        this.seatRow = seatRow;
        // we have 3 categories of seats
        //1. Row 1 and 2 are VIP seats of cost 10$
        //2. Row 3 and 4 are Standard seats of cost 6.5$
        //3. Row 5 to 7 are Economy seats of cost 4$

        if (seatRow == 1 || seatRow == 2) {
            price = 10;
        } else if (seatRow == 3 || seatRow == 4) {
            price = 6;
        } else {
            price = 4;
        }
    }

    public void bookSeat() {
        bookstatus = true;
        totalProfit += price;
    }

    public boolean getStatus(){
        return bookstatus;
    }

    public int getPrice(){
        return price;
    }



}
