package step_definitions;

import com.mongodb.client.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.bson.Document;
import org.junit.Assert;

import static com.mongodb.client.model.Filters.eq;

public class US175_StepDef {

    MongoCollection<Document> kullanicilar;
    MongoCollection<Document> referanslar;
    FindIterable<Document> yetkiliKullanicilar;
    MongoDatabase database;

    @Given("user connects to the database")
    public void userConnectsToTheDatabase() {
        String uri = "mongodb+srv://deneme:1234@cluster0.owokn.mongodb.net/myFirstDatabase?retryWrites=true&w=majority";
        MongoClient mongoClient = MongoClients.create(uri);
        database = mongoClient.getDatabase("myFirstDatabase");

    }

    @And("user gets the yetkili list")
    public void userGetsTheYetkiliList() {
        kullanicilar = database.getCollection("kullanicis");

        yetkiliKullanicilar = kullanicilar.find(eq("rol", "yetkili"));

        if (yetkiliKullanicilar == null) {
            System.out.println("No results found.");
        } else {
            System.out.println(yetkiliKullanicilar.toString());
        }
    }



    @Then("user verifies reference count of the all yetkili users is greater than or equal to two")
    public void userVerifiesReferenceCountOfTheAllYetkiliUsersIsGreaterThanOrEqualToTwo() {
        referanslar = database.getCollection("references");

        for(Document user : yetkiliKullanicilar){

            FindIterable<Document> list = referanslar.find(eq("reference_member", user.get("email")));

            int toplam = 0;
            for(Document count : list){
                toplam += count.getInteger("reference_count");
            }

            Assert.assertTrue(toplam >= 2);
        }
    }


}
