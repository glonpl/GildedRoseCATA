package main.java.com.gildedrose;

public class AgedBrieItem extends Item {
    public AgedBrieItem( int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    protected void doUpdateQuality() {
        if (quality < 50) {
            quality = quality + 1;

        }

        sellIn = sellIn - 1;

        if (sellIn < 0) {
            if (quality < 50) {
                quality = quality + 1;
            }
        }


    }
}
