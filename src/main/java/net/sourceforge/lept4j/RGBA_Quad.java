package net.sourceforge.lept4j;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : pix.h:28</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class RGBA_Quad extends Structure {
	/** C type : l_uint8 */
	public byte blue;
	/** C type : l_uint8 */
	public byte green;
	/** C type : l_uint8 */
	public byte red;
	/** C type : l_uint8 */
	public byte alpha;
	public RGBA_Quad() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("blue", "green", "red", "alpha");
	}
	/**
	 * @param blue C type : l_uint8<br>
	 * @param green C type : l_uint8<br>
	 * @param red C type : l_uint8<br>
	 * @param alpha C type : l_uint8
	 */
	public RGBA_Quad(byte blue, byte green, byte red, byte alpha) {
		super();
		this.blue = blue;
		this.green = green;
		this.red = red;
		this.alpha = alpha;
	}
	public RGBA_Quad(Pointer peer) {
		super(peer);
		read();
	}
	public static class ByReference extends RGBA_Quad implements Structure.ByReference {
		
	};
	public static class ByValue extends RGBA_Quad implements Structure.ByValue {
		
	};
}
