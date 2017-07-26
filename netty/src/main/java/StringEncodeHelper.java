/**
 * Created by Administrator on 2017-06-12.
 */
public class StringEncodeHelper {
    public static final int INT_SIZE  = Integer.SIZE / 8;
    public static final int LONG_SIZE = Long.SIZE / 8;
    public static final int CHAR_SIZE = 1;
    public static int ctoji(int c) {
        return (c >> 24 & 0xff) | ((c >> 16 & 0xff) << 8) | ((c >> 8 & 0xff) << 16) | ((c & 0xff) << 24);
    }
    public static long ctojl(long c) {
        //return (long) ((ctoji((int) ((c << 32) >> 32))) << 32) | ctoji((int) (c >> 32));
        return (long) ((ctoji((int) ((c << 32) >> 32)))) << 32 | (long) (ctoji((int) (c >> 32)));
    }
}
