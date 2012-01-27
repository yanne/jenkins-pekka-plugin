/**
 * Copyright (c) 2009 Cliffano Subagio
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package hudson.plugins.pekkahaavisto;

import java.util.Random;

/**
 * {@link FactGenerator} provides Pekka Haavisto facts.
 */
public class FactGenerator {

    /**
     * The configured Pekka Haapio facts, from <a href="https://twitter.com/pekkafacts"
     * >Twitter/</a>.
     */
    private static final String[] FACTS = {
            "Suomi ei hae NATO-jäsenyyttä Pekka Haaviston presidenttikaudella. NATO hakee Suomi-jäsenyyttä.",
            "Pekka Haavisto löytää kohtuuhintaisen kahvilan Helsingistä.",
            "SETI-tutkimuksesta tuttu Wow!-signaali oli todellisuudessa Pekka Haaviston ensimmäinen radiohaastattelu",
            "Pekka Haavisto on pyytänyt, että hänestä otetuista kuvista editoidaan sädekehä pois",
            "Chuck Norrisin sähköpostiosoite on chucknorris@pekkahaavisto.com.",
            "Pekka Haavisto piipahti McDonaldsissa, ja nyt sekin on vihreä.",
            "Kuinka monta Pekka Haavistoa tarvitaan vaihtamaan lamppu? Ei yhtään, koska Pekka Haavisto on jo vaihtanut lampun.",
            "Jalkapalloa: Pekka Haavisto - Brasilia. Pekka Haavisto vaihdettiin kentältä tilanteessa 7-0. Ottelu päättyi 9-0 Pekka Haaviston voittoon.",
            "Pekka Haavisto ei käy Ultra Bran keikoilla. Ultra Bra tulee hänen keikalleen.",
            "Kumpi ja Kampi tappelivat. Sitten tuli Pekka Haavisto, Kumpi ja Kampi äänestivät hänet presidentiksi ja molemmat voittivat.",
            "Pekka Haavisto ei koskaan joudu lumitöihin. Hän vain avaa oven ja hymyilee lämpimästi haluttuun suuntaan.",
            "Pekka Haavisto totesi hissin liian hitaaksi, joten nykyään hän vain hyppää ikkunasta kadulle.",
            "Paavo Väyrynen katsoo Pekka Haavistoa molemmilla silmillä.",
            "Ruoho on vihreämpää aidan toisella puolen – siellähän on Pekka Haaviston piha.",
            "Pekka Haavisto ei vain tanssi susien kanssa. Hän tekee niistä vegaaneja.",
            "Pekka Haavisto pelasi golfia Martti Ahtisaaren kanssa. Pallojen lentoradat jäivät näkymään taivaalle. Näin syntyivät sateenkaaret. ",
            "Kun Pekka Haavisto laittaa kätensä penkin alle, siellä ei koskaan ole purkkaa.",
            "Jumala loi maailman seitsemässä päivässä. Pekka Haavisto loi Jumalan vahingossa.",
            "Pekka Haavisto saa selvää VR:n kuulutuksista.",
            "Pekka Haavisto laittaa aina USB-piuhan ensimmäisellä kerralla oikein päin",
            "Hait ovat delfiinejä, jotka eivät ole vielä tavanneet Pekka Haavistoa.",
            "2",

            "" };

    /**
     * Random instance.
     */
    private static final Random RANDOM = new Random();;

    /**
     * Retrieves a random fact.
     * @return a random fact
     */
    public String random() {
        return FACTS[RANDOM.nextInt(FACTS.length)];
    }
}
