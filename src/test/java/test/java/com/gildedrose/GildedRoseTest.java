package test.java.com.gildedrose;



import main.java.com.gildedrose.GildedRose;
import main.java.com.gildedrose.Item;
import org.approvaltests.Approvals;
import org.approvaltests.combinations.CombinationApprovals;
import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void foo() {

        CombinationApprovals.verifyAllCombinations(this::doUpdateQuality,
                new String[]{"foo","Aged Brie","Backstage passes to a TAFKAL80ETC concert","Sulfuras, Hand of Ragnaros",},
                new Integer[]{-1,0,2,6,11},
                new Integer[]{0,1,49,50});
    }

    private String doUpdateQuality(String name, int sellIn, int quality) {
        Item[] items = new Item[] { new Item(name, sellIn, quality) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        return app.items[0].toString();
    }

}
