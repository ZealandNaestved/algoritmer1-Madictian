import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class Algorithms1Test {
        String[] list = new Data().getRandomDrengeNavne();
        String[] liste = new Data().getRandomPigeNavne();
    @org.junit.jupiter.api.Test
    void randomBoyName() {

        assertEquals("Awesome", list[0] );
        assertEquals("Barc",list[1]);

    }

    @Test
    void randomName() {
        Random random = new Random();
        random.setSeed(15L);
        assertEquals("Life", list[random.nextInt(list.length)]);
        random.setSeed(120L);
        assertEquals("Glød", liste[random.nextInt(list.length)]);
    }
}