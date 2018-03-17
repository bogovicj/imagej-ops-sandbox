import net.imagej.ImageJ;
import net.imglib2.img.Img;
import net.imglib2.type.numeric.integer.UnsignedByteType;

public class ThatOpsExampleInJava {

	public static void main(String[] args) 
	{
		ImageJ ij = new ImageJ();

		Img<UnsignedByteType> img = (Img<UnsignedByteType>)ij.op().run("create.img", new long[]{ 150, 100}, new UnsignedByteType() );
		String formula = "63 * (Math.cos(0.3*p[0]) + Math.sin(0.3*p[1])) + 127";
		ij.op().image().equation( img, formula);

		ij.ui().show(img);

	}

}
