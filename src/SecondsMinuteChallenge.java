public class SecondsMinuteChallenge {

    public static void main(String[] args) {

        System.out.println(getDurationString(-6956));
        System.out.println(getDurationString(-115,656));
        
    }

    public static String getDurationString(int sec){
        // Two Step approach
        int minutes = sec / 60;

/*        int minutes = sec / 60;
        int hrs = minutes / 60;
        System.out.println("hours = " + hrs);

        int remainingMin = minutes % 60;
        System.out.println("Total Minutes = "+ minutes);
        System.out.println("Remaining Minutes = " + remainingMin);

        int remainingSec = sec %60;
        System.out.println("Remaining Seconds = "+remainingSec);*/

        return getDurationString(minutes,sec);

    }

    public static String getDurationString(int minutes, int sec){
        int hrs = minutes / 60;
        int remainingMin = minutes % 60;
        int remainingSec = sec %60;
        return hrs + "h " + remainingMin+"m "+remainingSec+"s";
    }


}
