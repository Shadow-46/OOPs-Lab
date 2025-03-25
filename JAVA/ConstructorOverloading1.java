class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    MovieTicket() {
        this.movieName = "Unknown";
        this.seatNumber = 0;
        this.price = 0.0;
        System.out.println("Default Ticket: Movie - " + movieName + " | Seat: " + seatNumber + " | Price: $" + price);
    }

    MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = 10;
        this.price = 12.50;
        System.out.println("Ticket: Movie - " + movieName + " | Seat: " + seatNumber + " | Price: $" + price);
    }

    MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket: Movie - " + movieName + " | Seat: " + seatNumber + " | Price: $" + price);
    }
}

public class ConstructorOverloading1 {
    public static void main(String[] args) {
        MovieTicket t1 = new MovieTicket();
        MovieTicket t2 = new MovieTicket("The Matrix");
        MovieTicket t3 = new MovieTicket("The Matrix Reloaded", 15, 15.50);
    }
}
