package newclasslib;


import junit.framework.Assert;
import newclasslib.MusicalCarriage;

import org.junit.Test;

public class MusicalCarriageTest {

    @Test
    public void rocksLikeACarriage() {
        Assert.assertEquals("... from side to side", new MusicalCarriage().rock());
    }

}
