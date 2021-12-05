package step_definitions;

import io.cucumber.java.en.Then;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.KielAddIlanPage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class US030 {

    KielAddIlanPage page = new KielAddIlanPage();

    @Then("kullanici add_ilan sayfasinda excel dosyasindaki ulkeler bilgilerinin ulkeler dropdownu icerisindeki varligini dogrular")
    public void kullaniciAdd_ilanSayfasindaExcelDosyasindakiUlkelerBilgilerininUlkelerDropdownuIcerisindekiVarliginiDogrular() throws IOException {

        WebElement dropdown = page.ulkelerDropdown;
        Select select = new Select(dropdown);
        List<WebElement> listWebElement = select.getOptions();
        List<String> list = new ArrayList<>();

        for(WebElement w : listWebElement){
            list.add(w.getText());
        }

        String dosyaAdresi = "src/test/resources/excels/Ulkeler.xlsx";
        FileInputStream file = new FileInputStream(dosyaAdresi);
        Workbook excel = WorkbookFactory.create(file);
        Sheet sheet = excel.getSheetAt(0);

        int satirSayisi = sheet.getLastRowNum();

        for(int i = 1; i < list.size(); i++){
            boolean varMi = false;
            Cell cell = sheet.getRow(i).getCell(1); // Almanya - Amerika

            System.out.println("Başlangıç : " + new Date().getTime());
            for(String w : list){
                if( w.equalsIgnoreCase(cell.toString()) ){
                    System.out.println(w);
                    varMi = true;
                    break;
                }
            }
            System.out.println("Bitiş : " + new Date().getTime());

            if(varMi == false){
                Assert.assertTrue(false);
                break;
            }
        }

        Assert.assertTrue(true);


    }

}


// 5 tane tester
// 2 haftalık sprint
// 1 tester = 10 gün çalışacak
// 5 tester = 50 günlük çalışma
// 5 tane testerin alabileceği en fazla user story toplam 50 puandan oluşmalıdır.



























