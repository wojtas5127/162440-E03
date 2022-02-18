package pl.imiajd.kacprzyk;
import java.io.File;
public class Z3 {
    public static <T> void bezroz (File plik,String rozszerzenie)
    {
        String[] e1 = plik.list((katalog,nazwa)->(new File((katalog.toString())+"/"+nazwa)).isFile());

        for(String element: e1)
        {
            if (element.endsWith(rozszerzenie)==false)
            {
                System.out.print(element);
            }
        }
    }
        public static void main(String[] args){
            File plik = new File(".");
            bezroz(plik,".md");


        }

}
