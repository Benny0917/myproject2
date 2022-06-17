package com.yo.score;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ScoringFile {
    public static void main(String[] args) {
        try{
            FileReader fileReader = new FileReader("score.txt");//throws
            int data = fileReader.read();
            data =fileReader.read();
            System.out.println(data);
        }catch(FileNotFoundException e){
            System.out.println("檔案讀取失敗");
        }catch (IOException e){
            System.out.println("資料讀取失敗");
        }
        System.out.println("Testing");
    }
}
