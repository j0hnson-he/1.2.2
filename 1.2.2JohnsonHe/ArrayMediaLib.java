public class ArrayMediaLib {
    public static void main(String[] args) {

        String[] sharingFriends = {
                "Johnson",
                "Tiana",
                "Melanie",
                "Willis",
                "David"

        };
        //        for (int i = 0; i < 5; i++)
        //        {
        //            System.out.println(sharingFriends[i]);
        //        }
        //
        //
        //          for (int i = 0; i < sharingFriends.length; i++)
        //        {
        //            System.out.println(sharingFriends[i]);
        //        }

        for (String friend: sharingFriends )
        {
            System.out.println(friend);
        }

        double total = 0.0;
        double average = 0.0;
        int[] daysBtwnPurchase = {2, 5, 1, 2, 4, 2, 1, 3};

        for (int purchaseDay: daysBtwnPurchase )
        {
            System.out.println(purchaseDay);
            total = total + purchaseDay;
        }
        System.out.println("total is: " + total);
        average = total/daysBtwnPurchase.length;
        System.out.println("average is: " + average);

        Song[] topTenSongs = {new Song(),
                new Song("The Twist"),
                new Song("Smooth"),
                new Song("Mack The Knife"),
                new Song("How Do I Live"),
                new Song("Party Rock Anthem"),
                new Song("I Gotta Feeling"),
                new Song("Macarena"),
                new Song("Physical"),
                new Song("You Light Up My Life"),
                new Song("Hey Jude")
        };
        //        for (Song s: topTenSongs)
        //        {
        //            s.setPrice(1.29);
        //            System.out.println("Title: " + s.getTitle() + " | Price: " + s.getPrice());
        //        }

        // change the array
        //        System.out.println("-BEFORE--");
        //        for (Song changeSong : topTenSongs) {
            //            //changeSong.setTitle("test");
            //            changeSong= new Song("test");
            //        }
            //        // show the array
            //        System.out.println("-AFTER--");
            //        for (Song showSong : topTenSongs) {
                //            System.out.println(showSong.getTitle());
                //        }

        for (int i = 1; i < topTenSongs.length; i++)
        {
            if (i % 3 == 0) {
                topTenSongs[i].setPrice(0.99);
            }
            else {
                topTenSongs[i].setPrice(1.29);
            }
           // topTenSongs[i] = new Song("test");
            System.out.println("Title: " + topTenSongs[i].getTitle() + " | Price: " + topTenSongs[i].getPrice());

        }

        for (int i = 1; i < topTenSongs.length && i < 6; i++)
        {
            System.out.println("Title: " + topTenSongs[i].getTitle());
        }


        System.out.println("Every Other Song: ");
        for (int i = 1; i < topTenSongs.length; i++)
        {
            if (i%2 != 0) {
                System.out.println("Title: " + topTenSongs[i].getTitle());
            }
        }

        System.out.println("Every Other Song V2: ");
        int loopcounter = 0;
        for (Song s: topTenSongs) {
            loopcounter++;
            if (loopcounter % 2 == 0) {
                System.out.println("Title: " + s.getTitle());
            }
        }
    }
}
