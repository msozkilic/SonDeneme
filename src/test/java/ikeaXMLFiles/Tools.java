package ikeaXMLFiles;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

public class Tools {


    public int randomGet(int min,int max){

        Random rnd=new Random();
        int randomNum=rnd.nextInt((max-min)+1)+min;
        return randomNum;
    }

    public void compareToList(List<WebElement>actualList,List<String>expectedList){
        for (int i = 0; i < expectedList.size(); i++) {
            Assert.assertEquals(expectedList.get(i),actualList.get(i).getText());

        }
    }


}
