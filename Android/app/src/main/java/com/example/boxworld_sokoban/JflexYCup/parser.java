
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package com.example.boxworld_sokoban.JflexYCup;

import java_cup.runtime.*;
import java.util.ArrayList;
import com.example.boxworld_sokoban.juego.ListMovePlay;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\031\000\002\002\004\000\002\004\003\000\002\004" +
    "\002\000\002\005\004\000\002\005\003\000\002\006\003" +
    "\000\002\006\003\000\002\012\004\000\002\007\003\000" +
    "\002\007\003\000\002\007\003\000\002\007\003\000\002" +
    "\011\006\000\002\010\004\000\002\003\003\000\002\003" +
    "\003\000\002\002\005\000\002\002\005\000\002\002\005" +
    "\000\002\002\005\000\002\013\002\000\002\002\006\000" +
    "\002\002\003\000\002\002\003\000\002\002\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\046\000\016\002\uffff\015\016\016\005\017\011\020" +
    "\013\021\015\001\002\000\016\002\000\015\016\016\005" +
    "\017\011\020\013\021\015\001\002\000\004\011\ufff9\001" +
    "\002\000\016\002\ufffb\015\ufffb\016\ufffb\017\ufffb\020\ufffb" +
    "\021\ufffb\001\002\000\004\002\047\001\002\000\016\002" +
    "\ufffc\015\ufffc\016\ufffc\017\ufffc\020\ufffc\021\ufffc\001\002" +
    "\000\004\011\ufff8\001\002\000\016\002\ufffd\015\ufffd\016" +
    "\ufffd\017\ufffd\020\ufffd\021\ufffd\001\002\000\012\015\016" +
    "\016\005\017\011\021\015\001\002\000\004\011\020\001" +
    "\002\000\004\011\ufff7\001\002\000\004\011\ufff6\001\002" +
    "\000\016\002\ufffa\015\ufffa\016\ufffa\017\ufffa\020\ufffa\021" +
    "\ufffa\001\002\000\014\003\021\006\023\011\024\013\027" +
    "\014\025\001\002\000\004\012\ufff2\001\002\000\004\012" +
    "\044\001\002\000\004\013\043\001\002\000\012\006\023" +
    "\011\024\013\027\014\025\001\002\000\014\005\uffea\006" +
    "\uffea\007\uffea\010\uffea\012\uffea\001\002\000\014\005\032" +
    "\006\033\007\030\010\031\012\ufff3\001\002\000\014\005" +
    "\uffeb\006\uffeb\007\uffeb\010\uffeb\012\uffeb\001\002\000\012" +
    "\006\023\011\024\013\027\014\025\001\002\000\012\006" +
    "\023\011\024\013\027\014\025\001\002\000\012\006\023" +
    "\011\024\013\027\014\025\001\002\000\012\006\023\011" +
    "\024\013\027\014\025\001\002\000\014\005\ufff0\006\ufff0" +
    "\007\030\010\031\012\ufff0\001\002\000\014\005\ufff1\006" +
    "\ufff1\007\030\010\031\012\ufff1\001\002\000\014\005\uffee" +
    "\006\uffee\007\uffee\010\uffee\012\uffee\001\002\000\014\005" +
    "\uffef\006\uffef\007\uffef\010\uffef\012\uffef\001\002\000\014" +
    "\005\032\006\033\007\030\010\031\012\uffed\001\002\000" +
    "\004\012\042\001\002\000\014\005\uffec\006\uffec\007\uffec" +
    "\010\uffec\012\uffec\001\002\000\014\005\uffe9\006\uffe9\007" +
    "\uffe9\010\uffe9\012\uffe9\001\002\000\004\004\045\001\002" +
    "\000\016\002\ufff5\015\ufff5\016\ufff5\017\ufff5\020\ufff5\021" +
    "\ufff5\001\002\000\016\002\ufff4\015\ufff4\016\ufff4\017\ufff4" +
    "\020\ufff4\021\ufff4\001\002\000\004\002\001\001\002\000" +
    "\016\002\ufffe\015\ufffe\016\ufffe\017\ufffe\020\ufffe\021\ufffe" +
    "\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\046\000\016\004\006\005\003\006\011\007\013\010" +
    "\005\012\007\001\001\000\012\006\047\007\013\010\005" +
    "\012\007\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\007\013\012\045\001\001\000\004\011" +
    "\016\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\002\025\003\021\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\002\037" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\002\036\001\001\000\004\002\035\001\001" +
    "\000\004\002\034\001\001\000\004\002\033\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\013\040\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
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
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




	public parser(Lexema lexer) {
        super(lexer);
    }
            private ArrayList<ListMovePlay> listMove = new ArrayList<>();
            private ListMovePlay tipoMovimiento;
            private int contador;

            public ArrayList<ListMovePlay> getListMoveGame(){
                return this.listMove;
            }

        public void syntax_error(Symbol cur_token) {
        //System.out.println("El error es el simbolo: " + sym.terminalNames[cur_token.sym]);
        //System.out.println(String.format("En la posicion: %d, %d", cur_token.left, cur_token.right));
        }

        public void unrecovered_syntax_error(Symbol cur_token) {
            if (cur_token.sym == sym.EOF) {
             System.out.println("public void unrecoveredsyntax_error!!!!!!!!!!!!!!");
            }
        }
    /**
     * ***CODE*******
     */

    /**
     * ***END CODE*******
     */


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= inicio EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // inicio ::= mover 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("inicio",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // inicio ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("inicio",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // mover ::= mover tipo_mover 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("mover",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // mover ::= tipo_mover 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("mover",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // tipo_mover ::= agrupar 
            {
              Object RESULT =null;
		
                            if(contador< 0){
                                                    contador = contador * -1;
                                                    switch (tipoMovimiento){
                                                        case DOWN:
                                                            tipoMovimiento =  ListMovePlay.TOP;
                                                            break;
                                                        case TOP:
                                                            tipoMovimiento = ListMovePlay.DOWN;
                                                            break;
                                                        case RIGHT:
                                                            tipoMovimiento  = ListMovePlay.LEFT;
                                                            break;
                                                        case LEFT:
                                                            tipoMovimiento  = ListMovePlay.RIGHT;
                                                            break;
                                                        default:
                                                            // Default secuencia de sentencias.
                                                    }
                                                }
                                    for(int i = 0; i <contador; i++)
                                    {
                                        listMove.add(tipoMovimiento);
                                    }
    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipo_mover",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // tipo_mover ::= mover_caja 
            {
              Object RESULT =null;
		
            		switch (tipoMovimiento){
                        case DOWN:
                            tipoMovimiento = ListMovePlay.PUSH_DOWN;
                            break;
                        case TOP:
                            tipoMovimiento  = ListMovePlay.PUSH_TOP;
                            break;
                        case RIGHT:
                            tipoMovimiento  = ListMovePlay.PUSH_RIGHT;
                            break;
                        case LEFT:
                            tipoMovimiento  = ListMovePlay.PUSH_LEFT;
                            break;
                        default:
                            // Default secuencia de sentencias.
                    }
                   if(contador< 0){
                                           contador = contador * -1;
                                           switch (tipoMovimiento){
                                               case DOWN:
                                                   tipoMovimiento  = ListMovePlay.PUSH_TOP;
                                                   break;
                                               case TOP:
                                                   tipoMovimiento  = ListMovePlay.PUSH_DOWN;
                                                   break;
                                               case RIGHT:
                                                   tipoMovimiento = ListMovePlay.PUSH_LEFT;
                                                   break;
                                               case LEFT:
                                                   tipoMovimiento  = ListMovePlay.PUSH_RIGHT;
                                                   break;
                                               default:
                                                   // Default secuencia de sentencias.
                                           }
                                       }
                            for(int i = 0; i <contador; i++)
                            {
                                listMove.add(tipoMovimiento);
                            }
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipo_mover",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // agrupar ::= mover_jugador contador_mover 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("agrupar",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // mover_jugador ::= LEFT 
            {
              Object RESULT =null;
		
    tipoMovimiento = ListMovePlay.LEFT;
    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("mover_jugador",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // mover_jugador ::= RIGHT 
            {
              Object RESULT =null;
		
        tipoMovimiento = ListMovePlay.RIGHT;
    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("mover_jugador",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // mover_jugador ::= DOWN 
            {
              Object RESULT =null;
		
            tipoMovimiento = ListMovePlay.DOWN;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("mover_jugador",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // mover_jugador ::= UP 
            {
              Object RESULT =null;
		
            tipoMovimiento = ListMovePlay.TOP;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("mover_jugador",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // contador_mover ::= PARENTESIS_A j PARENTESIS_C PUNTOYCOMA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("contador_mover",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // mover_caja ::= PUSH agrupar 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("mover_caja",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // j ::= o 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
    RESULT = a;
    double numeroUno= Double.valueOf(a);
    contador = (int) numeroUno;
           
              CUP$parser$result = parser.getSymbolFactory().newSymbol("j",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // j ::= error 
            {
              String RESULT =null;
		
           
              CUP$parser$result = parser.getSymbolFactory().newSymbol("j",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // o ::= o SUMAR o 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                    double numeroUno= Double.valueOf(a);
                    double numeroDos= Double.valueOf(b);
                    double resultado = numeroUno+numeroDos;
                    RESULT = String.valueOf(resultado);
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("o",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // o ::= o RESTAR o 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                double numeroUno= Double.valueOf(a);
                double numeroDos= Double.valueOf(b);
                double resultado = numeroUno-numeroDos;
                RESULT = String.valueOf(resultado);
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("o",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // o ::= o DIVIDIR o 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                    double numeroUno= Double.valueOf(a);
                    double numeroDos= Double.valueOf(b);
                    double resultado = numeroUno/numeroDos;
                    RESULT = String.valueOf(resultado);
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("o",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // o ::= o MULTIPLICAR o 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                    double numeroUno= Double.valueOf(a);
                    double numeroDos= Double.valueOf(b);
                    double resultado = numeroUno*numeroDos;
                    RESULT = String.valueOf(resultado);
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("o",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // NT$0 ::= 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
 RESULT = a; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$0",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // o ::= PARENTESIS_A o NT$0 PARENTESIS_C 
            {
              String RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (String) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("o",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // o ::= ENTERO 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = a; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("o",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // o ::= DECIMAL 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = a; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("o",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // o ::= RESTAR ENTERO 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                    double numeroUno= Double.valueOf(a);
                    numeroUno = numeroUno*-1;
                    RESULT = String.valueOf(numeroUno);
 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("o",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
