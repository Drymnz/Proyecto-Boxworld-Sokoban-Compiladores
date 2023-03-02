// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: lexico.jflex

/*primer seccion: codigo java que se copiara arriba*/
package com.cunoc.JFlex_Cup.HTML;
import java_cup.runtime.*;
import java.util.List;
import java.util.ArrayList;
import com.cunoc.JFlex_Cup.Token;
import com.cunoc.Server.Console;

// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
public class LexicoHTML implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\u10ff\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\10\0\3\1\1\0\2\1\22\0\1\1\2\0\1\2"+
    "\13\0\1\3\12\4\2\0\1\5\1\0\1\6\1\7"+
    "\1\0\1\10\1\11\1\12\4\13\1\14\1\15\1\13"+
    "\1\16\1\17\5\13\1\20\5\13\1\21\1\22\1\13"+
    "\4\0\1\23\1\0\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40"+
    "\1\41\1\42\1\43\1\35\1\44\1\45\1\46\1\47"+
    "\1\35\1\50\1\51\1\52\1\35\1\0\1\1\u0183\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[512];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\2\1\3\1\2\1\1\4\2\1\4\16\0"+
    "\1\4\32\0\1\5\1\4\1\6\33\0\1\7\1\4"+
    "\36\0\1\10\1\4\25\0\1\11\2\0\1\12\1\0"+
    "\1\13\1\14\1\15\1\0\1\16\2\0\1\4\5\0"+
    "\1\17\2\0\1\20\1\0\1\21\1\22\1\23\1\0"+
    "\1\24\2\0\1\25\2\0\1\26\6\0\1\27\1\0"+
    "\1\30\2\0\1\31\6\0\1\32\4\0\1\33\1\0"+
    "\1\34\4\0\1\35\3\0\1\36\1\0\1\37\4\0"+
    "\1\40\6\0\1\41\7\0\1\42\17\0\1\43\6\0"+
    "\1\44\10\0\1\45\5\0\1\46\4\0\1\47\4\0"+
    "\1\50\4\0\1\51\1\52\2\0\1\53\1\54\12\0"+
    "\1\55\1\0\1\56\6\0\1\57\1\60";

  private static int [] zzUnpackAction() {
    int [] result = new int[306];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\53\0\126\0\201\0\254\0\327\0\u0102\0\u012d"+
    "\0\u0158\0\u0183\0\u01ae\0\u01d9\0\u0204\0\u022f\0\u025a\0\u0285"+
    "\0\u02b0\0\u02db\0\u0306\0\u0331\0\u035c\0\u0387\0\u03b2\0\u03dd"+
    "\0\u0408\0\u0433\0\u045e\0\u0489\0\u04b4\0\u04df\0\u050a\0\u0535"+
    "\0\u0560\0\u058b\0\u05b6\0\u05e1\0\u060c\0\u0637\0\u0662\0\u068d"+
    "\0\u06b8\0\u06e3\0\u070e\0\u0739\0\u0764\0\u078f\0\u07ba\0\u07e5"+
    "\0\u0810\0\u083b\0\u0866\0\u03dd\0\u0891\0\53\0\u08bc\0\u08e7"+
    "\0\u0912\0\u093d\0\u0968\0\u0993\0\u09be\0\u09e9\0\u0a14\0\u0a3f"+
    "\0\u0a6a\0\u0a95\0\u0ac0\0\u0aeb\0\u0b16\0\u0b41\0\u0b6c\0\u0b97"+
    "\0\u0bc2\0\u0bed\0\u0c18\0\u0c43\0\u0c6e\0\u0c99\0\u0cc4\0\u0cef"+
    "\0\u0d1a\0\53\0\u0d45\0\u0d70\0\u0d9b\0\u0dc6\0\u0df1\0\u0e1c"+
    "\0\u0e47\0\u0e72\0\u0e9d\0\u0ec8\0\u0ef3\0\u0f1e\0\u0f49\0\u0f74"+
    "\0\u0f9f\0\u0fca\0\u0ff5\0\u1020\0\u104b\0\u1076\0\u10a1\0\u10cc"+
    "\0\u10f7\0\u1122\0\u114d\0\u1178\0\u11a3\0\u11ce\0\u11f9\0\u1224"+
    "\0\u124f\0\53\0\u127a\0\u12a5\0\u12d0\0\u12fb\0\u1326\0\u1351"+
    "\0\u137c\0\u13a7\0\u13d2\0\u13fd\0\u1428\0\u1453\0\u147e\0\u14a9"+
    "\0\u14d4\0\u14ff\0\u152a\0\u1555\0\u1580\0\u15ab\0\u15d6\0\u1601"+
    "\0\53\0\u162c\0\u1657\0\53\0\u1682\0\53\0\53\0\53"+
    "\0\u16ad\0\53\0\u16d8\0\u1703\0\53\0\u172e\0\u1759\0\u1784"+
    "\0\u17af\0\u17da\0\u0433\0\u1805\0\u1830\0\u0433\0\u185b\0\u0433"+
    "\0\u0433\0\u0433\0\u1886\0\u0433\0\u18b1\0\u18dc\0\53\0\u1907"+
    "\0\u1932\0\53\0\u195d\0\u1988\0\u19b3\0\u19de\0\u1a09\0\u1a34"+
    "\0\53\0\u1a5f\0\u0433\0\u1a8a\0\u1ab5\0\u0433\0\u1ae0\0\u1b0b"+
    "\0\u1b36\0\u1b61\0\u1b8c\0\u1bb7\0\u0433\0\u1be2\0\u1c0d\0\u1c38"+
    "\0\u1c63\0\53\0\u1c8e\0\53\0\u1cb9\0\u1ce4\0\u1d0f\0\u1d3a"+
    "\0\53\0\u1d65\0\u1d90\0\u1dbb\0\u0433\0\u1de6\0\u0433\0\u1e11"+
    "\0\u1e3c\0\u1e67\0\u1e92\0\u0433\0\u1ebd\0\u1ee8\0\u1f13\0\u1f3e"+
    "\0\u1f69\0\u1f94\0\53\0\u1fbf\0\u1fea\0\u2015\0\u2040\0\u206b"+
    "\0\u2096\0\u20c1\0\u0433\0\u20ec\0\u2117\0\u2142\0\u216d\0\u2198"+
    "\0\u21c3\0\u21ee\0\u2219\0\u2244\0\u226f\0\u229a\0\u22c5\0\u22f0"+
    "\0\u231b\0\u2346\0\53\0\u2371\0\u239c\0\u23c7\0\u23f2\0\u241d"+
    "\0\u2448\0\u0433\0\u2473\0\u249e\0\u24c9\0\u24f4\0\u251f\0\u254a"+
    "\0\u2575\0\u25a0\0\53\0\u25cb\0\u25f6\0\u2621\0\u264c\0\u2677"+
    "\0\u0433\0\u26a2\0\u26cd\0\u26f8\0\u2723\0\53\0\u274e\0\u2779"+
    "\0\u27a4\0\u27cf\0\u0433\0\u27fa\0\u2825\0\u2850\0\u287b\0\53"+
    "\0\53\0\u28a6\0\u28d1\0\u0433\0\u0433\0\u28fc\0\u2927\0\u2952"+
    "\0\u297d\0\u29a8\0\u29d3\0\u29fe\0\u2a29\0\u2a54\0\u2a7f\0\53"+
    "\0\u2aaa\0\u0433\0\u2ad5\0\u2b00\0\u2b2b\0\u2b56\0\u2b81\0\u2bac"+
    "\0\53\0\u0433";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[306];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\2\1\5\1\6\3\2\1\7"+
    "\2\2\1\10\6\2\30\11\54\0\1\3\55\0\1\12"+
    "\3\0\13\12\1\0\27\12\4\0\1\5\51\0\1\13"+
    "\3\0\1\14\15\0\1\15\1\16\4\0\1\17\5\0"+
    "\1\20\1\0\1\21\1\22\1\0\1\23\1\24\1\25"+
    "\22\0\1\26\42\0\1\27\52\0\13\30\1\0\27\30"+
    "\4\0\1\31\3\0\13\31\1\0\27\31\3\32\1\33"+
    "\21\32\1\34\1\35\4\32\1\36\5\32\1\37\1\32"+
    "\1\40\1\41\1\32\1\42\1\43\1\44\2\32\7\14"+
    "\1\45\43\14\42\0\1\46\1\0\1\47\50\0\1\50"+
    "\34\0\1\51\52\0\1\52\65\0\1\53\2\0\1\54"+
    "\52\0\1\55\34\0\1\56\25\0\1\57\41\0\1\60"+
    "\53\0\1\61\25\0\1\62\54\0\1\63\37\0\1\64"+
    "\3\0\13\64\1\0\27\64\4\0\1\65\3\0\13\65"+
    "\1\0\27\65\3\32\1\33\52\32\1\33\2\32\1\66"+
    "\47\32\1\33\36\32\1\67\1\32\1\70\11\32\1\33"+
    "\36\32\1\71\13\32\1\33\20\32\1\72\31\32\1\33"+
    "\20\32\1\73\31\32\1\33\33\32\1\74\2\32\1\75"+
    "\13\32\1\33\36\32\1\76\13\32\1\33\20\32\1\77"+
    "\25\32\1\100\3\32\1\33\35\32\1\101\14\32\1\33"+
    "\36\32\1\102\10\32\6\14\1\66\1\45\43\14\24\0"+
    "\1\103\24\0\1\104\35\0\1\105\55\0\1\106\1\0"+
    "\1\107\50\0\1\110\53\0\1\111\36\0\1\112\73\0"+
    "\1\113\55\0\1\114\46\0\1\115\51\0\1\116\36\0"+
    "\1\117\67\0\1\120\20\0\1\121\57\0\1\122\37\0"+
    "\1\123\3\0\13\123\1\0\27\123\3\32\1\33\20\32"+
    "\1\124\24\32\1\125\4\32\1\33\30\32\1\126\21\32"+
    "\1\33\33\32\1\127\1\32\1\130\14\32\1\33\33\32"+
    "\1\131\16\32\1\33\34\32\1\132\15\32\1\33\20\32"+
    "\1\133\31\32\1\33\41\32\1\134\10\32\1\33\44\32"+
    "\1\135\5\32\1\33\40\32\1\136\11\32\1\33\37\32"+
    "\1\137\12\32\1\33\23\32\1\140\26\32\1\33\40\32"+
    "\1\141\6\32\44\0\1\142\31\0\1\143\4\0\1\144"+
    "\50\0\1\145\71\0\1\146\36\0\1\147\60\0\1\150"+
    "\43\0\1\151\74\0\1\152\21\0\1\153\1\154\75\0"+
    "\1\155\37\0\1\156\50\0\1\157\52\0\1\160\61\0"+
    "\1\161\31\0\1\162\40\0\1\163\3\0\13\163\1\0"+
    "\27\163\3\32\1\33\40\32\1\164\11\32\1\33\17\32"+
    "\1\165\4\32\1\166\25\32\1\33\22\32\1\167\27\32"+
    "\1\33\41\32\1\170\10\32\1\33\25\32\1\171\24\32"+
    "\1\33\33\32\1\172\16\32\1\33\24\32\1\173\25\32"+
    "\1\33\46\32\1\174\3\32\1\33\15\32\1\175\1\176"+
    "\33\32\1\33\41\32\1\177\10\32\1\33\26\32\1\200"+
    "\23\32\1\33\24\32\1\201\25\32\1\33\24\32\1\202"+
    "\25\32\1\33\33\32\1\203\13\32\27\0\1\204\51\0"+
    "\1\205\13\0\1\206\55\0\1\207\43\0\1\210\22\0"+
    "\1\211\100\0\1\212\41\0\1\213\35\0\1\214\74\0"+
    "\1\215\30\0\1\216\52\0\1\217\52\0\1\220\74\0"+
    "\1\221\30\0\1\222\75\0\1\223\50\0\1\224\27\0"+
    "\1\225\3\0\13\225\1\0\27\225\3\32\1\33\23\32"+
    "\1\226\26\32\1\33\22\32\1\227\13\32\1\230\13\32"+
    "\1\33\41\32\1\231\10\32\1\33\32\32\1\232\17\32"+
    "\1\33\2\32\1\233\47\32\1\33\30\32\1\234\21\32"+
    "\1\33\17\32\1\235\32\32\1\33\2\32\1\236\47\32"+
    "\1\33\24\32\1\237\25\32\1\33\2\32\1\240\47\32"+
    "\1\33\2\32\1\241\47\32\1\33\2\32\1\242\47\32"+
    "\1\33\24\32\1\243\25\32\1\33\2\32\1\244\47\32"+
    "\1\33\25\32\1\245\24\32\1\33\23\32\1\246\23\32"+
    "\6\0\1\247\106\0\1\250\51\0\1\251\17\0\1\252"+
    "\67\0\1\253\61\0\1\254\46\0\1\255\70\0\1\256"+
    "\54\0\1\257\40\0\1\260\24\0\1\261\36\0\1\262"+
    "\5\0\3\32\1\33\2\32\1\263\47\32\1\33\36\32"+
    "\1\264\13\32\1\33\35\32\1\265\14\32\1\33\2\32"+
    "\1\266\47\32\1\33\17\32\1\267\32\32\1\33\26\32"+
    "\1\270\23\32\1\33\22\32\1\271\27\32\1\33\40\32"+
    "\1\272\11\32\1\33\42\32\1\273\7\32\1\33\30\32"+
    "\1\274\21\32\1\33\2\32\1\275\36\32\1\276\5\32"+
    "\37\0\1\277\36\0\1\300\55\0\1\301\32\0\1\302"+
    "\106\0\1\303\16\0\1\304\14\0\1\305\52\0\1\306"+
    "\21\0\1\307\46\0\1\310\17\0\1\311\44\0\3\32"+
    "\1\33\33\32\1\312\16\32\1\33\17\32\1\313\32\32"+
    "\1\33\22\32\1\314\27\32\1\33\2\32\1\315\47\32"+
    "\1\33\36\32\1\316\13\32\1\33\2\32\1\317\14\32"+
    "\1\320\32\32\1\33\17\32\1\321\21\32\1\322\10\32"+
    "\1\33\35\32\1\323\14\32\1\33\2\32\1\324\44\32"+
    "\42\0\1\325\56\0\1\326\46\0\1\327\47\0\1\330"+
    "\41\0\1\331\52\0\1\332\32\0\1\333\74\0\1\334"+
    "\22\0\3\32\1\33\36\32\1\335\13\32\1\33\42\32"+
    "\1\336\7\32\1\33\36\32\1\337\13\32\1\33\33\32"+
    "\1\340\16\32\1\33\22\32\1\341\27\32\1\33\22\32"+
    "\1\342\27\32\1\33\2\32\1\343\47\32\1\33\24\32"+
    "\1\344\22\32\44\0\1\345\32\0\1\346\65\0\1\347"+
    "\55\0\1\350\52\0\1\351\52\0\1\352\37\0\1\353"+
    "\23\0\3\32\1\33\40\32\1\354\11\32\1\33\20\32"+
    "\1\355\31\32\1\33\33\32\1\356\16\32\1\33\36\32"+
    "\1\357\13\32\1\33\36\32\1\360\13\32\1\33\36\32"+
    "\1\361\13\32\1\33\23\32\1\362\23\32\6\0\1\363"+
    "\110\0\1\364\50\0\1\365\54\0\1\366\45\0\1\367"+
    "\52\0\1\370\36\0\1\371\27\0\3\32\1\33\2\32"+
    "\1\372\47\32\1\33\40\32\1\373\11\32\1\33\36\32"+
    "\1\374\13\32\1\33\40\32\1\375\11\32\1\33\33\32"+
    "\1\376\16\32\1\33\33\32\1\377\16\32\1\33\17\32"+
    "\1\u0100\27\32\32\0\1\u0101\64\0\1\u0102\14\0\1\u0103"+
    "\106\0\1\u0104\52\0\1\u0105\36\0\1\u0106\24\0\3\32"+
    "\1\33\26\32\1\u0107\23\32\1\33\40\32\1\u0108\11\32"+
    "\1\33\2\32\1\u0109\47\32\1\33\36\32\1\u010a\13\32"+
    "\1\33\36\32\1\u010b\13\32\1\33\22\32\1\u010c\24\32"+
    "\30\0\1\u010d\30\0\1\u010e\110\0\1\u010f\52\0\1\u0110"+
    "\50\0\1\u0111\10\0\3\32\1\33\24\32\1\u0112\25\32"+
    "\1\33\2\32\1\u0113\47\32\1\33\40\32\1\u0114\11\32"+
    "\1\33\40\32\1\u0115\11\32\1\33\36\32\1\u0116\10\32"+
    "\46\0\1\u0117\12\0\1\u0118\52\0\1\u0119\103\0\1\u011a"+
    "\13\0\3\32\1\33\42\32\1\u011b\7\32\1\33\2\32"+
    "\1\u011c\47\32\1\33\2\32\1\u011d\47\32\1\33\33\32"+
    "\1\u011e\13\32\23\0\1\u011f\71\0\1\u0120\10\0\3\32"+
    "\1\33\17\32\1\u0121\32\32\1\33\36\32\1\u0122\10\32"+
    "\26\0\1\u0123\70\0\1\u0124\6\0\3\32\1\33\22\32"+
    "\1\u0125\27\32\1\33\40\32\1\u0126\6\32\42\0\1\u0127"+
    "\16\0\1\u0128\44\0\3\32\1\33\36\32\1\u0129\13\32"+
    "\1\33\2\32\1\u012a\44\32\37\0\1\u012b\13\0\3\32"+
    "\1\33\33\32\1\u012c\13\32\42\0\1\u012d\10\0\3\32"+
    "\1\33\36\32\1\u012e\10\32\44\0\1\u012f\6\0\3\32"+
    "\1\33\40\32\1\u0130\6\32\6\0\1\u0131\44\0\3\32"+
    "\1\33\2\32\1\u0132\44\32";

  private static int [] zzUnpackTrans() {
    int [] result = new int[11223];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\1\11\10\1\16\0\1\1\32\0\2\1\1\11"+
    "\33\0\1\11\1\1\36\0\1\11\1\1\25\0\1\11"+
    "\2\0\1\11\1\0\3\11\1\0\1\11\2\0\1\11"+
    "\5\0\1\1\2\0\1\1\1\0\3\1\1\0\1\1"+
    "\2\0\1\11\2\0\1\11\6\0\1\11\1\0\1\1"+
    "\2\0\1\1\6\0\1\1\4\0\1\11\1\0\1\11"+
    "\4\0\1\11\3\0\1\1\1\0\1\1\4\0\1\1"+
    "\6\0\1\11\7\0\1\1\17\0\1\11\6\0\1\1"+
    "\10\0\1\11\5\0\1\1\4\0\1\11\4\0\1\1"+
    "\4\0\2\11\2\0\2\1\12\0\1\11\1\0\1\1"+
    "\6\0\1\11\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[306];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */
    private String report = "";

    private void print(String token){
        report+="\n<linea:"+(yyline+1)+"><colum:"+(yycolumn+1)+"><TOKEN:"+yytext()+">";
    }
    public String getReport(){
        return this.report;
    }
    public void setReport(String repor){
        this.report = repor;
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public LexicoHTML(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { print("{ENTERO}" );return new Symbol(sym.ENTERO,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 49: break;
          case 2:
            { print("ERROR");
            }
            // fall through
          case 50: break;
          case 3:
            { /*ESPACIOS*/
            }
            // fall through
          case 51: break;
          case 4:
            { print(yytext() );return new Symbol(sym.COLOR,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 52: break;
          case 5:
            { print("{ID}" );return new Symbol(sym.CARACTER,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 53: break;
          case 6:
            { /*COMENTARIO*/
            }
            // fall through
          case 54: break;
          case 7:
            { print("HALL"  );return new Symbol(sym.HALL,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 55: break;
          case 8:
            { print("BRICK"  );return new Symbol(sym.BRICK,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 56: break;
          case 9:
            { print("cols"    );return new Symbol(sym.INICIO_COLS ,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 57: break;
          case 10:
            { print("name"    );return new Symbol(sym.INICIO_NAME ,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 58: break;
          case 11:
            { print("posX"    );return new Symbol(sym.INICIO_POSX ,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 59: break;
          case 12:
            { print("posY"    );return new Symbol(sym.INICIO_POSY ,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 60: break;
          case 13:
            { print("rows"    );return new Symbol(sym.INICIO_ROWS ,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 61: break;
          case 14:
            { print("type"    );return new Symbol(sym.INICIO_TYPE ,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 62: break;
          case 15:
            { print("FINAL_cols"     );return new Symbol(sym.FINAL_COLS  ,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 63: break;
          case 16:
            { print("FINAL_name"     );return new Symbol(sym.FINAL_NAME  ,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 64: break;
          case 17:
            { print("FINAL_posX"     );return new Symbol(sym.FINAL_POSX  ,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 65: break;
          case 18:
            { print("FINAL_posY"     );return new Symbol(sym.FINAL_POSY  ,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 66: break;
          case 19:
            { print("FINAL_rows"     );return new Symbol(sym.FINAL_ROWS  ,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 67: break;
          case 20:
            { print("FINAL_type"     );return new Symbol(sym.FINAL_TYPE  ,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 68: break;
          case 21:
            { print("board"    );return new Symbol(sym.INICIO_BOARD ,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 69: break;
          case 22:
            { print("boxes"    );return new Symbol(sym.INICIO_BOXES ,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 70: break;
          case 23:
            { print("world"    );return new Symbol(sym.INICIO_WORLD ,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 71: break;
          case 24:
            { print("FINAL_board"     );return new Symbol(sym.FINAL_BOARD  ,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 72: break;
          case 25:
            { print("FINAL_boxes"     );return new Symbol(sym.FINAL_BOXES  ,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 73: break;
          case 26:
            { print("FINAL_world"     );return new Symbol(sym.FINAL_WORLD  ,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 74: break;
          case 27:
            { print("config"    );return new Symbol(sym.INICIO_CONFIG ,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 75: break;
          case 28:
            { print("player"    );return new Symbol(sym.INICIO_PLAYER ,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 76: break;
          case 29:
            { print("worlds"    );return new Symbol(sym.INICIO_WORLDS ,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 77: break;
          case 30:
            { print("FINAL_config"     );return new Symbol(sym.FINAL_CONFIG  ,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 78: break;
          case 31:
            { print("FINAL_player"     );return new Symbol(sym.FINAL_PLAYER  ,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 79: break;
          case 32:
            { print("FINAL_worlds"     );return new Symbol(sym.FINAL_WORLDS  ,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 80: break;
          case 33:
            { print("targets"    );return new Symbol(sym.INICIO_TARGETS ,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 81: break;
          case 34:
            { print("FINAL_targets"     );return new Symbol(sym.FINAL_TARGETS  ,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 82: break;
          case 35:
            { print("box_color"    );return new Symbol(sym.INICIO_BOX_COLOR ,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 83: break;
          case 36:
            { print("FINAL_box_color"     );return new Symbol(sym.FINAL_BOX_COLOR  ,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 84: break;
          case 37:
            { print("hall_color"    );return new Symbol(sym.INICIO_HALL_COLOR ,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 85: break;
          case 38:
            { print("FINAL_hall_color"     );return new Symbol(sym.FINAL_HALL_COLOR  ,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 86: break;
          case 39:
            { print("brick_color"    );return new Symbol(sym.INICIO_BRICK_COLOR ,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 87: break;
          case 40:
            { print("FINAL_brick_color"     );return new Symbol(sym.FINAL_BRICK_COLOR  ,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 88: break;
          case 41:
            { print("player_color"    );return new Symbol(sym.INICIO_PLAYER_COLOR ,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 89: break;
          case 42:
            { print("target_color"    );return new Symbol(sym.INICIO_TARGET_COLOR ,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 90: break;
          case 43:
            { print("FINAL_player_color"     );return new Symbol(sym.FINAL_PLAYER_COLOR  ,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 91: break;
          case 44:
            { print("FINAL_target_color"     );return new Symbol(sym.FINAL_TARGET_COLOR  ,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 92: break;
          case 45:
            { print("undefined_color"    );return new Symbol(sym.INICIO_UNDEFINED_COLOR ,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 93: break;
          case 46:
            { print("FINAL_undefined_color"     );return new Symbol(sym.FINAL_UNDEFINED_COLOR  ,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 94: break;
          case 47:
            { print("box_on_target_color"    );return new Symbol(sym.INICIO_BOX_COLOR_ON ,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 95: break;
          case 48:
            { print("FINAL_box_on_target_color"     );return new Symbol(sym.FINAL_BOX_COLOR_ON  ,yyline,yycolumn, (yytext()));
            }
            // fall through
          case 96: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}