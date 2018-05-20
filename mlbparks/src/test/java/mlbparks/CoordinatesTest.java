package mlbparks;

import org.junit.Test;

import com.openshift.evg.roadshow.model.Coordinates;

import junit.framework.TestCase;

public class CoordinatesTest extends TestCase{
	
    public CoordinatesTest(String name) {
        super( name );
    }
    
	@Test
    public void testCoordinates() throws Exception{
    	Coordinates mycoord = new Coordinates("12345","6789");
    	assertEquals( mycoord.getLatitude(), "12345");
    	
    }
	
}