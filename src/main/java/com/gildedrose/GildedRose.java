package main.java.com.gildedrose;

public class GildedRose {
    public Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) { //zamiana iteracji na foreach
            if (item.name.equals("Sulfuras, Hand of Ragnaros")){continue;}
            if (!item.name.equals("Aged Brie")
                    && !item.name.equals("Backstage passes to a TAFKAL80ETC concert") && !item.name.equals("Conjured Mana Cake")) {
                if (item.quality > 0) {
                    item.quality = item.quality - 1;//unwrapped if
                }
            } else {
                if (item.quality < 50 && !item.name.equals("Conjured Mana Cake")) {
                    item.quality = item.quality + 1;

                    if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (item.sellIn < 11) {
                            if (item.quality < 50) {
                                item.quality = item.quality + 1;
                            }
                        }

                        if (item.sellIn < 6) {
                            if (item.quality < 50) {
                                item.quality = item.quality + 1;
                            }
                        }
                    }
                }
            }

            item.sellIn = item.sellIn - 1;

            if (item.sellIn < 0 && !item.name.equals("Conjured Mana Cake")) {
                if (!item.name.equals("Aged Brie")) {
                    if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (item.quality > 0) {
                            item.quality = item.quality - 1;
                        }
                    } else {
                        item.quality = item.quality - item.quality;
                    }
                } else {
                    if (item.quality < 50) {
                        item.quality = item.quality + 1;
                    }
                }
            }

            if (item.name.equals("Conjured Mana Cake")) {

                if (item.sellIn > 0) {
                    if (item.quality >= 2) {
                        item.quality -= 2;
                    } else if (item.quality == 1) {
                        item.quality -= 1;
                    }
                } else {
                    if (item.quality >= 4) {
                        item.quality -= 4;
                    } else {
                        if (item.quality == 3) {
                            item.quality -= 3;
                        } else if (item.quality == 2) {
                            item.quality -= 2;
                        } else if (item.quality > 0) {
                            item.quality -= 1;
                        }
                    }
                }
            }
        }
    }

}

