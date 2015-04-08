package com.googlecode.protobuf.format.util;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.google.protobuf.ByteString;

/**
 * Util methods for converting IDs and printing
 * 
 * @author hduong
 * 
 */
public class IDUtil {

    /**
     * Just do new String for now. Needs real implementation
     * 
     * @param id
     * @return
     */
    static char[]      hexArray = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
    public static final int   ID_LEN        = 16;

    static final int[] decArr   = new int['f' + 1];
    static {
        for (char c = '0'; c <= '9'; c++)
            decArr[c] = c - '0';
        for (char c = 'A'; c <= 'F'; c++)
            decArr[c] = c - 'A' + 10;
        for (char c = 'a'; c <= 'f'; c++)
            decArr[c] = c - 'a' + 10;
    }

    public static String prettyPrint(ByteString id) {
        if (id == null)
            return null;
        return IDUtil.prettyPrint(id.toByteArray());
    }

    public static String prettyPrint(byte[] id) {
        if (id == null)
            return null;
        return IDUtil.bytes2HexString(id);
    }

    public static String bytes2HexString(byte[] bytes) {
        if (bytes == null)
            return null;
        return new String(bytes2HexCharArr(bytes));
    }

    public static byte[] bytes2HexCharArr(byte[] bytes) {
        if (bytes == null)
            return null;
        byte[] sb = new byte[bytes.length * 2];
        // int i = 0;
        // for (byte b : bytes) {
        // int bi = b & 0xff;
        // sb[i] = (byte)(hexArray[bi >> 4]); // /16
        // sb[i+1] = (byte)(hexArray[bi & 0xf]);// mod 16
        // i+=2;
        // }
        copy2Hex(bytes, sb, 0);
        return sb;
    }

    // copy bytes to desArr and transform it to hex while copying
    public static void copy2Hex(byte[] srcBytes, byte[] desArr, int desPos) {
        if (srcBytes == null)
            return;
        if (desArr == null)
            throw new RuntimeException("destination buffer cannot be null.");
        if ((desArr.length - desPos) < srcBytes.length * 2)
            throw new RuntimeException("destination buffer doens't have enough space for copying and convert to hex.");

        int i = desPos;
        for (byte b : srcBytes) {
            int bi = b & 0xff;
            desArr[i] = (byte) (hexArray[bi >> 4]); // /16
            desArr[i + 1] = (byte) (hexArray[bi & 0xf]);// mod 16
            i += 2;
        }
    }

    /**
     * insert byte sources as hex representation into hbase composite key at a
     * given offset.
     * 
     * @param srcBytes
     *            src bytes to insert
     * @param srcOffset
     *            offset in src bytes
     * @param srcLen
     *            src length
     * @param holder
     *            target composite key
     * @param holderOffset
     *            offset in the target composite key
     * @return composite key (same as holder)
     */
    public static byte[] fillCompositeKeyWithHex(byte[] srcBytes,
                                                 int srcOffset,
                                                 int srcLen,
                                                 byte[] holder,
                                                 int holderOffset) {
        for (int i = 0; i < srcLen; i++) {
            holder[holderOffset++] = (byte) (hexArray[(srcBytes[srcOffset] & 0xf0) >>> 4]);
            holder[holderOffset++] = (byte) (hexArray[srcBytes[srcOffset++] & 0xf]);
        }
        return holder;
    }

    /**
     * read hex-encoded part of composite key into holder
     * 
     * @param composite
     *            the src composite key
     * @param offset
     *            offset in the src composite key to start reading from
     * @param holder
     *            the buffer to read bytes into
     * @param holderOffset
     *            offset in the holder to read the bytes into
     * @param holderLen
     *            number of bytes to read into holder
     * @return
     */
    public static byte[] readCompositeKeyHex(byte[] composite,
                                             int offset,
                                             byte[] holder,
                                             int holderOffset,
                                             int holderLen) {

        for (int i = 0; i < holderLen; i++) {
            int c1 = composite[offset++] & 0xff, c2 = composite[offset++] & 0xff;
            c1 = (c1 - '0' < 10) ? c1 - '0' : c1 - 'A' + 10;
            c2 = (c2 - '0' < 10) ? c2 - '0' : c2 - 'A' + 10;

            holder[holderOffset++] = (byte) ((c1 << 4) + c2);
        }

        return holder;
    }

