package programs.clock;

import java.util.Scanner;

class Clock {
    // Instance variables
    private int hours;    // Range: 0 - 23
    private int minutes;  // Range: 0 - 59
    private int seconds;  // Range: 0 - 59

    // Default constructor
    public Clock() {
        this.hours = 12;
        this.minutes = 0;
        this.seconds = 0;
    }

    // Constructor with hours, minutes, and seconds parameters
    public Clock(int hours, int minutes, int seconds) {
        setTime(hours, minutes, seconds);
    }

    // Constructor with seconds since midnight parameter
    public Clock(int secondsSinceMidnight) {
        setClock(secondsSinceMidnight);
    }

    // Method to set the time (helper method used by constructors)
    private void setTime(int hours, int minutes, int seconds) {
        // Validate and set hours
        if (hours >= 0 && hours <= 23) {
            this.hours = hours;
        } else {
            throw new IllegalArgumentException("Invalid hours. Hours must be between 0 and 23.");
        }

        // Validate and set minutes
        if (minutes >= 0 && minutes <= 59) {
            this.minutes = minutes;
        } else {
            throw new IllegalArgumentException("Invalid minutes. Minutes must be between 0 and 59.");
        }

        // Validate and set seconds
        if (seconds >= 0 && seconds <= 59) {
            this.seconds = seconds;
        } else {
            throw new IllegalArgumentException("Invalid seconds. Seconds must be between 0 and 59.");
        }
    }

    // Method to set the time using seconds since midnight
    public void setClock(int secondsSinceMidnight) {
        int hours = secondsSinceMidnight / 3600;
        int remainingSeconds = secondsSinceMidnight % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;
        setTime(hours, minutes, seconds);
    }

    // Getters for hours, minutes, and seconds
    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    // Setters for hours, minutes, and seconds
    public void setHours(int hours) {
        if (hours >= 0 && hours <= 23) {
            this.hours = hours;
        } else {
            throw new IllegalArgumentException("Invalid hours. Hours must be between 0 and 23.");
        }
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes <= 59) {
            this.minutes = minutes;
        } else {
            throw new IllegalArgumentException("Invalid minutes. Minutes must be between 0 and 59.");
        }
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds <= 59) {
            this.seconds = seconds;
        } else {
            throw new IllegalArgumentException("Invalid seconds. Seconds must be between 0 and 59.");
        }
    }

    // Method to return the time in seconds since midnight
    public int timeInSeconds() {
        return hours * 3600 + minutes * 60 + seconds;
    }

    // Method to advance the time by one second
    public void tick() {
        seconds++;
        if (seconds >= 60) {
            seconds = 0;
            minutes++;
            if (minutes >= 60) {
                minutes = 0;
                hours++;
                if (hours >= 24) {
                    hours = 0;
                }
            }
        }
    }

    // Method to decrement the time by one second
    public void tickDown() {
        if (seconds > 0) {
            seconds--;
        } else {
            seconds = 59;
            if (minutes > 0) {
                minutes--;
            } else {
                minutes = 59;
                if (hours > 0) {
                    hours--;
                } else {
                    hours = 23;
                }
            }
        }
    }

    // Method to add time from another Clock object
    public void addClock(Clock other) {
        int totalSeconds = this.timeInSeconds() + other.timeInSeconds();
        setClock(totalSeconds);
    }

    // Method to subtract time from another Clock object and return the difference as a new Clock object
    public Clock subtractClock(Clock other) {
        int totalSeconds = this.timeInSeconds() - other.timeInSeconds();
        if (totalSeconds < 0) {
            totalSeconds = 24 * 3600 + totalSeconds;  // Wrap around for negative difference
        }
        return new Clock(totalSeconds);
    }

    // Method to display the time in 24-hour format
    public String toString() {
        return String.format("(%02d:%02d:%02d)", hours, minutes, seconds);
    }

}

// Separate class for testing Clock
class ClockDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read seconds since midnight for firstClock
        System.out.print("Enter seconds since midnight for firstClock: ");
        int secondsSinceMidnight = scanner.nextInt();
        Clock firstClock = new Clock(secondsSinceMidnight);

        // Tick the firstClock ten times and print the time after each tick
        for (int i = 0; i < 10; i++) {
            firstClock.tick();
            System.out.println("firstClock after tick " + (i + 1) + ": " + firstClock);
        }

        // Read hours, minutes, and seconds for secondClock
        System.out.print("Enter hours for secondClock: ");
        int hours = scanner.nextInt();
        System.out.print("Enter minutes for secondClock: ");
        int minutes = scanner.nextInt();
        System.out.print("Enter seconds for secondClock: ");
        int seconds = scanner.nextInt();
        Clock secondClock = new Clock(hours, minutes, seconds);

        // Tick the secondClock ten times and print the time after each tick
        for (int i = 0; i < 10; i++) {
            secondClock.tick();
            System.out.println("secondClock after tick " + (i + 1) + ": " + secondClock);
        }

        // Add the secondClock time to firstClock
        firstClock.addClock(secondClock);
        System.out.println("firstClock after adding secondClock: " + firstClock);
        System.out.println("secondClock: " + secondClock);

        // Subtract secondClock from firstClock
        Clock thirdClock = firstClock.subtractClock(secondClock);
        System.out.println("thirdClock (difference between firstClock and secondClock): " + thirdClock);
    }
}
