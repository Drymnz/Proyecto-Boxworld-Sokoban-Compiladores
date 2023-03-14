
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package com.cunoc.JFlex_Cup.HTML;

import java_cup.runtime.*;
import java.util.ArrayList;
import java.util.List;
import com.cunoc.Map.Map;
import com.cunoc.Map.Square;
import com.cunoc.Map.ListSquare;
import com.cunoc.Converter.SicHTMLToMap;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class SicHTML extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public SicHTML() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public SicHTML(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public SicHTML(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\050\000\002\002\004\000\002\002\005\000\002\002" +
    "\002\000\002\015\002\000\002\003\007\000\002\003\002" +
    "\000\002\004\004\000\002\004\003\000\002\005\005\000" +
    "\002\005\005\000\002\005\005\000\002\005\005\000\002" +
    "\005\005\000\002\016\002\000\002\005\006\000\002\017" +
    "\002\000\002\005\006\000\002\020\002\000\002\005\006" +
    "\000\002\014\004\000\002\014\003\000\002\010\005\000" +
    "\002\010\005\000\002\012\004\000\002\012\003\000\002" +
    "\013\003\000\002\013\005\000\002\021\002\000\002\011" +
    "\004\000\002\022\002\000\002\011\004\000\002\007\004" +
    "\000\002\007\003\000\002\006\005\000\002\006\005\000" +
    "\002\006\005\000\002\006\005\000\002\006\005\000\002" +
    "\006\005\000\002\006\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\121\000\006\002\uffff\004\004\001\002\000\006\005" +
    "\ufffc\006\007\001\002\000\004\002\006\001\002\000\004" +
    "\002\001\001\002\000\022\010\023\012\020\014\016\016" +
    "\017\020\015\022\ufff0\024\ufff4\026\ufff2\001\002\000\004" +
    "\005\011\001\002\000\004\002\000\001\002\000\004\022" +
    "\121\001\002\000\004\026\116\001\002\000\004\024\111" +
    "\001\002\000\010\030\074\032\071\052\067\001\002\000" +
    "\004\057\065\001\002\000\020\034\037\036\036\040\044" +
    "\042\043\044\041\046\042\050\034\001\002\000\004\057" +
    "\032\001\002\000\024\007\026\010\023\012\020\014\016" +
    "\016\017\020\015\022\ufff0\024\ufff4\026\ufff2\001\002\000" +
    "\024\007\ufffa\010\ufffa\012\ufffa\014\ufffa\016\ufffa\020\ufffa" +
    "\022\ufffa\024\ufffa\026\ufffa\001\002\000\004\060\024\001" +
    "\002\000\004\011\025\001\002\000\024\007\ufff9\010\ufff9" +
    "\012\ufff9\014\ufff9\016\ufff9\020\ufff9\022\ufff9\024\ufff9\026" +
    "\ufff9\001\002\000\006\005\ufffe\006\ufffe\001\002\000\024" +
    "\007\ufffb\010\ufffb\012\ufffb\014\ufffb\016\ufffb\020\ufffb\022" +
    "\ufffb\024\ufffb\026\ufffb\001\002\000\006\005\ufffc\006\007" +
    "\001\002\000\004\005\ufffd\001\002\000\004\013\033\001" +
    "\002\000\024\007\ufff8\010\ufff8\012\ufff8\014\ufff8\016\ufff8" +
    "\020\ufff8\022\ufff8\024\ufff8\026\ufff8\001\002\000\004\061" +
    "\063\001\002\000\022\017\061\034\037\036\036\040\044" +
    "\042\043\044\041\046\042\050\034\001\002\000\004\061" +
    "\057\001\002\000\004\061\055\001\002\000\022\017\uffe1" +
    "\034\uffe1\036\uffe1\040\uffe1\042\uffe1\044\uffe1\046\uffe1\050" +
    "\uffe1\001\002\000\004\061\053\001\002\000\004\061\051" +
    "\001\002\000\004\061\047\001\002\000\004\061\045\001" +
    "\002\000\004\041\046\001\002\000\022\017\uffde\034\uffde" +
    "\036\uffde\040\uffde\042\uffde\044\uffde\046\uffde\050\uffde\001" +
    "\002\000\004\043\050\001\002\000\022\017\uffdd\034\uffdd" +
    "\036\uffdd\040\uffdd\042\uffdd\044\uffdd\046\uffdd\050\uffdd\001" +
    "\002\000\004\047\052\001\002\000\022\017\uffdb\034\uffdb" +
    "\036\uffdb\040\uffdb\042\uffdb\044\uffdb\046\uffdb\050\uffdb\001" +
    "\002\000\004\045\054\001\002\000\022\017\uffdc\034\uffdc" +
    "\036\uffdc\040\uffdc\042\uffdc\044\uffdc\046\uffdc\050\uffdc\001" +
    "\002\000\004\035\056\001\002\000\022\017\uffe0\034\uffe0" +
    "\036\uffe0\040\uffe0\042\uffe0\044\uffe0\046\uffe0\050\uffe0\001" +
    "\002\000\004\037\060\001\002\000\022\017\uffdf\034\uffdf" +
    "\036\uffdf\040\uffdf\042\uffdf\044\uffdf\046\uffdf\050\uffdf\001" +
    "\002\000\024\007\ufff6\010\ufff6\012\ufff6\014\ufff6\016\ufff6" +
    "\020\ufff6\022\ufff6\024\ufff6\026\ufff6\001\002\000\022\017" +
    "\uffe2\034\uffe2\036\uffe2\040\uffe2\042\uffe2\044\uffe2\046\uffe2" +
    "\050\uffe2\001\002\000\004\051\064\001\002\000\022\017" +
    "\uffda\034\uffda\036\uffda\040\uffda\042\uffda\044\uffda\046\uffda" +
    "\050\uffda\001\002\000\004\015\066\001\002\000\024\007" +
    "\ufff7\010\ufff7\012\ufff7\014\ufff7\016\ufff7\020\ufff7\022\ufff7" +
    "\024\ufff7\026\ufff7\001\002\000\006\055\uffe4\056\uffe6\001" +
    "\002\000\012\021\101\030\074\032\071\052\067\001\002" +
    "\000\004\057\077\001\002\000\012\021\uffe9\030\uffe9\032" +
    "\uffe9\052\uffe9\001\002\000\012\021\uffe8\030\uffe8\032\uffe8" +
    "\052\uffe8\001\002\000\004\057\075\001\002\000\004\031" +
    "\076\001\002\000\020\021\uffec\023\uffec\025\uffec\027\uffec" +
    "\030\uffec\032\uffec\052\uffec\001\002\000\004\033\100\001" +
    "\002\000\020\021\uffeb\023\uffeb\025\uffeb\027\uffeb\030\uffeb" +
    "\032\uffeb\052\uffeb\001\002\000\024\007\ufff5\010\ufff5\012" +
    "\ufff5\014\ufff5\016\ufff5\020\ufff5\022\ufff5\024\ufff5\026\ufff5" +
    "\001\002\000\012\021\uffea\030\uffea\032\uffea\052\uffea\001" +
    "\002\000\004\053\110\001\002\000\004\055\107\001\002" +
    "\000\004\056\106\001\002\000\004\053\uffe5\001\002\000" +
    "\004\053\uffe3\001\002\000\012\021\uffe7\030\uffe7\032\uffe7" +
    "\052\uffe7\001\002\000\006\030\074\032\071\001\002\000" +
    "\010\025\114\030\074\032\071\001\002\000\014\023\uffed" +
    "\025\uffed\027\uffed\030\uffed\032\uffed\001\002\000\024\007" +
    "\ufff3\010\ufff3\012\ufff3\014\ufff3\016\ufff3\020\ufff3\022\ufff3" +
    "\024\ufff3\026\ufff3\001\002\000\014\023\uffee\025\uffee\027" +
    "\uffee\030\uffee\032\uffee\001\002\000\006\030\074\032\071" +
    "\001\002\000\010\027\120\030\074\032\071\001\002\000" +
    "\024\007\ufff1\010\ufff1\012\ufff1\014\ufff1\016\ufff1\020\ufff1" +
    "\022\ufff1\024\ufff1\026\ufff1\001\002\000\006\030\074\032" +
    "\071\001\002\000\010\023\123\030\074\032\071\001\002" +
    "\000\024\007\uffef\010\uffef\012\uffef\014\uffef\016\uffef\020" +
    "\uffef\022\uffef\024\uffef\026\uffef\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\121\000\004\002\004\001\001\000\004\003\007\001" +
    "\001\000\002\001\001\000\002\001\001\000\014\004\020" +
    "\005\021\016\013\017\012\020\011\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\010\010\072\012\067\013\071\001" +
    "\001\000\002\001\001\000\006\006\037\007\034\001\001" +
    "\000\002\001\001\000\012\005\026\016\013\017\012\020" +
    "\011\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\015\027\001\001\000" +
    "\002\001\001\000\004\003\030\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\006\061\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\010\011\102\021\104\022\103\001\001\000\006" +
    "\010\072\013\101\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\010\112\014\111\001\001" +
    "\000\004\010\114\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\010\112\014\116\001\001" +
    "\000\004\010\114\001\001\000\002\001\001\000\006\010" +
    "\112\014\121\001\001\000\004\010\114\001\001\000\002" +
    "\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$SicHTML$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$SicHTML$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$SicHTML$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



        private double contador= 0;
        private Symbol s;
        private int errorCounter= 0;
        //attributes for map
        private ListSquare typeSquare = ListSquare.UNDEFINED;
        private String name = null;
        private int rows = -1;
        private int cols = -1;
        private int possY = -1;
        private int possX = -1;
        //color
        private String BOX_COLOR = null;
        private String BOX_ON_COLOR = null;
        private String TARGET_COLOR = null;
        private String BRICK_COLOR = null;
        private String HALL_COLOR = null;
        private String UNDEFINED_COLOR = null;
        private String PLAY_COLOR = null;
        private ArrayList<Square> listSquare = new ArrayList();
        private ArrayList<Map> listMap = new ArrayList();

    SicHTML(LexicoHTML lexico){
        super(lexico);
    }
    public void syntax_error(Symbol cur_token) {
        errorCounter++;
        System.out.println("\n"+errorCounter+" - Clase<"+"> en simbolo<" + sym.terminalNames[cur_token.sym]+String.format(">posicion: <%d>, <%d>", (cur_token.left+1), (cur_token.right+1)));
    }
     private void addSquare(){
        listSquare.add(new Square(typeSquare,possX,possY));
        //System.out.println(typeSquare.toString()+"possx"+possX+"possY"+possY);
    }
    private void prinFinal(){
        //System.out.println(typeSquare.toString()+"possx"+possX+"possY"+possY);
        System.out.println("contador : "+contador);
        System.out.println("errorCounter : "+errorCounter);
        System.out.println("typeSquare : "+typeSquare);
        System.out.println("name : "+name);
        System.out.println("rows : "+rows);
        System.out.println("cols : "+cols);
        System.out.println("possY : "+possY);
        System.out.println("possX : "+possX);
        System.out.println("BOX_COLOR : "+BOX_COLOR);
        System.out.println("BOX_ON_COLOR : "+BOX_ON_COLOR);
        System.out.println("TARGET_COLOR : "+TARGET_COLOR);
        System.out.println("BRICK_COLOR : "+BRICK_COLOR);
        System.out.println("HALL_COLOR : "+HALL_COLOR);
        System.out.println("UNDEFINED_COLOR : "+UNDEFINED_COLOR);
        System.out.println("PLAY_COLOR : "+PLAY_COLOR);
        System.out.println("listSquare : "+listSquare.size());
        for (int index = 0; index < listSquare.size(); index++) {
          System.out.println("Square #"+index+":"+listSquare.get(index).toString());
        }
    }

    private void addListToMap(){
      if (errorCounter == 0) {
        //add map
      listMap.add(((new SicHTMLToMap(this)).getMap()));
      //attributes for map
      typeSquare = ListSquare.UNDEFINED;
      name = null;
      rows = -1;
      cols = -1;
      possY = -1;
      possX = -1;
      //color
      BOX_COLOR = null;
      BOX_ON_COLOR = null;
      TARGET_COLOR = null;
      BRICK_COLOR = null;
      HALL_COLOR = null;
      UNDEFINED_COLOR = null;
      PLAY_COLOR = null;
      listSquare = new ArrayList();
      }
    }
        public ArrayList<Map> getListMap(){
      return listMap;
    }
  
    public Symbol getSymbol(){
        return this.s;
    }
    public int getErrorCounter(){
        return this.errorCounter;
    }
     /*GET*/
    
public ListSquare getTypeSquare() {
      return typeSquare;
    }

    public String getName() {
      return name;
    }

    public int getRows() {
      return rows;
    }

    public int getCols() {
      return cols;
    }

    public int getPossY() {
      return possY;
    }

    public int getPossX() {
      return possX;
    }

    public String getBOX_COLOR() {
      return BOX_COLOR;
    }

    public String getBOX_ON_COLOR() {
      return BOX_ON_COLOR;
    }

    public String getTARGET_COLOR() {
      return TARGET_COLOR;
    }

    public String getBRICK_COLOR() {
      return BRICK_COLOR;
    }

    public String getHALL_COLOR() {
      return HALL_COLOR;
    }

    public String getUNDEFINED_COLOR() {
      return UNDEFINED_COLOR;
    }

    public String getPLAY_COLOR() {
      return PLAY_COLOR;
    }

    public ArrayList<Square> getListSquare() {
      return listSquare;
    }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$SicHTML$actions {
  private final SicHTML parser;

  /** Constructor */
  CUP$SicHTML$actions(SicHTML parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$SicHTML$do_action_part00000000(
    int                        CUP$SicHTML$act_num,
    java_cup.runtime.lr_parser CUP$SicHTML$parser,
    java.util.Stack            CUP$SicHTML$stack,
    int                        CUP$SicHTML$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$SicHTML$result;

      /* select the action based on the action number */
      switch (CUP$SicHTML$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= inicio EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)).value;
		RESULT = start_val;
              CUP$SicHTML$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)), ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$SicHTML$parser.done_parsing();
          return CUP$SicHTML$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // inicio ::= INICIO_WORLDS accion FINAL_WORLDS 
            {
              Object RESULT =null;

              CUP$SicHTML$result = parser.getSymbolFactory().newSymbol("inicio",0, ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-2)), ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), RESULT);
            }
          return CUP$SicHTML$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // inicio ::= 
            {
              Object RESULT =null;

              CUP$SicHTML$result = parser.getSymbolFactory().newSymbol("inicio",0, ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), RESULT);
            }
          return CUP$SicHTML$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // NT$0 ::= 
            {
              Object RESULT =null;

    //prinFinal();
    addListToMap();
    
              CUP$SicHTML$result = parser.getSymbolFactory().newSymbol("NT$0",11, ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), RESULT);
            }
          return CUP$SicHTML$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // accion ::= INICIO_WORLD datos_mapa FINAL_WORLD NT$0 accion 
            {
              Object RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)).value;

              CUP$SicHTML$result = parser.getSymbolFactory().newSymbol("accion",1, ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-4)), ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), RESULT);
            }
          return CUP$SicHTML$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // accion ::= 
            {
              Object RESULT =null;

              CUP$SicHTML$result = parser.getSymbolFactory().newSymbol("accion",1, ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), RESULT);
            }
          return CUP$SicHTML$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // datos_mapa ::= datos_mapa atributos 
            {
              Object RESULT =null;

              CUP$SicHTML$result = parser.getSymbolFactory().newSymbol("datos_mapa",2, ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)), ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), RESULT);
            }
          return CUP$SicHTML$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // datos_mapa ::= atributos 
            {
              Object RESULT =null;

              CUP$SicHTML$result = parser.getSymbolFactory().newSymbol("datos_mapa",2, ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), RESULT);
            }
          return CUP$SicHTML$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // atributos ::= INICIO_NAME CARACTER FINAL_NAME 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)).value;
		
    if (name == null) {
      name = a.replaceAll("\"", "");
    }else{
      System.out.println("ya tiene un nombre");
    }
              CUP$SicHTML$result = parser.getSymbolFactory().newSymbol("atributos",3, ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-2)), ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), RESULT);
            }
          return CUP$SicHTML$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // atributos ::= INICIO_ROWS ENTERO FINAL_ROWS 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)).value;
				
    if (rows==-1) {
      if (Integer.parseInt(a)>0) {
        rows = Integer.parseInt(a);
      } else {
        System.out.println("no puede ser menor a 0");
      }
    }else{
      System.out.println("rows no se puede usar dos veces");
    }
              CUP$SicHTML$result = parser.getSymbolFactory().newSymbol("atributos",3, ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-2)), ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), RESULT);
            }
          return CUP$SicHTML$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // atributos ::= INICIO_COLS ENTERO FINAL_COLS 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)).value;
				
    if (cols==-1) {
      if (Integer.parseInt(a)>0) {
        cols = Integer.parseInt(a);
      } else {
        System.out.println("no puede ser menor a 0");
      }
    }else{
      System.out.println("cols no se puede usar dos veces");
    }
              CUP$SicHTML$result = parser.getSymbolFactory().newSymbol("atributos",3, ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-2)), ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), RESULT);
            }
          return CUP$SicHTML$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // atributos ::= INICIO_CONFIG bucle_color FINAL_CONFIG 
            {
              Object RESULT =null;

              CUP$SicHTML$result = parser.getSymbolFactory().newSymbol("atributos",3, ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-2)), ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), RESULT);
            }
          return CUP$SicHTML$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // atributos ::= INICIO_BOARD tipo_poss_dar FINAL_BOARD 
            {
              Object RESULT =null;
		addSquare();
              CUP$SicHTML$result = parser.getSymbolFactory().newSymbol("atributos",3, ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-2)), ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), RESULT);
            }
          return CUP$SicHTML$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // NT$1 ::= 
            {
              Object RESULT =null;
typeSquare = ListSquare.TARGET;
              CUP$SicHTML$result = parser.getSymbolFactory().newSymbol("NT$1",12, ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), RESULT);
            }
          return CUP$SicHTML$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // atributos ::= NT$1 INICIO_TARGETS solo_poss FINAL_TARGETS 
            {
              Object RESULT =null;
              // propagate RESULT from NT$1
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-3)).value;
		addSquare();
              CUP$SicHTML$result = parser.getSymbolFactory().newSymbol("atributos",3, ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-3)), ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), RESULT);
            }
          return CUP$SicHTML$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // NT$2 ::= 
            {
              Object RESULT =null;
typeSquare = ListSquare.PLAY;
              CUP$SicHTML$result = parser.getSymbolFactory().newSymbol("NT$2",13, ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), RESULT);
            }
          return CUP$SicHTML$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // atributos ::= NT$2 INICIO_PLAYER solo_poss FINAL_PLAYER 
            {
              Object RESULT =null;
              // propagate RESULT from NT$2
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-3)).value;
		addSquare();
              CUP$SicHTML$result = parser.getSymbolFactory().newSymbol("atributos",3, ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-3)), ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), RESULT);
            }
          return CUP$SicHTML$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // NT$3 ::= 
            {
              Object RESULT =null;
typeSquare = ListSquare.BOX;
              CUP$SicHTML$result = parser.getSymbolFactory().newSymbol("NT$3",14, ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), RESULT);
            }
          return CUP$SicHTML$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // atributos ::= NT$3 INICIO_BOXES solo_poss FINAL_BOXES 
            {
              Object RESULT =null;
              // propagate RESULT from NT$3
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-3)).value;
		addSquare();
              CUP$SicHTML$result = parser.getSymbolFactory().newSymbol("atributos",3, ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-3)), ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), RESULT);
            }
          return CUP$SicHTML$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // solo_poss ::= solo_poss pos 
            {
              Object RESULT =null;

              CUP$SicHTML$result = parser.getSymbolFactory().newSymbol("solo_poss",10, ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)), ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), RESULT);
            }
          return CUP$SicHTML$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // solo_poss ::= pos 
            {
              Object RESULT =null;

              CUP$SicHTML$result = parser.getSymbolFactory().newSymbol("solo_poss",10, ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), RESULT);
            }
          return CUP$SicHTML$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // pos ::= INICIO_POSX ENTERO FINAL_POSX 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)).value;
		possX= Integer.parseInt(a);
              CUP$SicHTML$result = parser.getSymbolFactory().newSymbol("pos",6, ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-2)), ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), RESULT);
            }
          return CUP$SicHTML$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // pos ::= INICIO_POSY ENTERO FINAL_POSY 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)).value;
		possY= Integer.parseInt(a);
              CUP$SicHTML$result = parser.getSymbolFactory().newSymbol("pos",6, ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-2)), ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), RESULT);
            }
          return CUP$SicHTML$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // tipo_poss_dar ::= tipo_poss_dar typo_poss 
            {
              Object RESULT =null;

              CUP$SicHTML$result = parser.getSymbolFactory().newSymbol("tipo_poss_dar",8, ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)), ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), RESULT);
            }
          return CUP$SicHTML$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // tipo_poss_dar ::= typo_poss 
            {
              Object RESULT =null;

              CUP$SicHTML$result = parser.getSymbolFactory().newSymbol("tipo_poss_dar",8, ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), RESULT);
            }
          return CUP$SicHTML$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // typo_poss ::= pos 
            {
              Object RESULT =null;

              CUP$SicHTML$result = parser.getSymbolFactory().newSymbol("typo_poss",9, ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), RESULT);
            }
          return CUP$SicHTML$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // typo_poss ::= INICIO_TYPE tipo_board FINAL_TYPE 
            {
              Object RESULT =null;

              CUP$SicHTML$result = parser.getSymbolFactory().newSymbol("typo_poss",9, ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-2)), ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), RESULT);
            }
          return CUP$SicHTML$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // NT$4 ::= 
            {
              Object RESULT =null;
typeSquare = ListSquare.HALL;
              CUP$SicHTML$result = parser.getSymbolFactory().newSymbol("NT$4",15, ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), RESULT);
            }
          return CUP$SicHTML$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // tipo_board ::= NT$4 HALL 
            {
              Object RESULT =null;
              // propagate RESULT from NT$4
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)).value;

              CUP$SicHTML$result = parser.getSymbolFactory().newSymbol("tipo_board",7, ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)), ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), RESULT);
            }
          return CUP$SicHTML$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // NT$5 ::= 
            {
              Object RESULT =null;
typeSquare = ListSquare.BRICK;
              CUP$SicHTML$result = parser.getSymbolFactory().newSymbol("NT$5",16, ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), RESULT);
            }
          return CUP$SicHTML$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // tipo_board ::= NT$5 BRICK 
            {
              Object RESULT =null;
              // propagate RESULT from NT$5
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)).value;

              CUP$SicHTML$result = parser.getSymbolFactory().newSymbol("tipo_board",7, ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)), ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), RESULT);
            }
          return CUP$SicHTML$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // bucle_color ::= bucle_color color 
            {
              Object RESULT =null;

              CUP$SicHTML$result = parser.getSymbolFactory().newSymbol("bucle_color",5, ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)), ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), RESULT);
            }
          return CUP$SicHTML$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // bucle_color ::= color 
            {
              Object RESULT =null;

              CUP$SicHTML$result = parser.getSymbolFactory().newSymbol("bucle_color",5, ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), RESULT);
            }
          return CUP$SicHTML$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // color ::= INICIO_BOX_COLOR COLOR FINAL_BOX_COLOR 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)).value;
		if(BOX_COLOR==null){BOX_COLOR = a;}else{System.out.println("Ya esta seleccionado BOX_COLOR");}
              CUP$SicHTML$result = parser.getSymbolFactory().newSymbol("color",4, ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-2)), ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), RESULT);
            }
          return CUP$SicHTML$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // color ::= INICIO_BOX_COLOR_ON COLOR FINAL_BOX_COLOR_ON 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)).value;
		if(BOX_ON_COLOR==null){BOX_ON_COLOR = a;}else{System.out.println("Ya esta seleccionado BOX_ON_COLOR");}
              CUP$SicHTML$result = parser.getSymbolFactory().newSymbol("color",4, ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-2)), ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), RESULT);
            }
          return CUP$SicHTML$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // color ::= INICIO_TARGET_COLOR COLOR FINAL_TARGET_COLOR 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)).value;
		if(TARGET_COLOR==null){TARGET_COLOR = a;}else{System.out.println("Ya esta seleccionado TARGET_COLOR");}
              CUP$SicHTML$result = parser.getSymbolFactory().newSymbol("color",4, ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-2)), ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), RESULT);
            }
          return CUP$SicHTML$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // color ::= INICIO_BRICK_COLOR COLOR FINAL_BRICK_COLOR 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)).value;
		if(BRICK_COLOR==null){BRICK_COLOR = a;}else{System.out.println("Ya esta seleccionado BRICK_COLOR");}
              CUP$SicHTML$result = parser.getSymbolFactory().newSymbol("color",4, ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-2)), ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), RESULT);
            }
          return CUP$SicHTML$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // color ::= INICIO_HALL_COLOR COLOR FINAL_HALL_COLOR 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)).value;
		if(HALL_COLOR==null){HALL_COLOR = a;}else{System.out.println("Ya esta seleccionado HALL_COLOR");}
              CUP$SicHTML$result = parser.getSymbolFactory().newSymbol("color",4, ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-2)), ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), RESULT);
            }
          return CUP$SicHTML$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // color ::= INICIO_UNDEFINED_COLOR COLOR FINAL_UNDEFINED_COLOR 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)).value;
		if(UNDEFINED_COLOR==null){UNDEFINED_COLOR = a;}else{System.out.println("Ya esta seleccionado UNDEFINED_COLOR");}
              CUP$SicHTML$result = parser.getSymbolFactory().newSymbol("color",4, ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-2)), ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), RESULT);
            }
          return CUP$SicHTML$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // color ::= INICIO_PLAYER_COLOR COLOR FINAL_PLAYER_COLOR 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-1)).value;
		if(PLAY_COLOR==null){PLAY_COLOR = a;}else{System.out.println("Ya esta seleccionado PLAY_COLOR");}
              CUP$SicHTML$result = parser.getSymbolFactory().newSymbol("color",4, ((java_cup.runtime.Symbol)CUP$SicHTML$stack.elementAt(CUP$SicHTML$top-2)), ((java_cup.runtime.Symbol)CUP$SicHTML$stack.peek()), RESULT);
            }
          return CUP$SicHTML$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$SicHTML$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$SicHTML$do_action(
    int                        CUP$SicHTML$act_num,
    java_cup.runtime.lr_parser CUP$SicHTML$parser,
    java.util.Stack            CUP$SicHTML$stack,
    int                        CUP$SicHTML$top)
    throws java.lang.Exception
    {
              return CUP$SicHTML$do_action_part00000000(
                               CUP$SicHTML$act_num,
                               CUP$SicHTML$parser,
                               CUP$SicHTML$stack,
                               CUP$SicHTML$top);
    }
}

}
