 /**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
    /** Method to test mirrorVertical */
  public static void testMirrorHorizontal()
  {
    Picture wall = new Picture("wall.jpg");
    wall.explore();
    wall.mirrorHorizontal();
    wall.explore();
  }
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  public static void testmyCollage()
  {
    Picture object = new Picture("1824x1364.jpg");
	object.myCollage();
    object.explore();
  }
  
  
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection2(10);
    swan.explore();
  }
    public static void testFixUnderWater()
  {
    Picture water = new Picture("water.jpg");
	water.explore();
    water.fixUnderWater();
    water.explore();
  }
     public static void testNegate()
  {
    Picture flower1 = new Picture("flower1.jpg");
	flower1.explore();
    flower1.negate();
    flower1.explore();
  }
  
    public static void testGrayscale()
  {
    Picture monkey = new Picture("monkey.jpg");
	monkey.explore();
    monkey.grayscale();
    monkey.explore();
  }
  public static void testMirrorArms()
  {
    Picture snowman = new Picture("snowman.jpg");
	snowman.explore();
    snowman.mirrorArms();
    snowman.explore();
  }
  public static void testCopy2()
  {
	 Picture beach = new Picture("seagull.jpg");
	  beach.explore();
	  beach.copy2(new Picture("swan.jpg"), 0, 0, 200, 200);
	  beach.explore();
  }
  public static void testMirrorVerticalRightToLeft()
  {
    Picture wall = new Picture("wall.jpg");
	wall.explore();
    wall.mirrorVerticalRightToLeft();
    wall.explore();
  }
    public static void testMirrorHorizontalBotToTop()
  {
    Picture wall = new Picture("wall.jpg");
	wall.explore();
    wall.mirrorHorizontalBotToTop();
    wall.explore();
  }
  public static void testMirrorGull()
  {
    Picture seagull = new Picture("seagull.jpg");
	seagull.explore();
    seagull.mirrorGull();
    seagull.explore();
  }
  /** Main method for testing.  Every class can have a main
    * method in Java */
public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderWater();
    //testMirrorVertical();
	//testMirrorHorizontal();
	//testMirrorVerticalRightToLeft();
	//testMirrorHorizontal();
	//testMirrorHorizontalBotToTop();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
	//testCopy2();
	testmyCollage();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
}
}