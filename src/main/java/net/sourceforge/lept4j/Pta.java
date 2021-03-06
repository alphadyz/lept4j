package net.sourceforge.lept4j;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.FloatByReference;
import java.util.Arrays;
import java.util.List;
/**
 * Array of points<br>
 * <i>native declaration : pix.h:121</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class Pta extends Structure {
	/**
	 * actual number of pts<br>
	 * C type : l_int32
	 */
	public int n;
	/**
	 * size of allocated arrays<br>
	 * C type : l_int32
	 */
	public int nalloc;
	/**
	 * reference count (1 if no clones)<br>
	 * C type : l_uint32
	 */
	public int refcount;
	/**
	 * arrays of floats<br>
	 * C type : l_float32*
	 */
	public FloatByReference x;
	/**
	 * arrays of floats<br>
	 * C type : l_float32*
	 */
	public FloatByReference y;
	public Pta() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("n", "nalloc", "refcount", "x", "y");
	}
	/**
	 * @param n actual number of pts<br>
	 * C type : l_int32<br>
	 * @param nalloc size of allocated arrays<br>
	 * C type : l_int32<br>
	 * @param refcount reference count (1 if no clones)<br>
	 * C type : l_uint32<br>
	 * @param x arrays of floats<br>
	 * C type : l_float32*<br>
	 * @param y arrays of floats<br>
	 * C type : l_float32*
	 */
	public Pta(int n, int nalloc, int refcount, FloatByReference x, FloatByReference y) {
		super();
		this.n = n;
		this.nalloc = nalloc;
		this.refcount = refcount;
		this.x = x;
		this.y = y;
	}
	public Pta(Pointer peer) {
		super(peer);
		read();
	}
	public static class ByReference extends Pta implements Structure.ByReference {
		
	};
	public static class ByValue extends Pta implements Structure.ByValue {
		
	};
}
