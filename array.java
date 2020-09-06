import java.util.Scanner;
/**
 * クラス array の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class array
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] data = new int[5];

        for(int i = 0; i  < 5; i++){
            data[i] = scan.nextInt();
        }

        int large = 1;
        int i = 0;
        large = data[0];

        while(i < 5){
            if(large < data[i]){
                large = data[i];
            }
            i++;
        }
        System.out.println(large);
    }

}