    public static byte[] fillCompositeKeyWithDec(int src, int decimalLen, byte[] holder, int holderOffset) {
        for (int i = holderOffset + decimalLen - 1; i >= holderOffset; i--)
            holder[i] = (byte) ('0' + (src - (src /= 10) * 10));
        return holder;
    }

    public static int readCompositeKeyDec(byte[] composite, int offset, int decimalLen) {
        int result = 0;
        for (int i = 0; i < decimalLen; i++)
            result = 10 * result + (composite[offset++] - '0');
        return result;
    }
    public static boolean isNullOrEmpty(String s){
        return s == null || s.isEmpty();
    }

    public static byte[] hex2ByteArray(String hexString) {
        if (isNullOrEmpty(hexString))
            return null;

        return hex2ByteArray(hexString, 0);
    }

    /**
     * 
     * @param hexString
     * @param minArrayLen
     *            minimum result length. if there's not that many significant
     *            numbers then it is left-padded with 0 bytes.
     * 
     * @return
     */
    public static byte[] hex2ByteArray(String hexString, int minArrayLen) {
        int strlen = hexString.length();
        byte[] out = new byte[Math.max(minArrayLen, (strlen - 1 >> 1) + 1)];

        // this code probably wouldn't work if string length is not multiple of
        // two. - DL

        // int n = hexString.length();

        // for (int i = 0; i < n; i += 2) {
        // // make a bit representation in an int of the hex value
        // int hn = decArr[hexString.charAt(i)];
        // int ln = decArr[hexString.charAt(i + 1)];
        //
        // // shift the high order nibble and add them together
        // out[i / 2] = (byte) ((hn << 4) | ln);
        // }
        for (int i = 0; i < strlen; i += 2)
            out[out.length - 1 - (i >> 1)] = (byte) decArr[hexString.charAt(strlen - i - 1)];
        for (int i = 1; i < strlen; i += 2)
            out[out.length - 1 - (i >> 1)] |= decArr[hexString.charAt(strlen - i - 1)] << 4;

        return out;
    }
    public static boolean isValidID(ByteString byteString) {
        if(isNullOrEmpty(byteString)){
            return false;
        }
        return byteString.toByteArray().length == ID_LEN;
    }
    public static boolean isValidIDInHex(String hexString) {

        if (isNullOrEmpty(hexString)
        // this is technically incorrect in case of a) arbitrarily
        // 0-padded values;
        // non-zero padded ids that start with 0s. -- DL
        // so, i commented this out
        // || hexString.length() != 2 * Bit128IdWritable.ID_LEN

        )
            return false;
        int l = hexString.length();
        int unpaddedLen = 0;
        for (int i = 0; i < l; i++) {
            char c = hexString.charAt(i);
            int v;
            if ((v = Character.digit(c, 16)) == -1)
                return false;
            if (v > 0 || unpaddedLen > 0)
                unpaddedLen++;
            // if (!(c >= '0' && c <= '9' && c>= 'a' && c<= 'f' && c>= 'A' &&
            // c<= 'F')) return false;
        }
        return (unpaddedLen+1>>1) > ID_LEN ? false : true;
    }

    public static int compare(byte[] id1, byte[] id2) {
        int c;
        // unsigned bytes comparison
        int l = Math.min(id1.length, id2.length);
        for (int i = 0; i < l; i++)
            if ((c = (0xff & id1[i]) - (0xff & id2[i])) != 0)
                return c;

        return id1.length - id2.length;
    }

    public static boolean isEquals(byte[] id1, byte[] id2) {
        return Arrays.equals(id1, id2);
    }

    public static boolean contains(List<ByteString> idList, ByteString id) {
        if (idList == null || id == null)
            return false;
        for (ByteString bs : idList) {
            if (isEquals(bs.toByteArray(), id.toByteArray()))
                return true;
        }
        return false;
    }


    public static boolean isNullOrEmpty(ByteString byteString) {
        return (byteString == null || byteString.isEmpty());

    }

    public static boolean isNullOrEmpty(byte[] bytes) {
        return (bytes == null || bytes.length == 0);
    }


}
