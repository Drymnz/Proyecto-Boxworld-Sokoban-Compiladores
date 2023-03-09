/*primer seccion: codigo de usuario*/

package com.example.boxworld_sokoban.juego.JflexYCup.MovePlay;
import java_cup.runtime.*;

%%
/*segunda seccion: configuracion*/

%class Lexema
%unicode
%line
%column
%cup
%public
%{
    /*CODE*/
        public void print() {
            //System.out.println("\n<" + yytext() + "><Linea\"" + (yyline + 1) + "\">" + "<Columna\"" + yycolumn + "\">");
        }
    /*CODE*/
%}
ENTERO =[0-9]+
DECIMAL = {ENTERO}[.]{ENTERO}
espacio =[\r|\t|\f|\n|\s| ]+
%%

/*tercer seccion: reglase lexicas*/
/*INGNORAR*/
#.*[\n]?            {
                        //System.out.println("comentario"+this.yytext());
                    }
{espacio}           {/*nada*/}
/*SIMBOLOS DE PUNTUACION*/
";"                 {
                   print(); return new Symbol(sym.PUNTOYCOMA,yyline,yycolumn);

                    }
/*SIMBOLOS ARIMETICOS*/
"+"                 {
                   print(); return new Symbol(sym.SUMAR,yyline,yycolumn);

                    }
"-"                 {
                   print(); return new Symbol(sym.RESTAR,yyline,yycolumn);

                    }
"/"                 {
                   print(); return new Symbol(sym.DIVIDIR,yyline,yycolumn);

                    }
"*"                 {
                   print(); return new Symbol(sym.MULTIPLICAR,yyline,yycolumn);

                    }
/*SIMBOLOS DE AGRUPACION*/
"("                 {
                   print(); return new Symbol(sym.PARENTESIS_A,yyline,yycolumn);

                    }
")"                 {
                   print(); return new Symbol(sym.PARENTESIS_C,yyline,yycolumn);

                    }
/*PALABRAS RESERVADAS*/
"up"                {
                   print(); return new Symbol(sym.UP,yyline,yycolumn);

                    }
"down"              {
                   print(); return new Symbol(sym.DOWN,yyline,yycolumn);

                    }
"left"              {
                   print(); return new Symbol(sym.LEFT,yyline,yycolumn);

                    }
"right"              {
                   print(); return new Symbol(sym.RIGHT,yyline,yycolumn);

                    }
"push"              {
                   print(); return new Symbol(sym.PUSH,yyline,yycolumn);

                    }
/*Token*/
{ENTERO}            {
                   print(); return new Symbol(sym.ENTERO,yyline,yycolumn, (yytext()));

                    }
{DECIMAL}           {
                   print(); return new Symbol(sym.DECIMAL,yyline,yycolumn, (yytext()));

                    }
/*ERROR LEXICO*/
.                   {
                   print(); System.out.println("¡¡¡¡¡¡NO PERTENECE AL ALFABETO -> ERROR LEXICO!!!!!!!!!"+(yytext()));

                    }