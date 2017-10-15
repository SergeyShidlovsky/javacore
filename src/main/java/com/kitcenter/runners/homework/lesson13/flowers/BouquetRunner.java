package com.kitcenter.runners.homework.lesson13.flowers;

import com.kitcenter.app.homework.lesson13.flowers.Bouquet;
import com.kitcenter.app.homework.lesson13.flowers.Flower;

/**
 * Created by Nastya on 15.10.2017.
 */
public class BouquetRunner {

    public static void main(String[] args) {

        //Creation of roses
        Flower rose = new Flower();
        rose.setName("rose");
        rose.setPrise(12);
        rose.setQuantity((int) (Math.random() * 9 + 1));

        //Creation of chamomile
        Flower chamomile = new Flower();
        chamomile.setName("chamomile");
        chamomile.setPrise(8);
        chamomile.setQuantity((int) (Math.random() * 9 + 1));

        //Creation of cornflower
        Flower cornflower = new Flower();
        cornflower.setName("cornflower");
        cornflower.setPrise(10);
        cornflower.setQuantity((int) (Math.random() * 10 + 1));

        //Creation of fern
        Flower fern = new Flower();
        fern.setName("fern");
        fern.setPrise(2);
        fern.setQuantity((int) (Math.random() * 10 + 1));

        //Creation of bouquet by collection all mentioned above flowers
        Bouquet bouquet = new Bouquet();
        bouquet.setRose(rose);                //Setting roses to Bouquet
        bouquet.setChamomile(chamomile);      //Setting chamomiles to Bouquet
        bouquet.setCornflower(cornflower);    //Setting cornflower to Bouquet
        bouquet.setFern(fern);                //Setting fern to Bouquet

        //Showing Quantity of flovers in Boucket and total price
        System.out.println("Quantity of flowers in bouquet:" +
                "\n -" + bouquet.getRose().getName() + "s = " +
                bouquet.getRose().getQuantity() +
                "\n -" + bouquet.getChamomile().getName() + "s = " +
                bouquet.getChamomile().getQuantity() +
                "\n -" + bouquet.getCornflower().getName() + "s = " +
                bouquet.getCornflower().getQuantity() +
                "\n -" + bouquet.getFern().getName() + "s = " +
                bouquet.getFern().getQuantity() +
                    "\nTotal cost = " +
                    ((bouquet.getRose().getQuantity() * bouquet.getRose().getPrise()) +
                    (bouquet.getChamomile().getQuantity() * bouquet.getChamomile().getPrise()) +
                    (bouquet.getCornflower().getQuantity() * bouquet.getCornflower().getPrise()) +
                    (bouquet.getFern().getQuantity() * bouquet.getFern().getPrise())) );
    }
}
