package utility;

import javax.lang.model.type.ArrayType;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class fileListName {

    public static ArrayList<String> musicList(String location) {

        ArrayList<String> SongSheetsList = new ArrayList<>();

        SongSheetsList.add("ABBA");
        SongSheetsList.add("Beatles");
        SongSheetsList.add("BeeGees");
        SongSheetsList.add("Classical");
        SongSheetsList.add("EltonJohn");
        SongSheetsList.add("flute");
        SongSheetsList.add("Piano Solo");
        SongSheetsList.add("ABBA");
        SongSheetsList.add("Beatles");
        SongSheetsList.add("BeeGees");
        SongSheetsList.add("Classical");
        SongSheetsList.add("EltonJohn");
        SongSheetsList.add("Flute");
        SongSheetsList.add("Piano Solo");
        SongSheetsList.add("Song_A");
        SongSheetsList.add("Song_B");
        SongSheetsList.add("Song_C");
        SongSheetsList.add("Song_D");
        SongSheetsList.add("Song_E");
        SongSheetsList.add("Song_F");
        SongSheetsList.add("Song_G");
        SongSheetsList.add("Song_H");
        SongSheetsList.add("Song_I");
        SongSheetsList.add("Song_J");
        SongSheetsList.add("Song_K");
        SongSheetsList.add("Song_L");
        SongSheetsList.add("Song_M");
        SongSheetsList.add("Song_N");
        SongSheetsList.add("Song_O");
        SongSheetsList.add("Song_P");
        // SongSheetsList.add("Song_Q");
        SongSheetsList.add("Song_R");
        SongSheetsList.add("Song_S");
        SongSheetsList.add("Song_T");
        SongSheetsList.add("Song_U");
        SongSheetsList.add("Song_V");
        SongSheetsList.add("Song_W");
        //   SongSheetsList.add("Song_X");
        SongSheetsList.add("Song_Y");
        // SongSheetsList.add("Song_Z");

        return SongSheetsList;

    }

    public static ArrayList<String>  movieList(String location) {

        ArrayList<String> movieList = new ArrayList<>();

        movieList.add("Movies_A");
        movieList.add("Movies_B");
        movieList.add("Movies_C");
        movieList.add("Movies_D");
        movieList.add("Movies_E");
        movieList.add("Movies_F");
        movieList.add("Movies_G");
        movieList.add("Movies_H");
        movieList.add("Movies_I");
        movieList.add("Movies_J");
        movieList.add("Movies_K");
        movieList.add("Movies_L");
        movieList.add("Movies_M");
        movieList.add("Movies_N");
        movieList.add("Movies_O");
        movieList.add("Movies_P");
        movieList.add("Movies_Q");
        movieList.add("Movies_R");
        movieList.add("Movies_S");
        movieList.add("Movies_T");
        movieList.add("Movies_U");
        movieList.add("Movies_V");
        movieList.add("Movies_W");
        movieList.add("Movies_X");
        movieList.add("Movies_Y");
        movieList.add("Movies_Z");
        movieList.add("Fast_And_Furious");
        movieList.add("History War Movies");
        movieList.add("Korean Movies");
        movieList.add("Sports/Baseball");
        movieList.add("American Drama/24-Series");
        movieList.add("American Drama/Band of Brothers");
        movieList.add("American Drama/Black Sheep Squardon");
        movieList.add("American Drama/CSI");
        movieList.add("American Drama/Friends");
        movieList.add("American Drama/Games of Thrones");
        movieList.add("American Drama/Heroes Season 1");
        movieList.add("American Drama/JAG");
        movieList.add("American Drama/Law and Order");
        movieList.add("American Drama/Lost");
        movieList.add("American Drama/Office");
        movieList.add("American Drama/Prison Break");
        movieList.add("American Drama/The Crown");
        movieList.add("Indiana Jones");
        movieList.add("StarWars Movies");
        movieList.add("Star Trek");
        movieList.add("James Bonds");

        return movieList;
    }

    public static void fileListName(ArrayList<String> topicList, String location) {

        HashSet<String> fileNameList = new HashSet<>();

        int topicCount = 0;

        for (String topic : topicList) {
            File file = new File(location + topic);
            String[] fileList = file.list();
            for (String name : fileList) {
                if(  fileNameList.add(name)) {
                    if (!name.contains("._") && (!name.contains(".DS_Store"))) {
                        System.out.println(name);
                        topicCount++;
                    }
                }
            }


        }

        System.out.println("total items..."+ topicCount);


    }


}
